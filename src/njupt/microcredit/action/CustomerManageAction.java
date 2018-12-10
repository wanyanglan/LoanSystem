package njupt.microcredit.action;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import njupt.microcredit.entity.BusinessInfo;
import njupt.microcredit.entity.CompanyInfo;
import njupt.microcredit.entity.CustBasicInfo;
import njupt.microcredit.entity.CustomerInfo;
import njupt.microcredit.entity.LegalPersonInfo;
import njupt.microcredit.service.IBusinessInfoService;
import njupt.microcredit.service.ICompanyInfoService;
import njupt.microcredit.service.ICustBasicInfoService;
import njupt.microcredit.service.ICustomerInfoService;
import njupt.microcredit.service.ILegalPersonInfoService;

public class CustomerManageAction extends ActionSupport implements RequestAware{

	/**
	 * 封装操作的实体对象
	 */
	private CustBasicInfo custBasicInfo = new CustBasicInfo();
	public void setCustBasicInfo(CustBasicInfo custBasicInfo) {
		this.custBasicInfo = custBasicInfo;
	}
	public CustBasicInfo getCustBasicInfo() {
		return custBasicInfo;
	}
	
	private CustomerInfo customerInfo;
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	
	private CompanyInfo companyInfo;
	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}
	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}
	
	private BusinessInfo businessInfo;
	public void setBusinessInfo(BusinessInfo businessInfo) {
		this.businessInfo = businessInfo;
	}
	public BusinessInfo getBusinessInfo() {
		return businessInfo;
	}
	
	private LegalPersonInfo legalPersonInfo;
	public void setLegalPersonInfo(LegalPersonInfo legalPersonInfo) {
		this.legalPersonInfo = legalPersonInfo;
	}
	public LegalPersonInfo getLegalPersonInfo() {
		return legalPersonInfo;
	}
	
	/*******************注入Service**********************/
	private ICustBasicInfoService custBasicInfoService;
	public void setCustBasicInfoService(ICustBasicInfoService custBasicInfoService) {
		this.custBasicInfoService = custBasicInfoService;
	}
	
	private ICustomerInfoService customerInfoService;
	public void setCustomerInfoService(ICustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}
	
	private ICompanyInfoService companyInfoService;
	public void setCompanyInfoService(ICompanyInfoService companyInfoService) {
		this.companyInfoService = companyInfoService;
	}
	
	private ILegalPersonInfoService legalPersonInfoService;
	public void setLegalPersonInfoService(ILegalPersonInfoService legalPersonInfoService) {
		this.legalPersonInfoService = legalPersonInfoService;
	}
	
	private IBusinessInfoService businessInfoService;
	public void setBusinessInfoService(IBusinessInfoService businessInfoService) {
		this.businessInfoService = businessInfoService;
	}
	
	
	/************个人贷款信息操作者显示**************/
	
	public String privateCustomer() {
		
		List<Object[]> privateList = customerInfoService.selectByOtherInfo();
		
		request.put("privateList", privateList);
		
		return "privateList";
		
	}
	
	/**
	 * 模糊查询寻找单个或同类客户信息
	 * @return
	 */
	public String searchResult() {
		
		
		HttpServletRequest req = ServletActionContext.getRequest();
		String firstCondition = req.getParameter("firstCondition");
		String phoneNum = req.getParameter("phoneNum");
		
		//打印语句看是否搜得到
		System.out.println(firstCondition+" "+phoneNum);
		
		//去除传入的参数前后的空格
		firstCondition = firstCondition.trim();
		phoneNum = phoneNum.trim();	
		
		//执行查询
		List<Object[]> privateList = customerInfoService.selectFuzzyQuery(firstCondition, phoneNum);
		
		System.out.println(privateList.size());
		request.put("privateList", privateList);
		return "searchList";
	}
	
	
	/************企业贷款信息操作者显示**************/
	public String publicCustomer() {
		List<Object[]> publicList = companyInfoService.selectOtherCompanyInfo();
		
		request.put("publicList", publicList);
		
		return "publicList";
	}
	/**
	 * 模糊查询寻找单个或同类企业客户信息
	 * @return
	 */
	public String searchPublicResult() {
		//获取jsp页面传输的内容
		HttpServletRequest req = ServletActionContext.getRequest();
		String companyName = req.getParameter("companyName").trim();
		String licenseNum = req.getParameter("licenseNum").trim();
		String legalPerson = req.getParameter("legalPerson").trim();
		
		List<Object[]> publicList = companyInfoService.selectFuzzyQuery(companyName, licenseNum, legalPerson);
		request.put("publicList", publicList);
		return "publicResult";
	}
	
	
	//接收框架运行时传入的request的Map集合
	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;	
	}

}
