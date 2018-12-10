package njupt.microcredit.service.impl;

import java.util.List;

import njupt.microcredit.dao.ICompanyInfoDao;
import njupt.microcredit.entity.CompanyInfo;
import njupt.microcredit.service.ICompanyInfoService;

public class CompanyInfoService implements ICompanyInfoService {

	private ICompanyInfoDao companyInfoDao;
	public void setCompanyInfoDao(ICompanyInfoDao companyInfoDao) {
		this.companyInfoDao = companyInfoDao;
	}
	@Override
	public void deleteByPrimaryKey(Integer id) {
		companyInfoDao.deleteByPrimaryKey(id);

	}

	@Override
	public void insert(CompanyInfo companyInfo) {
		companyInfoDao.insert(companyInfo);

	}

	@Override
	public CompanyInfo selectByPrimaryKey(Integer id) {
		
		return companyInfoDao.selectByPrimaryKey(id);
	}

	@Override
	public void updateByPrimaryKey(CompanyInfo companyInfo) {
		companyInfoDao.updateByPrimaryKey(companyInfo);

	}
	@Override
	public List<CompanyInfo> selectByCustId(Integer custId) {
		
		return companyInfoDao.selectByCustId(custId);
	}
	@Override
	public List<Object[]> selectOtherCompanyInfo() {
		
		return companyInfoDao.selectOtherCompanyInfo();
	}
	@Override
	public List<Object[]> selectFuzzyQuery(String companyName, String licenseNum, String legalPersonInfo) {
		
		return companyInfoDao.selectFuzzyQuery(companyName, licenseNum, legalPersonInfo);
	}
	
}
