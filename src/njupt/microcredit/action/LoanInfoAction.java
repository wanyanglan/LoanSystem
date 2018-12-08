package njupt.microcredit.action;

import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import njupt.microcredit.entity.ClientInfo;
import njupt.microcredit.entity.LoanAndClient;
import njupt.microcredit.entity.LoanInfo;
import njupt.microcredit.service.IClientInfoService;
import njupt.microcredit.service.ILoanInfoService;

/**
 * 贷款模块的开发
 * 1.显示已有客户贷款信息
 * 2.添加客户的贷款信息
 * 3.修改贷款信息，或是个人信息
 * 4.查看详细信息
 * @author wyl
 *
 */
public class LoanInfoAction extends ActionSupport implements ModelDriven<LoanInfo>,RequestAware{

	/********************一、封装贷款数据*********************/
	private LoanInfo loanInfo = new LoanInfo();      //贷款数据
	public void setLoanInfo(LoanInfo loanInfo) {
		this.loanInfo = loanInfo;
	}
	public LoanInfo getLoanInfo() {
		return loanInfo;
	}
	
	//封装请求的客户信息id
	private int clientId;
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getClientId() {
		return clientId;
	}
	
	/**
	 * 封装客户数据
	 */
	private ClientInfo clientInfo = new ClientInfo();
	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}
	public ClientInfo getClientInfo() {
		return clientInfo;
	}
	
	private LoanAndClient loanAndClient = new LoanAndClient();
	public LoanAndClient getLoanAndClient() {
		return loanAndClient;
	}
	public void setLoanAndClient(LoanAndClient loanAndClient) {
		this.loanAndClient = loanAndClient;
	}
	
	
	//模型驱动
	@Override
	public LoanInfo getModel() {		
		return loanInfo;          //返回实例化后的对象
	}
	
	/********************二、注入Service*********************/
	//注入贷款service
	private ILoanInfoService loanInfoService;
	public void setLoanInfoService(ILoanInfoService loanInfoService) {
		this.loanInfoService = loanInfoService;
	}
	
	//注入客户Service
	private IClientInfoService clientInfoService;
	public void setClientInfoService(IClientInfoService clientInfoService) {
		this.clientInfoService = clientInfoService;
	}
	
	
	/**
	 * 1. 贷款信息展示
	 * @return
	 */
	public String loanList() {
		
		//查询所有的贷款信息
		List<LoanInfo> loanList = loanInfoService.getAll();
//		System.out.println(loanList);
		//保存贷款信息到request
		request.put("loanList",loanList);
		return "list";
	}
	
	/**
	 * 2.1查看客户贷款信息
	 */
	public String viewClientLoanInfo(){
		//获取要查看的贷款记录id
		int loanId = loanInfo.getLoanId();
		
		// 根据贷款的主键查询信息
		LoanInfo loanInfo = loanInfoService.findById(loanId);		
		
		//数据回显
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.pop();  //移除栈顶元素  
		vs.push(loanInfo); //入栈
		
		return "editClient";
	}
	
	/**
	 * 2.2修改客户数据 - 确认修改
	 */
	public String updateClientInfo() {	
		
	
		//更新客户信息
		clientInfoService.update(loanInfo.getClientInfoID());
		
		//设置贷款部分信息
		loanInfo.setClientName(loanInfo.getClientInfoID().getClientName());
		loanInfo.setClientAge(loanInfo.getClientInfoID().getClientAge());
		loanInfo.setPhoneNumber(loanInfo.getClientInfoID().getPhoneNumber());
		loanInfo.setIdentifyType(loanInfo.getClientInfoID().getIdentifyType());
		loanInfo.setIdentifyNum(loanInfo.getClientInfoID().getIdentifyNum());
		
		System.out.println(loanInfo);
		//更新贷款信息
		loanInfoService.update(loanInfo);
		
		System.out.println();
		return "listAction";
	}
	
	
	
	//接收框架运行时候传入的request对象的map
	private Map<String,Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
		
	}
	
	
	

}
