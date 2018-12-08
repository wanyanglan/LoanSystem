package njupt.microcredit.service.impl;

import java.util.List;

import njupt.microcredit.dao.IBusinessInfoDao;
import njupt.microcredit.entity.BusinessInfo;
import njupt.microcredit.service.IBusinessInfoService;

public class BusinessInfoService implements IBusinessInfoService {
	
	//注入IBusinessInfoDao类的Dao
	private IBusinessInfoDao businessInfoDao;
	public void setBusinessInfoDao(IBusinessInfoDao businessInfoDao) {
		this.businessInfoDao = businessInfoDao;
	}
	
	@Override
	public void deletePrimaryKey(Integer id) {
		businessInfoDao.deletePrimaryKey(id);

	}

	@Override
	public void insert(BusinessInfo businessInfo) {
		businessInfoDao.insert(businessInfo);

	}

	@Override
	public BusinessInfo selectByPrimaryKey(Integer id) {
		
		return businessInfoDao.selectByPrimaryKey(id);
	}

	@Override
	public void updateByPrimaryKeySelective(BusinessInfo businessInfo) {
		businessInfoDao.updateByPrimaryKeySelective(businessInfo);

	}

	@Override
	public List<BusinessInfo> selectByCustId(Integer custId) {
		
		return businessInfoDao.selectByCustId(custId);
	}

}
