package njupt.microcredit.action;

import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

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

	/********************一、封装数据*********************/
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
		//保存到request
		request.put("loanList",loanList);
		return "list";
	}
	
	
	
	//接收框架运行时候传入的request对象的map
	private Map<String,Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
		
	}
	
	
	

}
