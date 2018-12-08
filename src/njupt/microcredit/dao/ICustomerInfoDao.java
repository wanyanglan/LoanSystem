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

}
