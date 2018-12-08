package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.IBusinessInfoDao;
import njupt.microcredit.entity.BusinessInfo;

public class BusinessInfoDao implements IBusinessInfoDao {

	//容器注入
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void deletePrimaryKey(Integer id) {
		sessionFactory.getCurrentSession()
				.createQuery("delete from BusinessInfo where id=?")
				.setParameter(0, id).executeUpdate();
	}

	@Override
	public void insert(BusinessInfo businessInfo) {
		sessionFactory.getCurrentSession().save(businessInfo);

	}

	@Override
	public BusinessInfo selectByPrimaryKey(Integer id) {
		
		return (BusinessInfo) sessionFactory.getCurrentSession().get(BusinessInfo.class, id);
	}
	
	
	@Override
	public void updateByPrimaryKeySelective(BusinessInfo businessInfo) {
		sessionFactory.getCurrentSession().update(businessInfo);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BusinessInfo> selectByCustId(Integer custId) {
		
		return  sessionFactory.getCurrentSession()
							  .createQuery("from BusinessInfo where CUST_ID=?")
							  .setParameter(0, custId).list();
	}
	
	
	
	

}
