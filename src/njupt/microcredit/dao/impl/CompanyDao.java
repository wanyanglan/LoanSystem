package njupt.microcredit.dao.impl;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ICompanyDao;
import njupt.microcredit.entity.Company;
import njupt.microcredit.entity.CompanyInfo;

public class CompanyDao implements ICompanyDao {

	//容器注入
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void insert(Company company) {
		sessionFactory.getCurrentSession().save(company);
	}

	@Override
	public Company selectByPrimaryKey(String id) {
		return (Company) sessionFactory.getCurrentSession().get(Company.class, id);
	}

}
