package njupt.microcredit.service;

import java.util.List;

import njupt.microcredit.entity.CustomerInfo;

public interface ICustomerInfoService {
	
	public void deleteByPrimaryKey(Integer id);

    public void insert(CustomerInfo customerInfo);

    public CustomerInfo selectByPrimaryKey(Integer id);
    
    public List<CustomerInfo> getAll();

    public void updateByPrimaryKey(CustomerInfo customerInfo);

}
