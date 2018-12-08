package njupt.microcredit.service.impl;

import java.util.HashMap;
import java.util.List;

import njupt.microcredit.dao.ILoanApplyInfoDao;
import njupt.microcredit.dao.impl.LoanApplyInfoDao;
import njupt.microcredit.entity.LoanApplyInfo;
import njupt.microcredit.service.ILoanApplyInfoService;

public class LoanApplyInfoService implements ILoanApplyInfoService {

	private ILoanApplyInfoDao loanApplyInfoDao;
	public void setLoanApplyInfoDao(ILoanApplyInfoDao loanApplyInfoDao) {
		this.loanApplyInfoDao = loanApplyInfoDao;
	}
	@Override
	public void deleteByPrimaryKey(Integer loanId) {
		loanApplyInfoDao.deleteByPrimaryKey(loanId);
		
	}
	@Override
	public void insert(LoanApplyInfo loanApplyInfo) {
		loanApplyInfoDao.insert(loanApplyInfo);
		
	}
	@Override
	public LoanApplyInfo selectByPrimaryKey(Integer loanId) {
		
		return loanApplyInfoDao.selectByPrimaryKey(loanId);
	}
	@Override
	public List<LoanApplyInfo> getAll() {
		
		return loanApplyInfoDao.getAll();
	}
	@Override
	public void updateByPrimaryKey(LoanApplyInfo loanApplyInfo) {
		loanApplyInfoDao.updateByPrimaryKey(loanApplyInfo);
		
	}
	@Override
	public List<Object[]> getList() {
		
		return loanApplyInfoDao.getList();
	}
	@Override
	public List<Object[]> getPersonList() {
		
		return loanApplyInfoDao.getPersonList();
	}
	

	

}
