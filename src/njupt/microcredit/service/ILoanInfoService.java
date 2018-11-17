package njupt.microcredit.service;

import java.util.List;

import njupt.microcredit.entity.LoanInfo;

public interface ILoanInfoService {
	/**
	 * 贷款信息保存
	 * @param loanInfo
	 */
	public void save(LoanInfo loanInfo);
	
	/**
	 * 贷款信息更新
	 * @param loanInfo
	 */
	public void update(LoanInfo loanInfo);
	
	/**
	 * 根据主键删除
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 */
	public LoanInfo findById(int id);
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<LoanInfo> getAll();

}
