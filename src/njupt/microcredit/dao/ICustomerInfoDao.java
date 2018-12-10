package njupt.microcredit.dao;

import java.util.List;

import njupt.microcredit.entity.CustomerInfo;



/**
 * 客户信息接口设计
 * @author wyl
 *
 */
public interface ICustomerInfoDao {
	
	public void deleteByPrimaryKey(Integer id);

    public void insert(CustomerInfo customerInfo);

    public CustomerInfo selectByPrimaryKey(Integer id);
    
    public List<CustomerInfo> getAll();

    public void updateByPrimaryKey(CustomerInfo customerInfo);
    
    /**
     * 对私客户查看客户的操作者
     * @return
     */
    public List<Object[]> selectByOtherInfo();
    
    /**
     * 对私客户信息模糊查询
     */
    public List<Object[]> selectFuzzyQuery(String firstCondition,String phoneNum);

}
