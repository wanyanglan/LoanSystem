package njupt.microcredit.entity;

import java.sql.Date;

/**
 * 贷款信息实体
 * @author wyl
 *
 */
public class LoanInfo {
	private int loanId;           //借款编号
	private String loanType;  	//贷款类型
	private String loanClass;	//贷款种类
	private String loanUse;		//贷款用途
	private double appliAmount;	//申请金额
	private int loanTerm;		//贷款期限（月）
	private double maxInstallment; 	//最大分期额
	private String guranteeMethod;	//担保方式
	private Date appliTime;   		//贷款申请时间
	private Date loanCreditDate;	//贷款放款时间
	private String loanRefuseType;	//贷款拒绝类型
	private String loanRefuseReason;//贷款拒绝理由
	private String loanRefuseRemark;	//贷款拒绝备注
	private Date loanRefuseDate;		//贷款拒绝时间
	private int loanRefuseUser;			//贷款拒绝人
	private String loanCollectState;	//贷款催收状态
	private String loanCollectDate;		//贷款催收日期
	private double loanRepayAmount;		//贷款应还款金额
	private Date loanRepayDate;			//贷款应还款日期
	private int loanBelongId;			//贷款归属人（银行客户经理）
	private String repaymentMode;		//还款方式
	private Boolean isDel;              //是否删除(1:true,0:false)
	private String loanAccountNo;		//贷款账户
	private double loanAccountAmount;	//贷款账户余额
	private double loanBalanceAmount;	//贷款余额
	private double loanProposeAmount;	//贷款建议金额
	private double loanCreditAmount;	//实际放款金额
	private String loanCreditNumber;	//放款合同号
	private Date updateDate;			//合同创建时间
	private int creditUser;				//创建用户
	private String clientName;			//客户姓名
	private int clientAge;					  //年龄
	private String phoneNumber;				  //手机号
	private String identifyType;			  //证件类型
	private String identifyNum;				  //证件号码
	private Date loanAuditDate;			//贷款审核时间
	private String appliReason;			//申请理由
	private ClientInfo clientInfoID;		//客户信息
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
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
	public String getLoanUse() {
		return loanUse;
	}
	public void setLoanUse(String loanUse) {
		this.loanUse = loanUse;
	}
	public double getAppliAmount() {
		return appliAmount;
	}
	public void setAppliAmount(double appliAmount) {
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
	public String getGuranteeMethod() {
		return guranteeMethod;
	}
	public void setGuranteeMethod(String guranteeMethod) {
		this.guranteeMethod = guranteeMethod;
	}
	public Date getAppliTime() {
		return appliTime;
	}
	public void setAppliTime(Date appliTime) {
		this.appliTime = appliTime;
	}
	public Date getLoanCreditDate() {
		return loanCreditDate;
	}
	public void setLoanCreditDate(Date loanCreditDate) {
		this.loanCreditDate = loanCreditDate;
	}
	public String getLoanRefuseType() {
		return loanRefuseType;
	}
	public void setLoanRefuseType(String loanRefuseType) {
		this.loanRefuseType = loanRefuseType;
	}
	public String getLoanRefuseReason() {
		return loanRefuseReason;
	}
	public void setLoanRefuseReason(String loanRefuseReason) {
		this.loanRefuseReason = loanRefuseReason;
	}
	public String getLoanRefuseRemark() {
		return loanRefuseRemark;
	}
	public void setLoanRefuseRemark(String loanRefuseRemark) {
		this.loanRefuseRemark = loanRefuseRemark;
	}
	public Date getLoanRefuseDate() {
		return loanRefuseDate;
	}
	public void setLoanRefuseDate(Date loanRefuseDate) {
		this.loanRefuseDate = loanRefuseDate;
	}
	public int getLoanRefuseUser() {
		return loanRefuseUser;
	}
	public void setLoanRefuseUser(int loanRefuseUser) {
		this.loanRefuseUser = loanRefuseUser;
	}
	public String getLoanCollectState() {
		return loanCollectState;
	}
	public void setLoanCollectState(String loanCollectState) {
		this.loanCollectState = loanCollectState;
	}
	public String getLoanCollectDate() {
		return loanCollectDate;
	}
	public void setLoanCollectDate(String loanCollectDate) {
		this.loanCollectDate = loanCollectDate;
	}
	public double getLoanRepayAmount() {
		return loanRepayAmount;
	}
	public void setLoanRepayAmount(double loanRepayAmount) {
		this.loanRepayAmount = loanRepayAmount;
	}
	public Date getLoanRepayDate() {
		return loanRepayDate;
	}
	public void setLoanRepayDate(Date loanRepayDate) {
		this.loanRepayDate = loanRepayDate;
	}
	public int getLoanBelongId() {
		return loanBelongId;
	}
	public void setLoanBelongId(int loanBelongId) {
		this.loanBelongId = loanBelongId;
	}
	public String getRepaymentMode() {
		return repaymentMode;
	}
	public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}
	public Boolean getIsDel() {
		return isDel;
	}
	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}
	public String getLoanAccountNo() {
		return loanAccountNo;
	}
	public void setLoanAccountNo(String loanAccountNo) {
		this.loanAccountNo = loanAccountNo;
	}
	public double getLoanAccountAmount() {
		return loanAccountAmount;
	}
	public void setLoanAccountAmount(double loanAccountAmount) {
		this.loanAccountAmount = loanAccountAmount;
	}
	public double getLoanBalanceAmount() {
		return loanBalanceAmount;
	}
	public void setLoanBalanceAmount(double loanBalanceAmount) {
		this.loanBalanceAmount = loanBalanceAmount;
	}
	public double getLoanProposeAmount() {
		return loanProposeAmount;
	}
	public void setLoanProposeAmount(double loanProposeAmount) {
		this.loanProposeAmount = loanProposeAmount;
	}
	public double getLoanCreditAmount() {
		return loanCreditAmount;
	}
	public void setLoanCreditAmount(double loanCreditAmount) {
		this.loanCreditAmount = loanCreditAmount;
	}
	public String getLoanCreditNumber() {
		return loanCreditNumber;
	}
	public void setLoanCreditNumber(String loanCreditNumber) {
		this.loanCreditNumber = loanCreditNumber;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getCreditUser() {
		return creditUser;
	}
	public void setCreditUser(int creditUser) {
		this.creditUser = creditUser;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getClientAge() {
		return clientAge;
	}
	public void setClientAge(int clientAge) {
		this.clientAge = clientAge;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public Date getLoanAuditDate() {
		return loanAuditDate;
	}
	public void setLoanAuditDate(Date loanAuditDate) {
		this.loanAuditDate = loanAuditDate;
	}
	public String getAppliReason() {
		return appliReason;
	}
	public void setAppliReason(String appliReason) {
		this.appliReason = appliReason;
	}
	public ClientInfo getClientInfoID() {
		return clientInfoID;
	}
	public void setClientInfoID(ClientInfo clientInfoID) {
		this.clientInfoID = clientInfoID;
	}
	@Override
	public String toString() {
		return "LoanInfo [loanId=" + loanId + ", loanType=" + loanType + ", loanClass=" + loanClass + ", loanUse="
				+ loanUse + ", appliAmount=" + appliAmount + ", loanTerm=" + loanTerm + ", maxInstallment="
				+ maxInstallment + ", guranteeMethod=" + guranteeMethod + ", appliTime=" + appliTime
				+ ", loanCreditDate=" + loanCreditDate + ", loanRefuseType=" + loanRefuseType + ", loanRefuseReason="
				+ loanRefuseReason + ", loanRefuseRemark=" + loanRefuseRemark + ", loanRefuseDate=" + loanRefuseDate
				+ ", loanRefuseUser=" + loanRefuseUser + ", loanCollectState=" + loanCollectState + ", loanCollectDate="
				+ loanCollectDate + ", loanRepayAmount=" + loanRepayAmount + ", loanRepayDate=" + loanRepayDate
				+ ", loanBelongId=" + loanBelongId + ", repaymentMode=" + repaymentMode + ", isDel=" + isDel
				+ ", loanAccountNo=" + loanAccountNo + ", loanAccountAmount=" + loanAccountAmount
				+ ", loanBalanceAmount=" + loanBalanceAmount + ", loanProposeAmount=" + loanProposeAmount
				+ ", loanCreditAmount=" + loanCreditAmount + ", loanCreditNumber=" + loanCreditNumber + ", updateDate="
				+ updateDate + ", creditUser=" + creditUser + ", clientName=" + clientName + ", clientAge=" + clientAge
				+ ", phoneNumber=" + phoneNumber + ", identifyType=" + identifyType + ", identifyNum=" + identifyNum
				+ ", loanAuditDate=" + loanAuditDate + ", appliReason=" + appliReason + ", clientInfoID=" + clientInfoID
				+ "]";
	}
	
	

}
