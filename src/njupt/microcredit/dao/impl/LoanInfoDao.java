package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ILoanInfoDao;
import njupt.microcredit.entity.LoanInfo;
/**
 * 实现贷款信息的增删改查
 * @author wyl
 *
 */
public class LoanInfoDao implements ILoanInfoDao{

	//容器注入
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(LoanInfo loanInfo) {
		sessionFactory.getCurrentSession().save(loanInfo);
		
	}

	@Override
	public void update(LoanInfo loanInfo) {
		sessionFactory.getCurrentSession().update(loanInfo);
		
	}

	@Override
	public void delete(int id) {
		sessionFactory.getCurrentSession()
		.createQuery("delete from LoanInfo where loanId=?")
		.setParameter(0, id)
		.executeUpdate();
		
	}

	@Override
	public LoanInfo findById(int id) {
		
		return (LoanInfo) sessionFactory.getCurrentSession().get(LoanInfo.class, id);
	}

	@Override
	public List<LoanInfo> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from LoanInfo").list();
	}

}
