package njupt.microcredit.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 企业基本信息
 * @author wyl
 *
 */
public class CompanyInfo implements Serializable {
    /**
     * 企业id
     */
    private Integer id;

    /**
     * 客户id
     */
    private Integer custId;

    /**
     * 客户名称
     */
    private String custName;

    /**
     * 客户别名
     */
    private String custAlias;

    /**
     * 单位性质
     */
    private String conpamyProperty;

    /**
     * 所有者性质
     */
    private String ownerProperty;

    /**
     * 经济类型
     */
    private String economicType;

    /**
     * 信用等级
     */
    private String creditGrage;

    /**
     * 企业规模
     */
    private String companyScale;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 单位地址
     */
    private String conpamyAddr;

    /**
     * 单位电话
     */
    private String companyPhone;

    /**
     * 单位传真
     */
    private String companyFax;

    /**
     * 电子邮件
     */
    private String companyEmail;

    /**
     * 单位邮编
     */
    private String companyPostcode;

    /**
     * 经营地址
     */
    private String businessAddr;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建用户
     */
    private Integer createUser;

    /**
     * company_info
     */
    private static final long serialVersionUID = 1L;

    /**
     * 企业id
     * @return ID 企业id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 企业id
     * @param id 企业id
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
     * 客户名称
     * @return CUST_NAME 客户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 客户名称
     * @param custName 客户名称
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * 客户别名
     * @return CUST_ALIAS 客户别名
     */
    public String getCustAlias() {
        return custAlias;
    }

    /**
     * 客户别名
     * @param custAlias 客户别名
     */
    public void setCustAlias(String custAlias) {
        this.custAlias = custAlias == null ? null : custAlias.trim();
    }

    /**
     * 单位性质
     * @return CONPAMY_PROPERTY 单位性质
     */
    public String getConpamyProperty() {
        return conpamyProperty;
    }

    /**
     * 单位性质
     * @param conpamyProperty 单位性质
     */
    public void setConpamyProperty(String conpamyProperty) {
        this.conpamyProperty = conpamyProperty;
    }

    /**
     * 所有者性质
     * @return OWNER_PROPERTY 所有者性质
     */
    public String getOwnerProperty() {
        return ownerProperty;
    }

    /**
     * 所有者性质
     * @param ownerProperty 所有者性质
     */
    public void setOwnerProperty(String ownerProperty) {
        this.ownerProperty = ownerProperty;
    }

    /**
     * 经济类型
     * @return ECONOMIC_TYPE 经济类型
     */
    public String getEconomicType() {
        return economicType;
    }

    /**
     * 经济类型
     * @param economicType 经济类型
     */
    public void setEconomicType(String economicType) {
        this.economicType = economicType;
    }

    /**
     * 信用等级
     * @return CREDIT_GRAGE 信用等级
     */
    public String getCreditGrage() {
        return creditGrage;
    }

    /**
     * 信用等级
     * @param creditGrage 信用等级
     */
    public void setCreditGrage(String creditGrage) {
        this.creditGrage = creditGrage;
    }

    /**
     * 企业规模
     * @return COMPANY_SCALE 企业规模
     */
    public String getCompanyScale() {
        return companyScale;
    }

    /**
     * 企业规模
     * @param companyScale 企业规模
     */
    public void setCompanyScale(String companyScale) {
        this.companyScale = companyScale == null ? null : companyScale.trim();
    }

    /**
     * 所属行业
     * @return INDUSTRY 所属行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 所属行业
     * @param industry 所属行业
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 单位地址
     * @return CONPAMY_ADDR 单位地址
     */
    public String getConpamyAddr() {
        return conpamyAddr;
    }

    /**
     * 单位地址
     * @param conpamyAddr 单位地址
     */
    public void setConpamyAddr(String conpamyAddr) {
        this.conpamyAddr = conpamyAddr == null ? null : conpamyAddr.trim();
    }

    /**
     * 单位电话
     * @return COMPANY_PHONE 单位电话
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * 单位电话
     * @param companyPhone 单位电话
     */
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    /**
     * 单位传真
     * @return COMPANY_FAX 单位传真
     */
    public String getCompanyFax() {
        return companyFax;
    }

    /**
     * 单位传真
     * @param companyFax 单位传真
     */
    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax == null ? null : companyFax.trim();
    }

    /**
     * 电子邮件
     * @return COMPANY_EMAIL 电子邮件
     */
    public String getCompanyEmail() {
        return companyEmail;
    }

    /**
     * 电子邮件
     * @param companyEmail 电子邮件
     */
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    /**
     * 单位邮编
     * @return COMPANY_POSTCODE 单位邮编
     */
    public String getCompanyPostcode() {
        return companyPostcode;
    }

    /**
     * 单位邮编
     * @param companyPostcode 单位邮编
     */
    public void setCompanyPostcode(String companyPostcode) {
        this.companyPostcode = companyPostcode == null ? null : companyPostcode.trim();
    }

    /**
     * 经营地址
     * @return BUSINESS_ADDR 经营地址
     */
    public String getBusinessAddr() {
        return businessAddr;
    }

    /**
     * 经营地址
     * @param businessAddr 经营地址
     */
    public void setBusinessAddr(String businessAddr) {
        this.businessAddr = businessAddr == null ? null : businessAddr.trim();
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
        CompanyInfo other = (CompanyInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustAlias() == null ? other.getCustAlias() == null : this.getCustAlias().equals(other.getCustAlias()))
            && (this.getConpamyProperty() == null ? other.getConpamyProperty() == null : this.getConpamyProperty().equals(other.getConpamyProperty()))
            && (this.getOwnerProperty() == null ? other.getOwnerProperty() == null : this.getOwnerProperty().equals(other.getOwnerProperty()))
            && (this.getEconomicType() == null ? other.getEconomicType() == null : this.getEconomicType().equals(other.getEconomicType()))
            && (this.getCreditGrage() == null ? other.getCreditGrage() == null : this.getCreditGrage().equals(other.getCreditGrage()))
            && (this.getCompanyScale() == null ? other.getCompanyScale() == null : this.getCompanyScale().equals(other.getCompanyScale()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getConpamyAddr() == null ? other.getConpamyAddr() == null : this.getConpamyAddr().equals(other.getConpamyAddr()))
            && (this.getCompanyPhone() == null ? other.getCompanyPhone() == null : this.getCompanyPhone().equals(other.getCompanyPhone()))
            && (this.getCompanyFax() == null ? other.getCompanyFax() == null : this.getCompanyFax().equals(other.getCompanyFax()))
            && (this.getCompanyEmail() == null ? other.getCompanyEmail() == null : this.getCompanyEmail().equals(other.getCompanyEmail()))
            && (this.getCompanyPostcode() == null ? other.getCompanyPostcode() == null : this.getCompanyPostcode().equals(other.getCompanyPostcode()))
            && (this.getBusinessAddr() == null ? other.getBusinessAddr() == null : this.getBusinessAddr().equals(other.getBusinessAddr()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustAlias() == null) ? 0 : getCustAlias().hashCode());
        result = prime * result + ((getConpamyProperty() == null) ? 0 : getConpamyProperty().hashCode());
        result = prime * result + ((getOwnerProperty() == null) ? 0 : getOwnerProperty().hashCode());
        result = prime * result + ((getEconomicType() == null) ? 0 : getEconomicType().hashCode());
        result = prime * result + ((getCreditGrage() == null) ? 0 : getCreditGrage().hashCode());
        result = prime * result + ((getCompanyScale() == null) ? 0 : getCompanyScale().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getConpamyAddr() == null) ? 0 : getConpamyAddr().hashCode());
        result = prime * result + ((getCompanyPhone() == null) ? 0 : getCompanyPhone().hashCode());
        result = prime * result + ((getCompanyFax() == null) ? 0 : getCompanyFax().hashCode());
        result = prime * result + ((getCompanyEmail() == null) ? 0 : getCompanyEmail().hashCode());
        result = prime * result + ((getCompanyPostcode() == null) ? 0 : getCompanyPostcode().hashCode());
        result = prime * result + ((getBusinessAddr() == null) ? 0 : getBusinessAddr().hashCode());
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
        sb.append(", custName=").append(custName);
        sb.append(", custAlias=").append(custAlias);
        sb.append(", conpamyProperty=").append(conpamyProperty);
        sb.append(", ownerProperty=").append(ownerProperty);
        sb.append(", economicType=").append(economicType);
        sb.append(", creditGrage=").append(creditGrage);
        sb.append(", companyScale=").append(companyScale);
        sb.append(", industry=").append(industry);
        sb.append(", conpamyAddr=").append(conpamyAddr);
        sb.append(", companyPhone=").append(companyPhone);
        sb.append(", companyFax=").append(companyFax);
        sb.append(", companyEmail=").append(companyEmail);
        sb.append(", companyPostcode=").append(companyPostcode);
        sb.append(", businessAddr=").append(businessAddr);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}