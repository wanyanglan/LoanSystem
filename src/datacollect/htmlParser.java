package datacollect;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import njupt.microcredit.entity.User;
import spider.GetUserList;

import java.util.ArrayList;


public class htmlParser{

    static ArrayList<User> list;
    private static Document doc;
    private static Elements users;
    public static ArrayList<User> parseUserlist(User user) throws Exception{
        Thread.sleep((long) (Math.random()*5000));
        String userlist=GetUserList.getUserList(user.getUserid());
        list=null;
        if(userlist!=null){
            list=new ArrayList<User>();
            doc=Jsoup.parse(userlist);
            users=doc.select("a[usercard]");  //jsuop的select方法获取到用户名数组

            for(Element nodeuser:users){  //遍历某用户的关注数组，将所有关注的人添加到list，这些人的rootuserid是某用户
                //System.out.println(nodeuser.toString());
                User u=new User();
                u.setUserid(nodeuser.attr("usercard").substring(3,13));  //usercard="id=xxxxxxx",所以截取3至13
                u.setUsername(nodeuser.text());
                u.setRootuserid(user.getUserid());  //rootuserid是用户上一层的用户，即关注此用户的用户
                list.add(u);
                //System.out.println(u.getUserid()+" "+u.getUsername());
            }
        }else {
            System.out.println(user.getUsername()+"没有关注任何人");
        }

        //System.out.println(users.toString());
        //System.out.println(list.get(1).getUsername());
        return list;
    }

    public static void main(String[] args) throws Exception{
        String userid="7018486054";
        //parseUserlist(userid);
    }

}