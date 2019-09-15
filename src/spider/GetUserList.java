package spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class GetUserList {
    static String lists;
//    private static String url;
    private static ArrayList<String> urls;
    private static Document doc;
    private static Elements W_pages;
    private static Elements pages=null;
    private static Document docnext;
    private static Elements followUsersnext;
    private static int pageCount=0;
    public static String getUserList(String userid) throws Exception{
        lists = null;
//        url="http://weibo.com/p/100505"+userid+"/follow?page=";
        urls=new ArrayList<String>(){{
            add("http://weibo.com/p/100505"+userid+"/follow?page=");
            add("http://weibo.com/p/100306"+userid+"/follow?page=");
        }};
        String chtml = null;
        String curl = null;
        for (String url : urls) {
            chtml = Spider.getHtml(url+"1");
            if (Jsoup.parse(chtml).getElementsByAttributeValue("class", "W_pages").first()!= null) {
                curl = url;
                break;
            }
        }
        doc=Jsoup.parse(chtml);
        W_pages=doc.getElementsByAttributeValue("class", "W_pages");  //获取关注列表页数div源码

        if(W_pages.first()!=null){
            pages = W_pages.first().getElementsByAttributeValue("class", "page S_txt1");
            //System.out.println(pages.size());
            pageCount=Integer.parseInt(pages.get(pages.size()-1).text());	//关注列表总页数
            System.out.println("已估计下一个用户关注列表总页数："+pageCount);
            for(int i=1;i<=pageCount+1;i++){
                docnext=Jsoup.parse(Spider.getHtml(curl+i));
                followUsersnext=docnext.getElementsByAttributeValue("class", "S_txt1");//关注列表当页的用户队列
                lists+=followUsersnext.toString();  //关注的用户总队列
                //lists+=followUsersnext.toString().replace("id=", "").replace("&amp;refer_flag=1005050006_", "");
            }
        }else {
            System.out.println("======查询下一个用户======");
        }

        return lists;
    }

    public static void main(String[] args) throws Exception{
        String userid="7017171578";
        getUserList(userid);
    }
}