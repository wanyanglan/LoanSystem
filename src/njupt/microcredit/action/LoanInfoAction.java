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
//		System.out.println(loanId);
		
		// 根据贷款的主键查询信息
		LoanInfo loanInfo = loanInfoService.findById(loanId);
		
		//根据贷款的信息查询客户的信息
		ClientInfo clientInfo = loanInfo.getClientInfoID();
		
//		//数据回显
//		ValueStack vStack = ActionContext.getContext().getValueStack();
//		vStack.pop();    //移除栈顶元素
//		vStack.push(loanInfo);   //入站
		
		//保存贷款数据
		request.put("loanInfo", loanInfo);
		
		return "editClient";
	}
	
	/**
	 * 2.2修改客户数据
	 */
	public String updateClientInfo() {
		//根据客户id,查询客户对象；设置到员工属性中
		ClientInfo clientInfo = clientInfoService.findById(clientId);
		
		//更新客户信息
		clientInfoService.update(clientInfo);
//		loanInfo.setClientInfoID(clientInfo);
//		
//		//更新贷款信息
//		loanInfoService.update(loanInfo);
		return "listAction";
	}
	
	
	
	//接收框架运行时候传入的request对象的map
	private Map<String,Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
		
	}
	
	
	

}
