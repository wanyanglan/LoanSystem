package njupt.microcredit.service.impl;

import java.util.List;

import njupt.microcredit.dao.ICustomerInfoDao;
import njupt.microcredit.entity.CustomerInfo;
import njupt.microcredit.service.ICustomerInfoService;

public class CustomerInfoService implements ICustomerInfoService {

	private ICustomerInfoDao customerInfoDao;
	public void setCustomerInfoDao(ICustomerInfoDao customerInfoDao) {
		this.customerInfoDao = customerInfoDao;
	}
	@Override
	public void deleteByPrimaryKey(Integer id) {
		customerInfoDao.deleteByPrimaryKey(id);

	}

	@Override
	public void insert(CustomerInfo customerInfo) {
		customerInfoDao.insert(customerInfo);

	}

	@Override
	public CustomerInfo selectByPrimaryKey(Integer id) {
		
		return customerInfoDao.selectByPrimaryKey(id);
	}

	@Override
	public List<CustomerInfo> getAll() {
		
		return customerInfoDao.getAll();
	}

	@Override
	public void updateByPrimaryKey(CustomerInfo customerInfo) {
		customerInfoDao.updateByPrimaryKey(customerInfo);

	}
	@Override
	public List<Object[]> selectByOtherInfo() {
		
		return customerInfoDao.selectByOtherInfo();
	}
	@Override
	public List<Object[]> selectFuzzyQuery(String firstCondition, String phoneNum) {
		
		return customerInfoDao.selectFuzzyQuery(firstCondition, phoneNum);
	}

}
