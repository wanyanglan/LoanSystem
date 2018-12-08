package njupt.microcredit.service.impl;

import java.util.List;

import njupt.microcredit.dao.ILegalPersonInfoDao;
import njupt.microcredit.entity.LegalPersonInfo;
import njupt.microcredit.service.ILegalPersonInfoService;

public class LegalPersonInfoService implements ILegalPersonInfoService {

	private ILegalPersonInfoDao legalPersonInfoDao;
	public void setLegalPersonInfoDao(ILegalPersonInfoDao legalPersonInfoDao) {
		this.legalPersonInfoDao = legalPersonInfoDao;
	}
	@Override
	public void deleteByPrimaryKey(Integer id) {
		legalPersonInfoDao.deleteByPrimaryKey(id);

	}

	@Override
	public void insert(LegalPersonInfo legalPersonInfo) {
		legalPersonInfoDao.insert(legalPersonInfo);

	}

	@Override
	public LegalPersonInfo selectByPrimaryKey(Integer id) {
		
		return legalPersonInfoDao.selectByPrimaryKey(id);
	}

	@Override
	public void updateByPrimaryKey(LegalPersonInfo legalPersonInfo) {
		legalPersonInfoDao.updateByPrimaryKey(legalPersonInfo);

	}
	@Override
	public List<LegalPersonInfo> selectByCustId(Integer custId) {
		
		return legalPersonInfoDao.selectByCustId(custId);
	}

}
