package njupt.microcredit.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 法人信息
 * @author wyl
 *
 */
public class LegalPersonInfo implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 客户ID
     */
    private Integer custId;

    /**
     * 法人姓名
     */
    private String custType;

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
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建用户
     */
    private Integer createUser;

    /**
     * legal_person_info
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
     * 法人姓名
     * @return CUST_TYPE 法人姓名
     */
    public String getCustType() {
        return custType;
    }

    /**
     * 法人姓名
     * @param custType 法人姓名
     */
    public void setCustType(String custType) {
        this.custType = custType;
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
        LegalPersonInfo other = (LegalPersonInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustType() == null ? other.getCustType() == null : this.getCustType().equals(other.getCustType()))
            && (this.getIdentifyType() == null ? other.getIdentifyType() == null : this.getIdentifyType().equals(other.getIdentifyType()))
            && (this.getIdentifyNum() == null ? other.getIdentifyNum() == null : this.getIdentifyNum().equals(other.getIdentifyNum()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustType() == null) ? 0 : getCustType().hashCode());
        result = prime * result + ((getIdentifyType() == null) ? 0 : getIdentifyType().hashCode());
        result = prime * result + ((getIdentifyNum() == null) ? 0 : getIdentifyNum().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
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
        sb.append(", custType=").append(custType);
        sb.append(", identifyType=").append(identifyType);
        sb.append(", identifyNum=").append(identifyNum);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}