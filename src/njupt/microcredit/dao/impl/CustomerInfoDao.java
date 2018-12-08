package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ICustomerInfoDao;
import njupt.microcredit.entity.CustomerInfo;

public class CustomerInfoDao implements ICustomerInfoDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void deleteByPrimaryKey(Integer id) {
		sessionFactory.getCurrentSession()
					  .createQuery("delete from CustomerInfo where id=?")
					  .setParameter(0, id)
					  .executeUpdate();

	}

	@Override
	public void insert(CustomerInfo customerInfo) {
		sessionFactory.getCurrentSession().save(customerInfo);

	}

	@Override
	public CustomerInfo selectByPrimaryKey(Integer id) {
		
		return (CustomerInfo) sessionFactory.getCurrentSession().get(CustomerInfo.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerInfo> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from CustomerInfo").list();
	}

	@Override
	public void updateByPrimaryKey(CustomerInfo customerInfo) {
		sessionFactory.getCurrentSession().update(customerInfo);

	}

}
