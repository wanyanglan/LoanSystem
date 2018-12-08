package njupt.microcredit.dao;

import java.util.HashMap;
import java.util.List;

import njupt.microcredit.entity.LoanApplyInfo;

/**
 *贷款申请信息接口设计
 * @author wyl
 *
 */
public interface ILoanApplyInfoDao {
	public void deleteByPrimaryKey(Integer loanId);

    public void insert(LoanApplyInfo loanApplyInfo);

    public LoanApplyInfo selectByPrimaryKey(Integer loanId);
    
    

    public List<LoanApplyInfo> getAll();

   
    public void updateByPrimaryKey(LoanApplyInfo loanApplyInfo); 
    
    //查询企业的的贷款信息
    public List<Object[]> getList();
    
    //查询个人的的贷款信息
    public List<Object[]> getPersonList();

}
