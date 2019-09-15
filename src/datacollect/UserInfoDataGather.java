package datacollect;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DbUtil.DbUtil;
import njupt.microcredit.entity.User;
import njupt.microcredit.entity.UserInfo;
import spider.GetUserInfo;

public class UserInfoDataGather {
    public static void main(String[] args) throws Exception{
        Connection conn=DbUtil.getConn();
        //	SpiderUserInfo(conn);
        DbUtil.closeConn(conn);
    }

    public static void SpiderUserInfo(Connection conn,int start,int count) throws Exception{
        String sql="SELECT * from t_userlist where infostored=0 limit ";
        List<User> rootusers=selectUserID(conn, sql+start+","+count);
        InsertUserInfo(conn, rootusers);
    }
    //=========
    //查询用户
    private static List<User> selectUserID(Connection conn,String sql) throws Exception{
        List<User> list=new ArrayList<User>();

        PreparedStatement psmt=conn.prepareStatement(sql);
        ResultSet rs=psmt.executeQuery();
        while(rs.next()){
            User u=new User();
            u.setId(rs.getInt("id"));
            u.setUserid(rs.getString("userid"));
            u.setUsername(rs.getString("username"));

            list.add(u);
        }
        DbUtil.closeRs(rs);
        //DbUtil.closeConn(conn);
        return list;
    }
    //将新的用户信息插入到数据库中
    private static void InsertUserInfo(Connection conn,List<User> rootusers) throws Exception{
        String sql="insert into t_userinfo"
                + "(userid,username,address,gender,sexual,Relationship,birthday,college,middlesch,blood,profile,registertime,email,qq,tag) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        String sqluserinfostored="SELECT * from t_userinfo where userid=";
        UserInfo userInfo=null;
        User user=null;
        PreparedStatement psmt=null;
        PreparedStatement ps=null;
        String sqlupdate="update t_userlist set infostored=1 where userid=?";
        int stored=0;
        for(int i=0;i<rootusers.size();i++){
            user=rootusers.get(i);//开始遍历的用户
            Thread.sleep((long) (Math.random()*5000));
            userInfo=GetUserInfo.getUserInfo(user.getUserid());

            ps=conn.prepareStatement(sqlupdate);
            ps.setString(1,user.getUserid());
            ps.executeUpdate();
            ps.close();
            if(userInfo!=null){
                psmt=conn.prepareStatement(sql);
                psmt.setString(1, user.getUserid());
                psmt.setString(2, userInfo.getUsername());
                psmt.setString(3, userInfo.getAddress());
                psmt.setString(4, userInfo.getGender());
                psmt.setString(5, userInfo.getSexual());
                psmt.setString(6, userInfo.getRelationship());
                psmt.setString(7, userInfo.getBirthday());
                psmt.setString(8, userInfo.getCollege());
                psmt.setString(9, userInfo.getMiddlesch());
//                psmt.setString(10,userInfo.getBlog());
                psmt.setString(10,userInfo.getBlood());
                psmt.setString(11,userInfo.getProfile());
//                psmt.setString(13,userInfo.getPersonaldomain());
                psmt.setString(12,userInfo.getRegistertime() );
                psmt.setString(13,userInfo.getEmail());
                psmt.setString(14,userInfo.getQq());
                psmt.setString(15, userInfo.getTag());

                stored=selectUserID(conn, sqluserinfostored+"'"+user.getUserid()+"'").size();
                if(stored!=0||userInfo.getUsername()==null){
                    continue;
                }
                else {
                    psmt.executeUpdate();
                    psmt.close();
                }

            }else {
                continue;
            }
            System.out.println("插入"+userInfo.getUsername()+"个人信息成功！");
        }

    }
}
