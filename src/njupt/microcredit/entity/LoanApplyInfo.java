package njupt.microcredit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 贷款申请信息
 * @author wyl
 *
 */
public class LoanApplyInfo implements Serializable {
    /**
     * 贷款id
     */
    private Integer loanId;

    /**
     * 贷款类型
     */
    private String loanType;

    /**
     * 贷款种类
     */
    private String loanClass;

    /**
     * 贷款用途
     */
    private String loanUse;

    /**
     * 申请金额
     */
    private BigDecimal applyAmount;

    /**
     * 贷款期限(月)
     */
    private Integer loanTerm;

    /**
     * 最大分期额
     */
    private BigDecimal maxInstallment;

    /**
     * 担保方式
     */
    private String guranteeMethod;

    /**
     * 贷款申请时间
     */
    private Date applyTime;
    
    /**
     * 贷款申请理由
     */
    private String appliReason;

    public String getAppliReason() {
		return appliReason;
	}

	public void setAppliReason(String appliReason) {
		this.appliReason = appliReason;
	}

	

	/**
     * 贷款放款时间
     */
    private Date loanCreditDate;

    /**
     * 贷款阶段
     */
    private String loanStage;

    /**
     * 贷款拒绝理由
     */
    private String loanRefuseReason;

    /**
     * 贷款拒绝备注
     */
    private String loanRefuseRemark;

    /**
     * 贷款拒绝时间
     */
    private Date loanRefuseDate;

    /**
     * 贷款拒绝人
     */
    private Integer loanRefuseUser;

    /**
     * 贷款催收状态
     */
    private String loanCollectionState;

    /**
     * 贷款催收日期
     */
    private Date loanCollectionDate;

    /**
     * 贷款应还款金额
     */
    private BigDecimal loanRepayAmount;

    /**
     * 贷款应还款日期
     */
    private Date loanRepayDate;

    /**
     * 贷款归属人
     */
    private Integer loanBelongId;

    /**
     * 还款方式
     */
    private String repaymentMode;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 贷款账户
     */
    private String loanAccountNo;

    /**
     * 贷款账户余额
     */
    private BigDecimal loanAccountAmount;

    /**
     * 贷款余额
     */
    private BigDecimal loanBalanceAmount;

    /**
     * 贷款建议金额
     */
    private BigDecimal loanProposeAmount;

    /**
     * 实际放款金额
     */
    private BigDecimal loanCreditAmount;

    /**
     * 放款合同号
     */
    private String loanContractNumber;

    /**
     * 客户姓名
     */
    private String custName;

    /**
     * 客户类型
     */
    private Integer custType;

    /**
     * 客户ID
     */
    private Integer custId;

    /**
     * 证件类型
     */
    private String identifyType;

    /**
     * 证件号码
     */
    private String identifyNum;

    /**
     * 联系电话
     */
    private String phoneNum;

    /**
     * 贷款审合时间
     */
    private Date loanAuditDate;

    /**
     * 抵质押物编号
     */
    private String pledgeInfoId;

    /**
     * 创建时间
     */
    private Date updateDate;

    /**
     * 创建用户
     */
    private Integer createUser;

    /**
     * loan_apply_info
     */
    private static final long serialVersionUID = 1L;

    /**
     * 贷款id
     * @return LOAN_ID 贷款id
     */
    public Integer getLoanId() {
        return loanId;
    }

    /**
     * 贷款id
     * @param loanId 贷款id
     */
    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    /**
     * 贷款类型
     * @return LOAN_TYPE 贷款类型
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * 贷款类型
     * @param loanType 贷款类型
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    /**
     * 贷款种类
     * @return LOAN_CLASS 贷款种类
     */
    public String getLoanClass() {
        return loanClass;
    }

    /**
     * 贷款种类
     * @param loanClass 贷款种类
     */
    public void setLoanClass(String loanClass) {
        this.loanClass = loanClass == null ? null : loanClass.trim();
    }

    /**
     * 贷款用途
     * @return LOAN_USE 贷款用途
     */
    public String getLoanUse() {
        return loanUse;
    }

    /**
     * 贷款用途
     * @param loanUse 贷款用途
     */
    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse == null ? null : loanUse.trim();
    }

    /**
     * 申请金额
     * @return APPLY_AMOUNT 申请金额
     */
    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    /**
     * 申请金额
     * @param applyAmount 申请金额
     */
    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    /**
     * 贷款期限(月)
     * @return LOAN_TERM 贷款期限(月)
     */
    public Integer getLoanTerm() {
        return loanTerm;
    }

    /**
     * 贷款期限(月)
     * @param loanTerm 贷款期限(月)
     */
    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * 最大分期额
     * @return MAX_INSTALLMENT 最大分期额
     */
    public BigDecimal getMaxInstallment() {
        return maxInstallment;
    }

    /**
     * 最大分期额
     * @param maxInstallment 最大分期额
     */
    public void setMaxInstallment(BigDecimal maxInstallment) {
        this.maxInstallment = maxInstallment;
    }

    /**
     * 担保方式
     * @return GURANTEE_METHOD 担保方式
     */
    public String getGuranteeMethod() {
        return guranteeMethod;
    }

    /**
     * 担保方式
     * @param guranteeMethod 担保方式
     */
    public void setGuranteeMethod(String guranteeMethod) {
        this.guranteeMethod = guranteeMethod == null ? null : guranteeMethod.trim();
    }

    /**
     * 贷款申请时间
     * @return APPLY_TIME 贷款申请时间
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 贷款申请时间
     * @param applyTime 贷款申请时间
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 贷款放款时间
     * @return LOAN_CREDIT_DATE 贷款放款时间
     */
    public Date getLoanCreditDate() {
        return loanCreditDate;
    }

    /**
     * 贷款放款时间
     * @param loanCreditDate 贷款放款时间
     */
    public void setLoanCreditDate(Date loanCreditDate) {
        this.loanCreditDate = loanCreditDate;
    }

    /**
     * 贷款阶段
     * @return LOAN_STAGE 贷款阶段
     */
    public String getLoanStage() {
        return loanStage;
    }

    /**
     * 贷款阶段
     * @param loanStage 贷款阶段
     */
    public void setLoanStage(String loanStage) {
        this.loanStage = loanStage == null ? null : loanStage.trim();
    }

    /**
     * 贷款拒绝理由
     * @return LOAN_REFUSE_REASON 贷款拒绝理由
     */
    public String getLoanRefuseReason() {
        return loanRefuseReason;
    }

    /**
     * 贷款拒绝理由
     * @param loanRefuseReason 贷款拒绝理由
     */
    public void setLoanRefuseReason(String loanRefuseReason) {
        this.loanRefuseReason = loanRefuseReason == null ? null : loanRefuseReason.trim();
    }

    /**
     * 贷款拒绝备注
     * @return LOAN_REFUSE_REMARK 贷款拒绝备注
     */
    public String getLoanRefuseRemark() {
        return loanRefuseRemark;
    }

    /**
     * 贷款拒绝备注
     * @param loanRefuseRemark 贷款拒绝备注
     */
    public void setLoanRefuseRemark(String loanRefuseRemark) {
        this.loanRefuseRemark = loanRefuseRemark == null ? null : loanRefuseRemark.trim();
    }

    /**
     * 贷款拒绝时间
     * @return LOAN_REFUSE_DATE 贷款拒绝时间
     */
    public Date getLoanRefuseDate() {
        return loanRefuseDate;
    }

    /**
     * 贷款拒绝时间
     * @param loanRefuseDate 贷款拒绝时间
     */
    public void setLoanRefuseDate(Date loanRefuseDate) {
        this.loanRefuseDate = loanRefuseDate;
    }

    /**
     * 贷款拒绝人
     * @return LOAN_REFUSE_USER 贷款拒绝人
     */
    public Integer getLoanRefuseUser() {
        return loanRefuseUser;
    }

    /**
     * 贷款拒绝人
     * @param loanRefuseUser 贷款拒绝人
     */
    public void setLoanRefuseUser(Integer loanRefuseUser) {
        this.loanRefuseUser = loanRefuseUser;
    }

    /**
     * 贷款催收状态
     * @return LOAN_COLLECTION_STATE 贷款催收状态
     */
    public String getLoanCollectionState() {
        return loanCollectionState;
    }

    /**
     * 贷款催收状态
     * @param loanCollectionState 贷款催收状态
     */
    public void setLoanCollectionState(String loanCollectionState) {
        this.loanCollectionState = loanCollectionState == null ? null : loanCollectionState.trim();
    }

    /**
     * 贷款催收日期
     * @return LOAN_COLLECTION_DATE 贷款催收日期
     */
    public Date getLoanCollectionDate() {
        return loanCollectionDate;
    }

    /**
     * 贷款催收日期
     * @param loanCollectionDate 贷款催收日期
     */
    public void setLoanCollectionDate(Date loanCollectionDate) {
        this.loanCollectionDate = loanCollectionDate;
    }

    /**
     * 贷款应还款金额
     * @return LOAN_REPAY_AMOUNT 贷款应还款金额
     */
    public BigDecimal getLoanRepayAmount() {
        return loanRepayAmount;
    }

    /**
     * 贷款应还款金额
     * @param loanRepayAmount 贷款应还款金额
     */
    public void setLoanRepayAmount(BigDecimal loanRepayAmount) {
        this.loanRepayAmount = loanRepayAmount;
    }

    /**
     * 贷款应还款日期
     * @return LOAN_REPAY_DATE 贷款应还款日期
     */
    public Date getLoanRepayDate() {
        return loanRepayDate;
    }

    /**
     * 贷款应还款日期
     * @param loanRepayDate 贷款应还款日期
     */
    public void setLoanRepayDate(Date loanRepayDate) {
        this.loanRepayDate = loanRepayDate;
    }

    /**
     * 贷款归属人
     * @return LOAN_BELONG_ID 贷款归属人
     */
    public Integer getLoanBelongId() {
        return loanBelongId;
    }

    /**
     * 贷款归属人
     * @param loanBelongId 贷款归属人
     */
    public void setLoanBelongId(Integer loanBelongId) {
        this.loanBelongId = loanBelongId;
    }

    /**
     * 还款方式
     * @return REPAYMENT_MODE 还款方式
     */
    public String getRepaymentMode() {
        return repaymentMode;
    }

    /**
     * 还款方式
     * @param repaymentMode 还款方式
     */
    public void setRepaymentMode(String repaymentMode) {
        this.repaymentMode = repaymentMode == null ? null : repaymentMode.trim();
    }

    /**
     * 是否删除
     * @return IS_DEL 是否删除
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 是否删除
     * @param isDel 是否删除
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * 贷款账户
     * @return LOAN_ACCOUNT_NO 贷款账户
     */
    public String getLoanAccountNo() {
        return loanAccountNo;
    }

    /**
     * 贷款账户
     * @param loanAccountNo 贷款账户
     */
    public void setLoanAccountNo(String loanAccountNo) {
        this.loanAccountNo = loanAccountNo == null ? null : loanAccountNo.trim();
    }

    /**
     * 贷款账户余额
     * @return LOAN_ACCOUNT_AMOUNT 贷款账户余额
     */
    public BigDecimal getLoanAccountAmount() {
        return loanAccountAmount;
    }

    /**
     * 贷款账户余额
     * @param loanAccountAmount 贷款账户余额
     */
    public void setLoanAccountAmount(BigDecimal loanAccountAmount) {
        this.loanAccountAmount = loanAccountAmount;
    }

    /**
     * 贷款余额
     * @return LOAN_BALANCE_AMOUNT 贷款余额
     */
    public BigDecimal getLoanBalanceAmount() {
        return loanBalanceAmount;
    }

    /**
     * 贷款余额
     * @param loanBalanceAmount 贷款余额
     */
    public void setLoanBalanceAmount(BigDecimal loanBalanceAmount) {
        this.loanBalanceAmount = loanBalanceAmount;
    }

    /**
     * 贷款建议金额
     * @return LOAN_PROPOSE_AMOUNT 贷款建议金额
     */
    public BigDecimal getLoanProposeAmount() {
        return loanProposeAmount;
    }

    /**
     * 贷款建议金额
     * @param loanProposeAmount 贷款建议金额
     */
    public void setLoanProposeAmount(BigDecimal loanProposeAmount) {
        this.loanProposeAmount = loanProposeAmount;
    }

    /**
     * 实际放款金额
     * @return LOAN_CREDIT_AMOUNT 实际放款金额
     */
    public BigDecimal getLoanCreditAmount() {
        return loanCreditAmount;
    }

    /**
     * 实际放款金额
     * @param loanCreditAmount 实际放款金额
     */
    public void setLoanCreditAmount(BigDecimal loanCreditAmount) {
        this.loanCreditAmount = loanCreditAmount;
    }

    /**
     * 放款合同号
     * @return LOAN_CONTRACT_NUMBER 放款合同号
     */
    public String getLoanContractNumber() {
        return loanContractNumber;
    }

    /**
     * 放款合同号
     * @param loanContractNumber 放款合同号
     */
    public void setLoanContractNumber(String loanContractNumber) {
        this.loanContractNumber = loanContractNumber == null ? null : loanContractNumber.trim();
    }

    /**
     * 客户姓名
     * @return CUST_NAME 客户姓名
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 客户姓名
     * @param custName 客户姓名
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * 客户类型
     * @return CUST_TYPE 客户类型
     */
    public Integer getCustType() {
        return custType;
    }

    /**
     * 客户类型
     * @param custType 客户类型
     */
    public void setCustType(Integer custType) {
        this.custType = custType;
    }

    /**
     * 客户ID
     * @return CUST_ID 客户ID
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 客户ID
     * @param custId 客户ID
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 证件类型
     * @return IDENTIFY_TYPE 证件类型
     */
    public String getIdentifyType() {
        return identifyType;
    }

    /**
     * 证件类型
     * @param identifyType 证件类型
     */
    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    /**
     * 证件号码
     * @return IDENTIFY_NUM 证件号码
     */
    public String getIdentifyNum() {
        return identifyNum;
    }

    /**
     * 证件号码
     * @param identifyNum 证件号码
     */
    public void setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum == null ? null : identifyNum.trim();
    }

    /**
     * 联系电话
     * @return PHONE_NUM 联系电话
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 联系电话
     * @param phoneNum 联系电话
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * 贷款审合时间
     * @return LOAN_AUDIT_DATE 贷款审合时间
     */
    public Date getLoanAuditDate() {
        return loanAuditDate;
    }

    /**
     * 贷款审合时间
     * @param loanAuditDate 贷款审合时间
     */
    public void setLoanAuditDate(Date loanAuditDate) {
        this.loanAuditDate = loanAuditDate;
    }

    /**
     * 抵质押物编号
     * @return PLEDGE_INFO_ID 抵质押物编号
     */
    public String getPledgeInfoId() {
        return pledgeInfoId;
    }

    /**
     * 抵质押物编号
     * @param pledgeInfoId 抵质押物编号
     */
    public void setPledgeInfoId(String pledgeInfoId) {
        this.pledgeInfoId = pledgeInfoId == null ? null : pledgeInfoId.trim();
    }

    /**
     * 创建时间
     * @return UPDATE_DATE 创建时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 创建时间
     * @param updateDate 创建时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 创建用户
     * @return CREATE_USER 创建用户
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 创建用户
     * @param createUser 创建用户
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LoanApplyInfo other = (LoanApplyInfo) that;
        return (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
            && (this.getLoanType() == null ? other.getLoanType() == null : this.getLoanType().equals(other.getLoanType()))
            && (this.getLoanClass() == null ? other.getLoanClass() == null : this.getLoanClass().equals(other.getLoanClass()))
            && (this.getLoanUse() == null ? other.getLoanUse() == null : this.getLoanUse().equals(other.getLoanUse()))
            && (this.getApplyAmount() == null ? other.getApplyAmount() == null : this.getApplyAmount().equals(other.getApplyAmount()))
            && (this.getLoanTerm() == null ? other.getLoanTerm() == null : this.getLoanTerm().equals(other.getLoanTerm()))
            && (this.getMaxInstallment() == null ? other.getMaxInstallment() == null : this.getMaxInstallment().equals(other.getMaxInstallment()))
            && (this.getGuranteeMethod() == null ? other.getGuranteeMethod() == null : this.getGuranteeMethod().equals(other.getGuranteeMethod()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getLoanCreditDate() == null ? other.getLoanCreditDate() == null : this.getLoanCreditDate().equals(other.getLoanCreditDate()))
            && (this.getLoanStage() == null ? other.getLoanStage() == null : this.getLoanStage().equals(other.getLoanStage()))
            && (this.getLoanRefuseReason() == null ? other.getLoanRefuseReason() == null : this.getLoanRefuseReason().equals(other.getLoanRefuseReason()))
            && (this.getLoanRefuseRemark() == null ? other.getLoanRefuseRemark() == null : this.getLoanRefuseRemark().equals(other.getLoanRefuseRemark()))
            && (this.getLoanRefuseDate() == null ? other.getLoanRefuseDate() == null : this.getLoanRefuseDate().equals(other.getLoanRefuseDate()))
            && (this.getLoanRefuseUser() == null ? other.getLoanRefuseUser() == null : this.getLoanRefuseUser().equals(other.getLoanRefuseUser()))
            && (this.getLoanCollectionState() == null ? other.getLoanCollectionState() == null : this.getLoanCollectionState().equals(other.getLoanCollectionState()))
            && (this.getLoanCollectionDate() == null ? other.getLoanCollectionDate() == null : this.getLoanCollectionDate().equals(other.getLoanCollectionDate()))
            && (this.getLoanRepayAmount() == null ? other.getLoanRepayAmount() == null : this.getLoanRepayAmount().equals(other.getLoanRepayAmount()))
            && (this.getLoanRepayDate() == null ? other.getLoanRepayDate() == null : this.getLoanRepayDate().equals(other.getLoanRepayDate()))
            && (this.getLoanBelongId() == null ? other.getLoanBelongId() == null : this.getLoanBelongId().equals(other.getLoanBelongId()))
            && (this.getRepaymentMode() == null ? other.getRepaymentMode() == null : this.getRepaymentMode().equals(other.getRepaymentMode()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getLoanAccountNo() == null ? other.getLoanAccountNo() == null : this.getLoanAccountNo().equals(other.getLoanAccountNo()))
            && (this.getLoanAccountAmount() == null ? other.getLoanAccountAmount() == null : this.getLoanAccountAmount().equals(other.getLoanAccountAmount()))
            && (this.getLoanBalanceAmount() == null ? other.getLoanBalanceAmount() == null : this.getLoanBalanceAmount().equals(other.getLoanBalanceAmount()))
            && (this.getLoanProposeAmount() == null ? other.getLoanProposeAmount() == null : this.getLoanProposeAmount().equals(other.getLoanProposeAmount()))
            && (this.getLoanCreditAmount() == null ? other.getLoanCreditAmount() == null : this.getLoanCreditAmount().equals(other.getLoanCreditAmount()))
            && (this.getLoanContractNumber() == null ? other.getLoanContractNumber() == null : this.getLoanContractNumber().equals(other.getLoanContractNumber()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustType() == null ? other.getCustType() == null : this.getCustType().equals(other.getCustType()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getIdentifyType() == null ? other.getIdentifyType() == null : this.getIdentifyType().equals(other.getIdentifyType()))
            && (this.getIdentifyNum() == null ? other.getIdentifyNum() == null : this.getIdentifyNum().equals(other.getIdentifyNum()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getLoanAuditDate() == null ? other.getLoanAuditDate() == null : this.getLoanAuditDate().equals(other.getLoanAuditDate()))
            && (this.getPledgeInfoId() == null ? other.getPledgeInfoId() == null : this.getPledgeInfoId().equals(other.getPledgeInfoId()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getLoanType() == null) ? 0 : getLoanType().hashCode());
        result = prime * result + ((getLoanClass() == null) ? 0 : getLoanClass().hashCode());
        result = prime * result + ((getLoanUse() == null) ? 0 : getLoanUse().hashCode());
        result = prime * result + ((getApplyAmount() == null) ? 0 : getApplyAmount().hashCode());
        result = prime * result + ((getLoanTerm() == null) ? 0 : getLoanTerm().hashCode());
        result = prime * result + ((getMaxInstallment() == null) ? 0 : getMaxInstallment().hashCode());
        result = prime * result + ((getGuranteeMethod() == null) ? 0 : getGuranteeMethod().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getLoanCreditDate() == null) ? 0 : getLoanCreditDate().hashCode());
        result = prime * result + ((getLoanStage() == null) ? 0 : getLoanStage().hashCode());
        result = prime * result + ((getLoanRefuseReason() == null) ? 0 : getLoanRefuseReason().hashCode());
        result = prime * result + ((getLoanRefuseRemark() == null) ? 0 : getLoanRefuseRemark().hashCode());
        result = prime * result + ((getLoanRefuseDate() == null) ? 0 : getLoanRefuseDate().hashCode());
        result = prime * result + ((getLoanRefuseUser() == null) ? 0 : getLoanRefuseUser().hashCode());
        result = prime * result + ((getLoanCollectionState() == null) ? 0 : getLoanCollectionState().hashCode());
        result = prime * result + ((getLoanCollectionDate() == null) ? 0 : getLoanCollectionDate().hashCode());
        result = prime * result + ((getLoanRepayAmount() == null) ? 0 : getLoanRepayAmount().hashCode());
        result = prime * result + ((getLoanRepayDate() == null) ? 0 : getLoanRepayDate().hashCode());
        result = prime * result + ((getLoanBelongId() == null) ? 0 : getLoanBelongId().hashCode());
        result = prime * result + ((getRepaymentMode() == null) ? 0 : getRepaymentMode().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getLoanAccountNo() == null) ? 0 : getLoanAccountNo().hashCode());
        result = prime * result + ((getLoanAccountAmount() == null) ? 0 : getLoanAccountAmount().hashCode());
        result = prime * result + ((getLoanBalanceAmount() == null) ? 0 : getLoanBalanceAmount().hashCode());
        result = prime * result + ((getLoanProposeAmount() == null) ? 0 : getLoanProposeAmount().hashCode());
        result = prime * result + ((getLoanCreditAmount() == null) ? 0 : getLoanCreditAmount().hashCode());
        result = prime * result + ((getLoanContractNumber() == null) ? 0 : getLoanContractNumber().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustType() == null) ? 0 : getCustType().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getIdentifyType() == null) ? 0 : getIdentifyType().hashCode());
        result = prime * result + ((getIdentifyNum() == null) ? 0 : getIdentifyNum().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
        result = prime * result + ((getLoanAuditDate() == null) ? 0 : getLoanAuditDate().hashCode());
        result = prime * result + ((getPledgeInfoId() == null) ? 0 : getPledgeInfoId().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loanId=").append(loanId);
        sb.append(", loanType=").append(loanType);
        sb.append(", loanClass=").append(loanClass);
        sb.append(", loanUse=").append(loanUse);
        sb.append(", applyAmount=").append(applyAmount);
        sb.append(", loanTerm=").append(loanTerm);
        sb.append(", maxInstallment=").append(maxInstallment);
        sb.append(", guranteeMethod=").append(guranteeMethod);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", loanCreditDate=").append(loanCreditDate);
        sb.append(", loanStage=").append(loanStage);
        sb.append(", loanRefuseReason=").append(loanRefuseReason);
        sb.append(", loanRefuseRemark=").append(loanRefuseRemark);
        sb.append(", loanRefuseDate=").append(loanRefuseDate);
        sb.append(", loanRefuseUser=").append(loanRefuseUser);
        sb.append(", loanCollectionState=").append(loanCollectionState);
        sb.append(", loanCollectionDate=").append(loanCollectionDate);
        sb.append(", loanRepayAmount=").append(loanRepayAmount);
        sb.append(", loanRepayDate=").append(loanRepayDate);
        sb.append(", loanBelongId=").append(loanBelongId);
        sb.append(", repaymentMode=").append(repaymentMode);
        sb.append(", isDel=").append(isDel);
        sb.append(", loanAccountNo=").append(loanAccountNo);
        sb.append(", loanAccountAmount=").append(loanAccountAmount);
        sb.append(", loanBalanceAmount=").append(loanBalanceAmount);
        sb.append(", loanProposeAmount=").append(loanProposeAmount);
        sb.append(", loanCreditAmount=").append(loanCreditAmount);
        sb.append(", loanContractNumber=").append(loanContractNumber);
        sb.append(", custName=").append(custName);
        sb.append(", custType=").append(custType);
        sb.append(", custId=").append(custId);
        sb.append(", identifyType=").append(identifyType);
        sb.append(", identifyNum=").append(identifyNum);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", loanAuditDate=").append(loanAuditDate);
        sb.append(", pledgeInfoId=").append(pledgeInfoId);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}