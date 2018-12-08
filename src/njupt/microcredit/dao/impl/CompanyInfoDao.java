package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ICompanyInfoDao;
import njupt.microcredit.entity.CompanyInfo;

public class CompanyInfoDao implements ICompanyInfoDao {
	
	//容器注入
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void deleteByPrimaryKey(Integer id) {
		sessionFactory.getCurrentSession()
					  .createQuery("delete from CompanyInfo where id=?")
					  .setParameter(0, id).executeUpdate();

	}

	@Override
	public void insert(CompanyInfo companyInfo) {
		sessionFactory.getCurrentSession().save(companyInfo);

	}

	@Override
	public CompanyInfo selectByPrimaryKey(Integer id) {
		
		return (CompanyInfo) sessionFactory.getCurrentSession().get(CompanyInfo.class, id);
	}

	@Override
	public void updateByPrimaryKey(CompanyInfo companyInfo) {
		sessionFactory.getCurrentSession().update(companyInfo);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CompanyInfo> selectByCustId(Integer custId) {
		
		return sessionFactory.getCurrentSession()
							 .createQuery("from CompanyInfo where CUST_ID=?")
							 .setParameter(0, custId).list();
	}

}
