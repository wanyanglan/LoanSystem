package njupt.microcredit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 企业经营信息
 * @author wyl
 *
 */
public class BusinessInfo implements Serializable {
    /**
     * 经营ID
     */
    private Integer id;

    /**
     * 客户id
     */
    private Integer custId;

    /**
     * 企业ID
     */
    private Integer companyId;

    /**
     * 法人ID
     */
    private Integer legalId;

    /**
     * 营业执照号码
     */
    private String licenseNum;

    /**
     * 营业执照到期日
     */
    private Date licenseDueDate;

    /**
     * 国税登记号
     */
    private String nationalTaxNum;

    /**
     * 地税登记号
     */
    private String localTaxNum;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 开户许可证
     */
    private String openPermit;

    /**
     * 企业代码
     */
    private String companyCode;

    /**
     * 注册资本
     */
    private BigDecimal registerCapital;

    /**
     * 开户许可证到期日
     */
    private Date openDueDate;

    /**
     * 外币基本帐户开户行
     */
    private String foreigrAccount;

    /**
     * 本币基本帐户开户行
     */
    private String localAccount;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建用户
     */
    private Integer createUser;

    /**
     * business_info
     */
    private static final long serialVersionUID = 1L;

    /**
     * 经营ID
     * @return ID 经营ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 经营ID
     * @param id 经营ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 客户id
     * @return CUST_ID 客户id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 客户id
     * @param custId 客户id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 企业ID
     * @return COMPANY_ID 企业ID
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 企业ID
     * @param companyId 企业ID
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 法人ID
     * @return LEGAL_ID 法人ID
     */
    public Integer getLegalId() {
        return legalId;
    }

    /**
     * 法人ID
     * @param legalId 法人ID
     */
    public void setLegalId(Integer legalId) {
        this.legalId = legalId;
    }

    /**
     * 营业执照号码
     * @return LICENSE_NUM 营业执照号码
     */
    public String getLicenseNum() {
        return licenseNum;
    }

    /**
     * 营业执照号码
     * @param licenseNum 营业执照号码
     */
    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum == null ? null : licenseNum.trim();
    }

    /**
     * 营业执照到期日
     * @return LICENSE_DUE_DATE 营业执照到期日
     */
    public Date getLicenseDueDate() {
        return licenseDueDate;
    }

    /**
     * 营业执照到期日
     * @param licenseDueDate 营业执照到期日
     */
    public void setLicenseDueDate(Date licenseDueDate) {
        this.licenseDueDate = licenseDueDate;
    }

    /**
     * 国税登记号
     * @return NATIONAL_TAX_NUM 国税登记号
     */
    public String getNationalTaxNum() {
        return nationalTaxNum;
    }

    /**
     * 国税登记号
     * @param nationalTaxNum 国税登记号
     */
    public void setNationalTaxNum(String nationalTaxNum) {
        this.nationalTaxNum = nationalTaxNum == null ? null : nationalTaxNum.trim();
    }

    /**
     * 地税登记号
     * @return LOCAL_TAX_NUM 地税登记号
     */
    public String getLocalTaxNum() {
        return localTaxNum;
    }

    /**
     * 地税登记号
     * @param localTaxNum 地税登记号
     */
    public void setLocalTaxNum(String localTaxNum) {
        this.localTaxNum = localTaxNum == null ? null : localTaxNum.trim();
    }

    /**
     * 组织机构代码
     * @return ORGANIZATION_CODE 组织机构代码
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * 组织机构代码
     * @param organizationCode 组织机构代码
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    /**
     * 开户许可证
     * @return OPEN_PERMIT 开户许可证
     */
    public String getOpenPermit() {
        return openPermit;
    }

    /**
     * 开户许可证
     * @param openPermit 开户许可证
     */
    public void setOpenPermit(String openPermit) {
        this.openPermit = openPermit == null ? null : openPermit.trim();
    }

    /**
     * 企业代码
     * @return COMPANY_CODE 企业代码
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 企业代码
     * @param companyCode 企业代码
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    /**
     * 注册资本
     * @return REGISTER_CAPITAL 注册资本
     */
    public BigDecimal getRegisterCapital() {
        return registerCapital;
    }

    /**
     * 注册资本
     * @param registerCapital 注册资本
     */
    public void setRegisterCapital(BigDecimal registerCapital) {
        this.registerCapital = registerCapital;
    }

    /**
     * 开户许可证到期日
     * @return OPEN_DUE_DATE 开户许可证到期日
     */
    public Date getOpenDueDate() {
        return openDueDate;
    }

    /**
     * 开户许可证到期日
     * @param openDueDate 开户许可证到期日
     */
    public void setOpenDueDate(Date openDueDate) {
        this.openDueDate = openDueDate;
    }

    /**
     * 外币基本帐户开户行
     * @return FOREIGR_ACCOUNT 外币基本帐户开户行
     */
    public String getForeigrAccount() {
        return foreigrAccount;
    }

    /**
     * 外币基本帐户开户行
     * @param foreigrAccount 外币基本帐户开户行
     */
    public void setForeigrAccount(String foreigrAccount) {
        this.foreigrAccount = foreigrAccount == null ? null : foreigrAccount.trim();
    }

    /**
     * 本币基本帐户开户行
     * @return LOCAL_ACCOUNT 本币基本帐户开户行
     */
    public String getLocalAccount() {
        return localAccount;
    }

    /**
     * 本币基本帐户开户行
     * @param localAccount 本币基本帐户开户行
     */
    public void setLocalAccount(String localAccount) {
        this.localAccount = localAccount == null ? null : localAccount.trim();
    }

    /**
     * 创建时间
     * @return CREATE_DATE 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        BusinessInfo other = (BusinessInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getLegalId() == null ? other.getLegalId() == null : this.getLegalId().equals(other.getLegalId()))
            && (this.getLicenseNum() == null ? other.getLicenseNum() == null : this.getLicenseNum().equals(other.getLicenseNum()))
            && (this.getLicenseDueDate() == null ? other.getLicenseDueDate() == null : this.getLicenseDueDate().equals(other.getLicenseDueDate()))
            && (this.getNationalTaxNum() == null ? other.getNationalTaxNum() == null : this.getNationalTaxNum().equals(other.getNationalTaxNum()))
            && (this.getLocalTaxNum() == null ? other.getLocalTaxNum() == null : this.getLocalTaxNum().equals(other.getLocalTaxNum()))
            && (this.getOrganizationCode() == null ? other.getOrganizationCode() == null : this.getOrganizationCode().equals(other.getOrganizationCode()))
            && (this.getOpenPermit() == null ? other.getOpenPermit() == null : this.getOpenPermit().equals(other.getOpenPermit()))
            && (this.getCompanyCode() == null ? other.getCompanyCode() == null : this.getCompanyCode().equals(other.getCompanyCode()))
            && (this.getRegisterCapital() == null ? other.getRegisterCapital() == null : this.getRegisterCapital().equals(other.getRegisterCapital()))
            && (this.getOpenDueDate() == null ? other.getOpenDueDate() == null : this.getOpenDueDate().equals(other.getOpenDueDate()))
            && (this.getForeigrAccount() == null ? other.getForeigrAccount() == null : this.getForeigrAccount().equals(other.getForeigrAccount()))
            && (this.getLocalAccount() == null ? other.getLocalAccount() == null : this.getLocalAccount().equals(other.getLocalAccount()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getLegalId() == null) ? 0 : getLegalId().hashCode());
        result = prime * result + ((getLicenseNum() == null) ? 0 : getLicenseNum().hashCode());
        result = prime * result + ((getLicenseDueDate() == null) ? 0 : getLicenseDueDate().hashCode());
        result = prime * result + ((getNationalTaxNum() == null) ? 0 : getNationalTaxNum().hashCode());
        result = prime * result + ((getLocalTaxNum() == null) ? 0 : getLocalTaxNum().hashCode());
        result = prime * result + ((getOrganizationCode() == null) ? 0 : getOrganizationCode().hashCode());
        result = prime * result + ((getOpenPermit() == null) ? 0 : getOpenPermit().hashCode());
        result = prime * result + ((getCompanyCode() == null) ? 0 : getCompanyCode().hashCode());
        result = prime * result + ((getRegisterCapital() == null) ? 0 : getRegisterCapital().hashCode());
        result = prime * result + ((getOpenDueDate() == null) ? 0 : getOpenDueDate().hashCode());
        result = prime * result + ((getForeigrAccount() == null) ? 0 : getForeigrAccount().hashCode());
        result = prime * result + ((getLocalAccount() == null) ? 0 : getLocalAccount().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", custId=").append(custId);
        sb.append(", companyId=").append(companyId);
        sb.append(", legalId=").append(legalId);
        sb.append(", licenseNum=").append(licenseNum);
        sb.append(", licenseDueDate=").append(licenseDueDate);
        sb.append(", nationalTaxNum=").append(nationalTaxNum);
        sb.append(", localTaxNum=").append(localTaxNum);
        sb.append(", organizationCode=").append(organizationCode);
        sb.append(", openPermit=").append(openPermit);
        sb.append(", companyCode=").append(companyCode);
        sb.append(", registerCapital=").append(registerCapital);
        sb.append(", openDueDate=").append(openDueDate);
        sb.append(", foreigrAccount=").append(foreigrAccount);
        sb.append(", localAccount=").append(localAccount);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}