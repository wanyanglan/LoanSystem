package njupt.microcredit.entity;

import java.sql.Date;

public class LoanAndClient {
	private int loanClientId;   //两张表的联合id
	private String loanType;  	//贷款类型
	private String loanClass;	//贷款种类
	private String guranteeMethod;	//担保方式
	private String loanUse;		//贷款用途
	private int appliAmount;	//申请金额
	private int loanTerm;		//贷款期限（月）
	private double maxInstallment; 	//最大分期额
	private String appliReason;			//申请理由
	private String clientInfoId;		//客户信息
	private String clientName;                //姓名
	private String clientGender;			  //性别
	private int clientAge;					  //年龄
	private Date clientBirthday;			  //出生日期
	private String phoneNumber;				  //手机号
	private String clientEmail;  			  //电子邮箱
	private String clientCensus;              //户籍
	private String clientEducation;			  //教育水平
	private String maritalStatus;			  //婚姻状况
	private String clentAddress;			  //家庭地址
	private int addrYears;					  //现址居住年限
	private String identifyType;			  //证件类型
	private String identifyNum;				  //证件号码
	
	
	
	public int getLoanClientId() {
		return loanClientId;
	}
	public void setLoanClientId(int loanClientId) {
		this.loanClientId = loanClientId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanClass() {
		return loanClass;
	}
	public void setLoanClass(String loanClass) {
		this.loanClass = loanClass;
	}
	public String getGuranteeMethod() {
		return guranteeMethod;
	}
	public void setGuranteeMethod(String guranteeMethod) {
		this.guranteeMethod = guranteeMethod;
	}
	public String getLoanUse() {
		return loanUse;
	}
	public void setLoanUse(String loanUse) {
		this.loanUse = loanUse;
	}
	
	
	public int getAppliAmount() {
		return appliAmount;
	}
	public void setAppliAmount(int appliAmount) {
		this.appliAmount = appliAmount;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public double getMaxInstallment() {
		return maxInstallment;
	}
	public void setMaxInstallment(double maxInstallment) {
		this.maxInstallment = maxInstallment;
	}
	public String getAppliReason() {
		return appliReason;
	}
	public void setAppliReason(String appliReason) {
		this.appliReason = appliReason;
	}
	public String getClientInfoId() {
		return clientInfoId;
	}
	public void setClientInfoId(String clientInfoId) {
		this.clientInfoId = clientInfoId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientGender() {
		return clientGender;
	}
	public void setClientGender(String clientGender) {
		this.clientGender = clientGender;
	}
	public int getClientAge() {
		return clientAge;
	}
	public void setClientAge(int clientAge) {
		this.clientAge = clientAge;
	}
	public Date getClientBirthday() {
		return clientBirthday;
	}
	public void setClientBirthday(Date clientBirthday) {
		this.clientBirthday = clientBirthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getClientCensus() {
		return clientCensus;
	}
	public void setClientCensus(String clientCensus) {
		this.clientCensus = clientCensus;
	}
	public String getClientEducation() {
		return clientEducation;
	}
	public void setClientEducation(String clientEducation) {
		this.clientEducation = clientEducation;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getClentAddress() {
		return clentAddress;
	}
	public void setClentAddress(String clentAddress) {
		this.clentAddress = clentAddress;
	}
	public int getAddrYears() {
		return addrYears;
	}
	public void setAddrYears(int addrYears) {
		this.addrYears = addrYears;
	}
	public String getIdentifyType() {
		return identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}
	public String getIdentifyNum() {
		return identifyNum;
	}
	public void setIdentifyNum(String identifyNum) {
		this.identifyNum = identifyNum;
	}
	@Override
	public String toString() {
		return "LoanAndClient [loanType=" + loanType + ", loanClass=" + loanClass + ", guranteeMethod=" + guranteeMethod
				+ ", loanUse=" + loanUse + ", appliAmount=" + appliAmount + ", loanTerm=" + loanTerm
				+ ", maxInstallment=" + maxInstallment + ", appliReason=" + appliReason + ", clientInfoId="
				+ clientInfoId + ", clientName=" + clientName + ", clientGender=" + clientGender + ", clientAge="
				+ clientAge + ", clientBirthday=" + clientBirthday + ", phoneNumber=" + phoneNumber + ", clientEmail="
				+ clientEmail + ", clientCensus=" + clientCensus + ", clientEducation=" + clientEducation
				+ ", maritalStatus=" + maritalStatus + ", clentAddress=" + clentAddress + ", addrYears=" + addrYears
				+ ", identifyType=" + identifyType + ", identifyNum=" + identifyNum + "]";
	}
	
	
}
