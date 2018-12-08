package njupt.microcredit.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ILoanApplyInfoDao;
import njupt.microcredit.entity.LoanApplyInfo;

public class LoanApplyInfoDao implements ILoanApplyInfoDao {

	//容器注入
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void deleteByPrimaryKey(Integer loanId) {
		sessionFactory.getCurrentSession().createQuery("delete from LoanApplyInfo where loanId=?")
					  .setParameter(0, loanId)
					  .executeUpdate();

	}

	@Override
	public void insert(LoanApplyInfo loanApplyInfo) {
		sessionFactory.getCurrentSession().save(loanApplyInfo);

	}

	@Override
	public LoanApplyInfo selectByPrimaryKey(Integer loanId) {
		
		return (LoanApplyInfo) sessionFactory.getCurrentSession().get(LoanApplyInfo.class, loanId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanApplyInfo> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from LoanApplyInfo").list();
	}

	@Override
	public void updateByPrimaryKey(LoanApplyInfo loanApplyInfo) {
		sessionFactory.getCurrentSession().update(loanApplyInfo);

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getList() {
		
		return sessionFactory.getCurrentSession()
							 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
							 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
							 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2").list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getPersonList() {
		
		return sessionFactory.getCurrentSession()
				 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
				 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1").list();
	}

}
