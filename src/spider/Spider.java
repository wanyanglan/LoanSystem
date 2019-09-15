package spider;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spider {
    //http://weibo.com/p/1005057018486054  访问个人主页
    //http://weibo.com/p/1005057018486054/info?mod=pedit_more //个人信息页面
    //http://weibo.com/p/1005057018486054/follow?&page=3  翻页

    //抓取对关注的关注
    //http://weibo.com/p/100505"+用户ID+"/follow?&page=3


    //需要根据浏览器抓包来替换自己的微博账号的cookies


    private static String cookies="SINAGLOBAL=7848906612178.57.1551695099506; login_sid_t=4727969280e11b74eac2c0ee9e3d7ecc; cross_origin_proto=SSL; Ugrow-G0=d52660735d1ea4ed313e0beb68c05fc5; WBStorage=ce875ff0f41a253d|undefined; YF-V5-G0=d30fd7265234f674761ebc75febc3a9f; wb_view_log=1920*10801; _s_tentry=www.google.com.hk; UOR=www.njupt.edu.cn,widget.weibo.com,www.google.com.hk; Apache=9272334507888.441.1560307662984; ULV=1560307662997:2:1:1:9272334507888.441.1560307662984:1551695099520; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9WFp39jZuxlZlYkIec-O2uxC5JpX5K2hUgL.FoM7eKMpS02fS0n2dJLoIp7LxKML1KBLBKnLxKqL1hnLBoMNeh2NeKMpSKMR; ALF=1591843686; SSOLoginState=1560307688; SCF=AuI5rZSaPQQPPbIEg8kXggROdTCsuocbBLr9Tzlj6Biok67RpG_gwACoy7uSmT8pRu4rAAo5CnJ4gpYeKO9Ww_o.; SUB=_2A25wBBe4DeRhGeFO6lUQ9y_JzDSIHXVTcA5wrDV8PUNbmtBeLUXWkW9NQZBpAXfx2sSgpFbo3gLT8Qteh8gHE1ux; SUHB=0auAJybEIpieuz; un=17156737680; wvr=6; wb_view_log_7017171578=1920*10801; YF-Page-G0=aac25801fada32565f5c5e59c7bd227b|1560307737|1560307703; webim_unReadCount=%7B%22time%22%3A1560307741814%2C%22dm_pub_total%22%3A1%2C%22chat_group_pc%22%3A0%2C%22allcountNum%22%3A34%2C%22msgbox%22%3A0%7D";
//    private static String userAgent="Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.87 Safari/537.36";
    private static List<String> userAgents = new ArrayList<String>(){{
       add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.87 Safari/537.36");
       add("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.13; ko; rv:1.9.1b2) Gecko/20081201 Firefox/60.0");
       add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/7.0.3 Safari/7046A194A");
       add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.1 Safari/537.36");
        add("Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.93 Safari/537.36");
        add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:52.59.12) Gecko/20160044 Firefox/52.59.12");
        add("Galaxy/1.0 [en] (Mac OS X 10.5.6; U; en)");
        add("Opera/9.80 (Macintosh; Intel Mac OS X 10.14.1) Presto/2.12.388 Version/12.16");
        add("Opera/12.80 (Windows NT 5.1; U; en) Presto/2.10.289 Version/12.02");
        add("Mozilla/5.0 (Windows; U; Windows NT 6.1; rv:2.2) Gecko/20110201");
        add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0; Avant Browser; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0)");
        add("Mozilla/5.0 (Windows NT 6.4; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2225.0 Safari/537.36");
    }};
    //获取页面源码
    public static String getHtml(String url) throws Exception{

        String html=null;
        OkHttpClient client=new OkHttpClient().newBuilder().connectTimeout(50000, TimeUnit.MILLISECONDS)
                .readTimeout(50000, TimeUnit.MILLISECONDS)
                .build();   //同步get请求

        Request request=new Request.Builder()      //构造Request对象
                .url(url)                             //默认get请求，可不写
                .addHeader("Cookie",cookies)
                .addHeader("Host", "weibo.com")
                .addHeader("User-Agent",userAgents.get((int)(Math.random()*userAgents.size())))   //自定义请求头
                .build();
        Response response=client.newCall(request).execute();     //提交请求

        if(response.isSuccessful()){
            html=response.body().string().replace("\\", "");
            Document doc=Jsoup.parse(html);
            Elements scripts = doc.getElementsByTag("script"); //通过标签名获取script标签

            //System.out.println(script.html());
            Pattern p=Pattern.compile("\"html\":\"");    //正则，从该json数据格式中抽取出html内容
            String htmlstr="";
            for(Element script:scripts){
                Matcher m=p.matcher(html=script.html());
                if(m.find()){
                    String str=html.substring(m.end(),html.length()-3);
                    htmlstr+=str;
                }
            }

            html=Jsoup.parse(htmlstr).html();
            //System.out.println(html);


        }
        else{
            System.out.println("Network is error");
        }

        return html;
    }





    //测试
    public static void main(String[] args) throws Exception{
        getHtml("http://weibo.com/p/1005057018486054/info?mod=pedit_more");
    }

}