package njupt.microcredit.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import com.opensymphony.xwork2.ActionSupport;

import njupt.microcredit.entity.CustBasicInfo;
import njupt.microcredit.entity.CustomerInfo;
import njupt.microcredit.entity.LoanApplyInfo;
import njupt.microcredit.service.ICustBasicInfoService;
import njupt.microcredit.service.ICustomerInfoService;
import njupt.microcredit.service.ILoanApplyInfoService;

public class LoanAndClientAction extends ActionSupport implements RequestAware{
	
	//客户操作的id
	private Integer custId ;
	
	//操作客户信息
	/**
	 * 问题解决：
	 * 由于该实体类对象在jsp页面没有对应封装的实体属性，因此需要在后台主动新建对象出来，否则就会报错
	 */
	private CustBasicInfo custBasicInfo = new CustBasicInfo();
	public void setCustBasicInfo(CustBasicInfo custBasicInfo) {
		this.custBasicInfo = custBasicInfo;
	}
	public CustBasicInfo getCustBasicInfo() {
		return custBasicInfo;
	}
	
	//客户基本信息
	private CustomerInfo customerInfo;
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	
	//贷款信息
	private LoanApplyInfo loanApplyInfo;
	public void setLoanApplyInfo(LoanApplyInfo loanApplyInfo) {
		this.loanApplyInfo = loanApplyInfo;
	}
	public LoanApplyInfo getLoanApplyInfo() {
		return loanApplyInfo;
	}
	
	/********************注入service************************/
	private ICustBasicInfoService custBasicInfoService;
	public void setCustBasicInfoService(ICustBasicInfoService custBasicInfoService) {
		this.custBasicInfoService = custBasicInfoService;
	}
	
	private ICustomerInfoService customerInfoService;
	public void setCustomerInfoService(ICustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}
	
	private ILoanApplyInfoService loanApplyInfoService;
	public void setLoanApplyInfoService(ILoanApplyInfoService loanApplyInfoService) {
		this.loanApplyInfoService = loanApplyInfoService;
	}
	
	
	/**
	 * 1. 贷款信息展示
	 * @return
	 */
	public String loanPersonList() {
		
		//查询所有的贷款信息
		List<Object[]> loanList = loanApplyInfoService.getPersonList();
//		System.out.println(loanList);
		//保存贷款信息到request
		request.put("loanList",loanList);
		return "list";
	}
	
	/**
	 * 1.添加贷款申请页面
	 * @return
	 */
	public String viewAdd() {		
		return "add";
	}
	
	/**
	 * 2.添加贷款 - 添加贷款数据
	 * @return
	 */
	public String save() {
		//以当前时间作为表示客户的id
		custId = (int) new Date().getTime();
		
		/**
		 * 1.客户操作信息
		 */
		custBasicInfo.setCustId(custId);
		custBasicInfo.setCustomerType(1);
		custBasicInfo.setCreateDate(new Date());
		custBasicInfo.setCreateOr(2);
		custBasicInfoService.insert(custBasicInfo);
		
		/**
		 * 3.操作客户基本信息
		 */
		System.out.println(customerInfo);
		customerInfo.setCustId(custId);
		customerInfoService.insert(customerInfo);
		
		/**
		 * 2.1. 当前提交的时间就是申请的时间
		 * 2.2. 设置客户的基本信息用于显示
		 */		
		loanApplyInfo.setApplyTime(new Date());	
		loanApplyInfo.setCustName(customerInfo.getCustName());//设置个人申请姓名
		loanApplyInfo.setCustType(1);            //1.代表个人申请  2.代表企业申请
		loanApplyInfo.setCustId(custId);
		loanApplyInfo.setIdentifyType(customerInfo.getIdentifyType());
		loanApplyInfo.setIdentifyNum(customerInfo.getIdentifyNum());
		loanApplyInfo.setPhoneNum(customerInfo.getPhoneNum());
		loanApplyInfoService.insert(loanApplyInfo);
		
		return "listAction";
	}
	
	/**
	 * 2.1查看客户贷款信息
	 */
	public String viewClientLoanInfo(){
		//获取要查看的贷款记录id
		int loanId = loanApplyInfo.getLoanId();
//		System.out.println(loanId);
		
		//获取要查看客户信息记录的id
		int cust_id = customerInfo.getId();
//		System.out.println(cust_id);
		
		// 根据贷款的主键查询信息
		loanApplyInfo = loanApplyInfoService.selectByPrimaryKey(loanId);		
		
		//根据客户的主键查询信息
		customerInfo = customerInfoService.selectByPrimaryKey(cust_id);
		
		return "editClient";
	}
	
	/**
	 * 2.2修改客户数据 - 确认修改
	 */
	public String updateClientInfo() {	
		
	
		//更新客户信息
		customerInfoService.updateByPrimaryKey(customerInfo);
		
		//设置贷款部分信息
		loanApplyInfo.setCustName(customerInfo.getCustName());		
		loanApplyInfo.setPhoneNum(customerInfo.getPhoneNum());
		loanApplyInfo.setIdentifyType(customerInfo.getIdentifyType());
		loanApplyInfo.setIdentifyNum(customerInfo.getIdentifyNum());
		
		//更新贷款信息
		loanApplyInfoService.updateByPrimaryKey(loanApplyInfo);

		return "listAction";
	}
	
	//接收框架运行时候传入的request对象的map
	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;		
	}
	
	

}
