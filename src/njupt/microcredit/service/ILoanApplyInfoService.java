package njupt.microcredit.service;

import java.util.HashMap;
import java.util.List;

import njupt.microcredit.entity.LoanApplyInfo;

public interface ILoanApplyInfoService {
	
	public void deleteByPrimaryKey(Integer loanId);

    public void insert(LoanApplyInfo loanApplyInfo);

    public LoanApplyInfo selectByPrimaryKey(Integer loanId);

    public List<LoanApplyInfo> getAll();

    public void updateByPrimaryKey(LoanApplyInfo loanApplyInfo);
    
    public List<Object[]> getList();
    
  //查询个人的的贷款信息
    public List<Object[]> getPersonList();
    
    //根据个人的贷款条件查询
    public List<Object[]> selectPersonCondition(String privateclient,String clientinfo,String loantype,
    		String applytime1,String applytime2);
    
  //根据企业的贷款条件查询
    public List<Object[]> selectCompanyCondition(String privateclient,String clientinfo,String loantype,
    		String applytime1,String applytime2);

}
