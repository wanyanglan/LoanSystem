package njupt.microcredit.service.impl;

import njupt.microcredit.dao.ICustBasicInfoDao;
import njupt.microcredit.entity.CustBasicInfo;
import njupt.microcredit.service.ICustBasicInfoService;

public class CustBasicInfoService implements ICustBasicInfoService{

	private ICustBasicInfoDao custBasicInfoDao;
	public void setCustBasicInfoDao(ICustBasicInfoDao custBasicInfoDao) {
		this.custBasicInfoDao = custBasicInfoDao;
	}
	
	@Override
	public void deleteByPrimaryKey(Integer custId) {
		custBasicInfoDao.deleteByPrimaryKey(custId);

	}

	@Override
	public void insert(CustBasicInfo custBasicInfo) {
		custBasicInfoDao.insert(custBasicInfo);

	}

	@Override
	public void updateByPrimaryKey(CustBasicInfo custBasicInfo) {
		custBasicInfoDao.updateByPrimaryKey(custBasicInfo);

	}

	@Override
	public CustBasicInfo selectByPrimaryKey(Integer custId) {
		
		return custBasicInfoDao.selectByPrimaryKey(custId);
	}

}
