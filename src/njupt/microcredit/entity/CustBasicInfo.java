package njupt.microcredit.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 客户（企业或个人）基本信息
 * @author wyl
 *
 */
public class CustBasicInfo implements Serializable {
    /**
     * 客户id
     */
    private Integer custId;

    /**
     * 客户类型，1：对私客户 2：对公客户
     */
    private Integer customerType;

    /**
     * 是否黑名单，1：存量客户，2：黑名单人员
     */
    private Integer custIsBlack;

    /**
     * 操作黑名单日期
     */
    private Date optBlackDate;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建者
     */
    private Integer createOr;

    /**
     * cust_basic_info
     */
    private static final long serialVersionUID = 1L;

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
     * 客户类型，1：对私客户 2：对公客户
     * @return CUSTOMER_TYPE 客户类型，1：对私客户 2：对公客户
     */
    public Integer getCustomerType() {
        return customerType;
    }

    /**
     * 客户类型，1：对私客户 2：对公客户
     * @param customerType 客户类型，1：对私客户 2：对公客户
     */
    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    /**
     * 是否黑名单，1：存量客户，2：黑名单人员
     * @return CUST_IS_BLACK 是否黑名单，1：存量客户，2：黑名单人员
     */
    public Integer getCustIsBlack() {
        return custIsBlack;
    }

    /**
     * 是否黑名单，1：存量客户，2：黑名单人员
     * @param custIsBlack 是否黑名单，1：存量客户，2：黑名单人员
     */
    public void setCustIsBlack(Integer custIsBlack) {
        this.custIsBlack = custIsBlack;
    }

    /**
     * 操作黑名单日期
     * @return OPT_BLACK_DATE 操作黑名单日期
     */
    public Date getOptBlackDate() {
        return optBlackDate;
    }

    /**
     * 操作黑名单日期
     * @param optBlackDate 操作黑名单日期
     */
    public void setOptBlackDate(Date optBlackDate) {
        this.optBlackDate = optBlackDate;
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
     * 创建者
     * @return CREATE_OR 创建者
     */
    public Integer getCreateOr() {
        return createOr;
    }

    /**
     * 创建者
     * @param createOr 创建者
     */
    public void setCreateOr(Integer createOr) {
        this.createOr = createOr;
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
        CustBasicInfo other = (CustBasicInfo) that;
        return (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustomerType() == null ? other.getCustomerType() == null : this.getCustomerType().equals(other.getCustomerType()))
            && (this.getCustIsBlack() == null ? other.getCustIsBlack() == null : this.getCustIsBlack().equals(other.getCustIsBlack()))
            && (this.getOptBlackDate() == null ? other.getOptBlackDate() == null : this.getOptBlackDate().equals(other.getOptBlackDate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateOr() == null ? other.getCreateOr() == null : this.getCreateOr().equals(other.getCreateOr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustomerType() == null) ? 0 : getCustomerType().hashCode());
        result = prime * result + ((getCustIsBlack() == null) ? 0 : getCustIsBlack().hashCode());
        result = prime * result + ((getOptBlackDate() == null) ? 0 : getOptBlackDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreateOr() == null) ? 0 : getCreateOr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", customerType=").append(customerType);
        sb.append(", custIsBlack=").append(custIsBlack);
        sb.append(", optBlackDate=").append(optBlackDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", createOr=").append(createOr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}