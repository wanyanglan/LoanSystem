package njupt.microcredit.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import njupt.microcredit.dao.ICompanyDao;
import njupt.microcredit.entity.Company;
import njupt.microcredit.service.ICustBasicInfoService;
import njupt.microcredit.service.impl.Spider;

public class CompanyAction extends ActionSupport implements RequestAware, ServletResponseAware {

	// 搜索词
	private String key;
	public void setKey(String key) {
		this.key = key;
	}
	
	private String commpanyId;
	public void setCommpanyId(String commpanyId) {
		this.commpanyId = commpanyId;
	}

	/******************** 注入service ************************/
	private Spider spider;
	public void setSpider(Spider spider) {
		this.spider = spider;
	}

	/**
	 * 1.进入搜索页面
	 */
	public String viewSearch() {
		return "viewSearch";
	}

	/**
	 * 2.异步搜索
	 */
	public String companySearch() throws Exception {
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		if (key != "" && key != null) {
			String result = spider.getSearch(key);
			PrintWriter pWriter = response.getWriter();
			pWriter.write(result);
		}
		return null;
	}
	
	/**
	 * 3.获取公司详情信息
	 */
	public String companyDesc() throws Exception {
		if (!("".equals(commpanyId)) && commpanyId != null && !("-1".equals(commpanyId))) {
            Company company = null;
            try {
                company = spider.queryCompany(commpanyId);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("company: "+company);
            request.put("company", company);
        }
		return "companyDesc";
	}

	// 接收框架运行时候传入的request对象的map
	private Map<String, Object> request;
	private HttpServletResponse response;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response = arg0;
	}

}
