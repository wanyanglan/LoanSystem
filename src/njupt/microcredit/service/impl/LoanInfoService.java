package njupt.microcredit.service.impl;

import java.util.List;

import njupt.microcredit.dao.ILoanInfoDao;
import njupt.microcredit.entity.LoanInfo;
import njupt.microcredit.service.ILoanInfoService;

public class LoanInfoService implements ILoanInfoService{

	////注入ILoanInfoDao类的dao
	private ILoanInfoDao loanInfoDao;
	public void setLoanInfoDao(ILoanInfoDao loanInfoDao) {
		this.loanInfoDao = loanInfoDao;
	}
	
	@Override
	public void save(LoanInfo loanInfo) {
		loanInfoDao.save(loanInfo);
		
	}

	@Override
	public void update(LoanInfo loanInfo) {
		loanInfoDao.update(loanInfo);
		
	}

	@Override
	public void delete(int id) {
		loanInfoDao.delete(id);
		
	}

	@Override
	public LoanInfo findById(int id) {
		
		return loanInfoDao.findById(id);
	}

	@Override
	public List<LoanInfo> getAll() {
		
		return loanInfoDao.getAll();
	}

}
