package njupt.microcredit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 客户基本信息
 * @author wyl
 *
 */
public class CustomerInfo implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 客户id
     */
    private Integer custId;

    /**
     * 客户姓名
     */
    private String custName;

    /**
     * 性别
     */
    private String custGender;

    /**
     * 年龄
     */
    private Integer custAge;

    /**
     * 生日
     */
    private Date clientBirthday;
    public Date getClientBirthday() {
		return clientBirthday;
	}

	public void setClientBirthday(Date clientBirthday) {
		this.clientBirthday = clientBirthday;
	}

	/**
     * 手机号码
     */
    private String phoneNum;

    /**
     * 证件类型
     */
    private String identifyType;

    /**
     * 证件号码
     */
    private String identifyNum;

    /**
     * 婚姻状况
     */
    private String maritalStatus;

    /**
     * 学历
     */
    private String custEducation;

    /**
     * 户籍
     */
    private String custCensus;

    /**
     * 家庭住址
     */
    private String custAddr;

    /**
     * 现址居住年限
     */
    private Integer addrYears;

    /**
     * 职位
     */
    private String jobTitle;

    /**
     * 职称
     */
    private String occupationTitle;

    /**
     * 月收入水平
     */
    private BigDecimal monthlyIncome;

    /**
     * 现单位工龄
     */
    private Integer unitService;

    /**
     * 电子邮箱
     */
    private String custEmail;

    /**
     * 公安司法不良记录
     */
    private String badRecord;

    /**
     * 单位性质
     */
    private String unitType;

    /**
     * 单位地址
     */
    private String companyAddr;

    /**
     * 单位电话
     */
    private String companyPhone;

    /**
     * 单位名称
     */
    private String companyName;

    /**
     * 客户归属
     */
    private Integer belongUserId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建用户
     */
    private Integer createOr;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 更新者
     */
    private Integer updateOr;

    /**
     * customer_info
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     * @return ID ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
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
     * 性别
     * @return CUST_GENDER 性别
     */
    public String getCustGender() {
        return custGender;
    }

    /**
     * 性别
     * @param custGender 性别
     */
    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    /**
     * 年龄
     * @return CUST_AGE 年龄
     */
    public Integer getCustAge() {
        return custAge;
    }

    /**
     * 年龄
     * @param custAge 年龄
     */
    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }

    /**
     * 手机号码
     * @return PHONE_NUM 手机号码
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 手机号码
     * @param phoneNum 手机号码
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
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
     * 婚姻状况
     * @return MARITAL_STATUS 婚姻状况
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 婚姻状况
     * @param maritalStatus 婚姻状况
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * 学历
     * @return CUST_EDUCATION 学历
     */
    public String getCustEducation() {
        return custEducation;
    }

    /**
     * 学历
     * @param custEducation 学历
     */
    public void setCustEducation(String custEducation) {
        this.custEducation = custEducation;
    }

    /**
     * 户籍
     * @return CUST_CENSUS 户籍
     */
    public String getCustCensus() {
        return custCensus;
    }

    /**
     * 户籍
     * @param custCensus 户籍
     */
    public void setCustCensus(String custCensus) {
        this.custCensus = custCensus == null ? null : custCensus.trim();
    }

    /**
     * 家庭住址
     * @return CUST_ADDR 家庭住址
     */
    public String getCustAddr() {
        return custAddr;
    }

    /**
     * 家庭住址
     * @param custAddr 家庭住址
     */
    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr == null ? null : custAddr.trim();
    }

    /**
     * 现址居住年限
     * @return ADDR_YEARS 现址居住年限
     */
    public Integer getAddrYears() {
        return addrYears;
    }

    /**
     * 现址居住年限
     * @param addrYears 现址居住年限
     */
    public void setAddrYears(Integer addrYears) {
        this.addrYears = addrYears;
    }

    /**
     * 职位
     * @return JOB_TITLE 职位
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 职位
     * @param jobTitle 职位
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    /**
     * 职称
     * @return OCCUPATION_TITLE 职称
     */
    public String getOccupationTitle() {
        return occupationTitle;
    }

    /**
     * 职称
     * @param occupationTitle 职称
     */
    public void setOccupationTitle(String occupationTitle) {
        this.occupationTitle = occupationTitle == null ? null : occupationTitle.trim();
    }

    /**
     * 月收入水平
     * @return MONTHLY_INCOME 月收入水平
     */
    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * 月收入水平
     * @param monthlyIncome 月收入水平
     */
    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    /**
     * 现单位工龄
     * @return UNIT_SERVICE 现单位工龄
     */
    public Integer getUnitService() {
        return unitService;
    }

    /**
     * 现单位工龄
     * @param unitService 现单位工龄
     */
    public void setUnitService(Integer unitService) {
        this.unitService = unitService;
    }

    /**
     * 电子邮箱
     * @return CUST_EMAIL 电子邮箱
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * 电子邮箱
     * @param custEmail 电子邮箱
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    /**
     * 公安司法不良记录
     * @return BAD_RECORD 公安司法不良记录
     */
    public String getBadRecord() {
        return badRecord;
    }

    /**
     * 公安司法不良记录
     * @param badRecord 公安司法不良记录
     */
    public void setBadRecord(String badRecord) {
        this.badRecord = badRecord == null ? null : badRecord.trim();
    }

    /**
     * 单位性质
     * @return UNIT_TYPE 单位性质
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * 单位性质
     * @param unitType 单位性质
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    /**
     * 单位地址
     * @return COMPANY_ADDR 单位地址
     */
    public String getCompanyAddr() {
        return companyAddr;
    }

    /**
     * 单位地址
     * @param companyAddr 单位地址
     */
    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr == null ? null : companyAddr.trim();
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
     * 单位名称
     * @return COMPANY_NAME 单位名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 单位名称
     * @param companyName 单位名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 客户归属
     * @return BELONG_USER_ID 客户归属
     */
    public Integer getBelongUserId() {
        return belongUserId;
    }

    /**
     * 客户归属
     * @param belongUserId 客户归属
     */
    public void setBelongUserId(Integer belongUserId) {
        this.belongUserId = belongUserId;
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
     * @return CREATE_OR 创建用户
     */
    public Integer getCreateOr() {
        return createOr;
    }

    /**
     * 创建用户
     * @param createOr 创建用户
     */
    public void setCreateOr(Integer createOr) {
        this.createOr = createOr;
    }

    /**
     * 更新时间
     * @return UPDATE_DATE 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 更新者
     * @return UPDATE_OR 更新者
     */
    public Integer getUpdateOr() {
        return updateOr;
    }

    /**
     * 更新者
     * @param updateOr 更新者
     */
    public void setUpdateOr(Integer updateOr) {
        this.updateOr = updateOr;
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
        CustomerInfo other = (CustomerInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustGender() == null ? other.getCustGender() == null : this.getCustGender().equals(other.getCustGender()))
            && (this.getCustAge() == null ? other.getCustAge() == null : this.getCustAge().equals(other.getCustAge()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getIdentifyType() == null ? other.getIdentifyType() == null : this.getIdentifyType().equals(other.getIdentifyType()))
            && (this.getIdentifyNum() == null ? other.getIdentifyNum() == null : this.getIdentifyNum().equals(other.getIdentifyNum()))
            && (this.getMaritalStatus() == null ? other.getMaritalStatus() == null : this.getMaritalStatus().equals(other.getMaritalStatus()))
            && (this.getCustEducation() == null ? other.getCustEducation() == null : this.getCustEducation().equals(other.getCustEducation()))
            && (this.getCustCensus() == null ? other.getCustCensus() == null : this.getCustCensus().equals(other.getCustCensus()))
            && (this.getCustAddr() == null ? other.getCustAddr() == null : this.getCustAddr().equals(other.getCustAddr()))
            && (this.getAddrYears() == null ? other.getAddrYears() == null : this.getAddrYears().equals(other.getAddrYears()))
            && (this.getJobTitle() == null ? other.getJobTitle() == null : this.getJobTitle().equals(other.getJobTitle()))
            && (this.getOccupationTitle() == null ? other.getOccupationTitle() == null : this.getOccupationTitle().equals(other.getOccupationTitle()))
            && (this.getMonthlyIncome() == null ? other.getMonthlyIncome() == null : this.getMonthlyIncome().equals(other.getMonthlyIncome()))
            && (this.getUnitService() == null ? other.getUnitService() == null : this.getUnitService().equals(other.getUnitService()))
            && (this.getCustEmail() == null ? other.getCustEmail() == null : this.getCustEmail().equals(other.getCustEmail()))
            && (this.getBadRecord() == null ? other.getBadRecord() == null : this.getBadRecord().equals(other.getBadRecord()))
            && (this.getUnitType() == null ? other.getUnitType() == null : this.getUnitType().equals(other.getUnitType()))
            && (this.getCompanyAddr() == null ? other.getCompanyAddr() == null : this.getCompanyAddr().equals(other.getCompanyAddr()))
            && (this.getCompanyPhone() == null ? other.getCompanyPhone() == null : this.getCompanyPhone().equals(other.getCompanyPhone()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getBelongUserId() == null ? other.getBelongUserId() == null : this.getBelongUserId().equals(other.getBelongUserId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateOr() == null ? other.getCreateOr() == null : this.getCreateOr().equals(other.getCreateOr()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getUpdateOr() == null ? other.getUpdateOr() == null : this.getUpdateOr().equals(other.getUpdateOr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustGender() == null) ? 0 : getCustGender().hashCode());
        result = prime * result + ((getCustAge() == null) ? 0 : getCustAge().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
        result = prime * result + ((getIdentifyType() == null) ? 0 : getIdentifyType().hashCode());
        result = prime * result + ((getIdentifyNum() == null) ? 0 : getIdentifyNum().hashCode());
        result = prime * result + ((getMaritalStatus() == null) ? 0 : getMaritalStatus().hashCode());
        result = prime * result + ((getCustEducation() == null) ? 0 : getCustEducation().hashCode());
        result = prime * result + ((getCustCensus() == null) ? 0 : getCustCensus().hashCode());
        result = prime * result + ((getCustAddr() == null) ? 0 : getCustAddr().hashCode());
        result = prime * result + ((getAddrYears() == null) ? 0 : getAddrYears().hashCode());
        result = prime * result + ((getJobTitle() == null) ? 0 : getJobTitle().hashCode());
        result = prime * result + ((getOccupationTitle() == null) ? 0 : getOccupationTitle().hashCode());
        result = prime * result + ((getMonthlyIncome() == null) ? 0 : getMonthlyIncome().hashCode());
        result = prime * result + ((getUnitService() == null) ? 0 : getUnitService().hashCode());
        result = prime * result + ((getCustEmail() == null) ? 0 : getCustEmail().hashCode());
        result = prime * result + ((getBadRecord() == null) ? 0 : getBadRecord().hashCode());
        result = prime * result + ((getUnitType() == null) ? 0 : getUnitType().hashCode());
        result = prime * result + ((getCompanyAddr() == null) ? 0 : getCompanyAddr().hashCode());
        result = prime * result + ((getCompanyPhone() == null) ? 0 : getCompanyPhone().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getBelongUserId() == null) ? 0 : getBelongUserId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreateOr() == null) ? 0 : getCreateOr().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getUpdateOr() == null) ? 0 : getUpdateOr().hashCode());
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
        sb.append(", custGender=").append(custGender);
        sb.append(", custAge=").append(custAge);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", identifyType=").append(identifyType);
        sb.append(", identifyNum=").append(identifyNum);
        sb.append(", maritalStatus=").append(maritalStatus);
        sb.append(", custEducation=").append(custEducation);
        sb.append(", custCensus=").append(custCensus);
        sb.append(", custAddr=").append(custAddr);
        sb.append(", addrYears=").append(addrYears);
        sb.append(", jobTitle=").append(jobTitle);
        sb.append(", occupationTitle=").append(occupationTitle);
        sb.append(", monthlyIncome=").append(monthlyIncome);
        sb.append(", unitService=").append(unitService);
        sb.append(", custEmail=").append(custEmail);
        sb.append(", badRecord=").append(badRecord);
        sb.append(", unitType=").append(unitType);
        sb.append(", companyAddr=").append(companyAddr);
        sb.append(", companyPhone=").append(companyPhone);
        sb.append(", companyName=").append(companyName);
        sb.append(", belongUserId=").append(belongUserId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createOr=").append(createOr);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateOr=").append(updateOr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}