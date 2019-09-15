package njupt.microcredit.service.impl;

import njupt.microcredit.dao.ICompanyDao;
import njupt.microcredit.dao.ICompanyInfoDao;
import njupt.microcredit.entity.Company;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 爬虫类
 *
 */
public class Spider {

    //自动注入
    private ICompanyDao companyDao;
	public void setCompanyDao(ICompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	private final String agent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.10 Safari/537.36";
	private final String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxNzgwNTAwNTc4OSIsImlhdCI6MTU1NzIwODU1NCwiZXhwIjoxNTg4NzQ0NTU0fQ.j-jcaPV15mMi2iaMx4bDwyArC6Hz_Og3BtaTqwpfmnXMk8atfD-cN4Q0fa7lHy1o66VLk8zBFybP3iNoRk1ftw";
	/**
     * 抓取天眼通搜索结果
     * @param key 关键词
     * @throws IOException
     */
    public String getSearch(String key) throws IOException{
    	long now = System.currentTimeMillis();
        String baseUri = "https://sp0.tianyancha.com/search/suggestV2.json?key="+key+"&_="+now;
        System.out.println(baseUri);
        Document doc = Jsoup.connect(baseUri)
                .userAgent(agent)
                .header("Referer","https://www.tianyancha.com/")
                .header("Accept","*/*")
                .header("Content-Type","application/json;charset=UTF-8")
                .header("Origin","https://www.tianyancha.com")
                .header("version"," TYC-Web")
                .header("X-Auth-Token",token)
                .timeout(30000)
                .ignoreContentType(true)
                .get();
        return doc.body().text();
    }

	/**
	 * 通过搜索页抓取天眼通搜索结果
	 * @param key 关键词
	 * @throws IOException
	 */
	public String getSearchByPage(String key) throws IOException{

		String baseUri = "https://www.tianyancha.com/search?key="+key;
		System.out.println(baseUri);
		Document doc = Jsoup.connect(baseUri)
				.userAgent(agent)
				.header("Referer","https://www.tianyancha.com/")
				.header("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
				.header("Host","www.tianyancha.com")
				.timeout(30000)
				.ignoreContentType(true)
				.get();

		System.out.println(doc.body().text());
		Elements hrefs = doc.select(".name.select-none");

		StringBuilder sb = new StringBuilder();
		sb.append("{\"state\":\"ok\",\"data\":[");
		for(Element element : hrefs){
			String name = element.select(".tyc-num.lh24").text();
			String[] href = element.attr("href").split("/");
			sb.append("{\"name\":\""+name+"\", \"id\":"+href[href.length-1]+"},");
			System.out.println(name+","+href[href.length-1]);
		}
		sb.append("]}");
		//System.out.println(sb.toString());
		return sb.toString();
	}


    
    /**
     * 抓取天眼通公司信息
     * @param commpanyId 公司id
     * @throws IOException
     */
    public Company queryCompany(String commpanyId) throws IOException, SQLException {

    	Company commpany = companyDao.selectByPrimaryKey(commpanyId);
    	if(commpany!=null){
    		System.out.println("query:"+commpany);
    		return commpany;
		}
		commpany = new Company();
    	String commpanyUrl = "https://www.tianyancha.com/company/" + commpanyId;
		System.out.println(commpanyUrl);
    	Document doc = Jsoup.connect(commpanyUrl)
    			 .userAgent(agent)
				 .header("Upgrade-Insecure-Requests","1")
				 .header("Host","www.tianyancha.com")
				 .header("X-Auth-Token",token)
				 .timeout(30000)
    			 .get();
		String name = doc.select(".name").first().text();
		String link = "暂无信息";
		try{
			link = doc.select("a.company-link").first().text();
		}catch (Exception e){
		}
		String address = "暂无信息";
		try{
			address = doc.select("#company_base_info_address").first().html();
		}catch (NullPointerException e){
		}
		String desc = "暂无信息";
		try{
			desc = doc.select("#company_base_info_detail").first().html();
		}catch (NullPointerException e){
		}

		Elements trs = doc.select(".table").get(2).select("tr");

		String capital = trs.get(0).select("td").get(1).select("div").attr("title");

		String state = trs.get(1).select("td:eq(1)").text();
		String registerNum = trs.get(1).select("td:eq(3)").text();

		String code = trs.get(2).select("td:eq(1)").text();
		String mechanism = trs.get(2).select("td:eq(3)").text();

		String taxpayer = trs.get(3).select("td:eq(1)").text();
		String type = trs.get(3).select("td:eq(3)").text();

		String term = trs.get(4).select("td:eq(1)").text();
		String industry = trs.get(4).select("td:eq(3)").text();

		String qualifications = trs.get(5).select("td:eq(1)").text();
		String date = trs.get(5).select("td:eq(3)").text();

		String paid = trs.get(6).select("td:eq(1)").text();
		String scale = trs.get(6).select("td:eq(3)").text();

		String number = trs.get(7).select("td:eq(1)").text();
		String authority = trs.get(7).select("td:eq(3)").text();

		commpany.setId(commpanyId);
		commpany.setLink(link);
		commpany.setQualifications(qualifications);
		commpany.setDate(date);
		commpany.setPaid(paid);
		commpany.setScale(scale);
		commpany.setNumber(number);
		commpany.setAuthority(authority);
		commpany.setAddress(address);
		commpany.setCapital(capital);
		commpany.setCode(code);
		commpany.setDesc(desc);
		commpany.setIndustry(industry);
		commpany.setState(state);
		commpany.setMechanism(mechanism);
		commpany.setName(name);
		commpany.setRegisterNum(registerNum);
		commpany.setTaxpayer(taxpayer);
		commpany.setTerm(term);
		commpany.setType(type);
		
		System.out.println(commpany);
		companyDao.insert(commpany);
		
		return commpany;


    }

}
