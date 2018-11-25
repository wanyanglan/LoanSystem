package njupt.microcredit.action;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import njupt.microcredit.entity.ClientInfo;
import njupt.microcredit.entity.LoanAndClient;
import njupt.microcredit.entity.LoanInfo;
import njupt.microcredit.service.IClientInfoService;
import njupt.microcredit.service.ILoanInfoService;

public class LoanClientAction extends ActionSupport implements ModelDriven<LoanAndClient>,RequestAware{

	private LoanAndClient loanAndClient = new LoanAndClient();
	public LoanAndClient getLoanAndClient() {
		return loanAndClient;
	}
	public void setLoanAndClient(LoanAndClient loanAndClient) {
		this.loanAndClient = loanAndClient;
	}
	
	//接收框架运行时候传入的request对象的map
	private Map<String,Object> request;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = request;		
	}
	@Override
	public LoanAndClient getModel() {		
		return loanAndClient;
	}
	
	//实例化贷款信息，客户信息
	private ClientInfo clientInfo = new ClientInfo();	
	private LoanInfo loanInfo = new LoanInfo();
	
	
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
		
		//封装客户的数据
		clientInfo.setClientName(loanAndClient.getClientName());
		clientInfo.setClientGender(loanAndClient.getClientGender());
		clientInfo.setClientAge(loanAndClient.getClientAge());
		clientInfo.setClientBirthday(loanAndClient.getClientBirthday());
		clientInfo.setPhoneNumber(loanAndClient.getPhoneNumber());
		clientInfo.setClientEmail(loanAndClient.getClientEmail());
		clientInfo.setClientCensus(loanAndClient.getClientCensus());
		clientInfo.setClientEducation(loanAndClient.getClientEducation());
		clientInfo.setMaritalStatus(loanAndClient.getMaritalStatus());
		clientInfo.setClentAddress(loanAndClient.getClentAddress());
		clientInfo.setAddrYears(loanAndClient.getAddrYears());
		clientInfo.setIdentifyType(loanAndClient.getIdentifyType());
		clientInfo.setIdentifyNum(loanAndClient.getIdentifyNum());
		
		// 封装贷款的数据
		loanInfo.setLoanType(loanAndClient.getLoanType());
		loanInfo.setAppliTime(new Date());
		loanInfo.setLoanClass(loanAndClient.getLoanClass());
		loanInfo.setGuranteeMethod(loanAndClient.getGuranteeMethod());
		loanInfo.setLoanUse(loanAndClient.getLoanUse());
		loanInfo.setAppliAmount(loanAndClient.getAppliAmount());
		loanInfo.setLoanTerm(loanAndClient.getLoanTerm());
		loanInfo.setMaxInstallment(loanAndClient.getMaxInstallment());
		loanInfo.setAppliReason(loanAndClient.getAppliReason());
		loanInfo.setClientName(loanAndClient.getClientName());
		loanInfo.setClientAge(loanAndClient.getClientAge());
		loanInfo.setPhoneNumber(loanAndClient.getPhoneNumber());
		loanInfo.setIdentifyType(loanAndClient.getIdentifyType());
		loanInfo.setIdentifyNum(loanAndClient.getIdentifyNum());		
		loanInfo.setClientInfoID(clientInfo); 			//将客户信息对应到贷款信息里面
		
		if(clientInfo != null) {
			clientInfoService.save(clientInfo);
		}
		if(loanInfo != null) {
			loanInfoService.save(loanInfo);
		}		
		return "listAction";
	}
	

	

}
