package DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import njupt.microcredit.entity.UserInfo;

public class DbUtil {
    public static Connection getConn() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/weibo","root","123456");
        return conn;
    }

    public static void closeConn(Connection conn) throws Exception{
        if(conn!=null){
            conn.close();
            conn=null;
        }
    }
    public static void closeRs(ResultSet rs) throws Exception{
        if(rs!=null){
            rs.close();
            rs=null;
        }
    }
    public List<UserInfo> getUserinfo(String sql) throws Exception{
		List<UserInfo> lst=new ArrayList<UserInfo>();
		Connection conn=getConn();
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				UserInfo userinfo=new UserInfo();
				userinfo.setId(rs.getInt("id"));
				userinfo.setUserid(rs.getString("userid"));
				userinfo.setUsername(rs.getString("username"));
				userinfo.setAddress(rs.getString("address"));
				userinfo.setGender(rs.getString("gender"));
				userinfo.setSexual(rs.getString("sexual"));
				userinfo.setRelationship(rs.getString("Relationship"));
				userinfo.setBirthday(rs.getString("birthday"));
				userinfo.setCollege(rs.getString("college"));
				userinfo.setMiddlesch(rs.getString("middlesch"));
				userinfo.setBlood(rs.getString("blood"));
				userinfo.setProfile(rs.getString("profile"));
				userinfo.setRegistertime(rs.getString("registertime"));
				userinfo.setEmail(rs.getString("email"));
				userinfo.setQq(rs.getString("qq"));
				userinfo.setTag(rs.getString("tag"));
				lst.add(userinfo);
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}finally {
			if(conn!=null) {
				conn.close();
			}
		}
		return lst;
	}
    public static void main(String[] args){
        //DbUtil dbUtil=new DbUtil();
        try {
            getConn();
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据库连接失败!");
        }
    }
}
