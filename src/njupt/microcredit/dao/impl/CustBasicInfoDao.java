package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ICustBasicInfoDao;
import njupt.microcredit.entity.CustBasicInfo;

public class CustBasicInfoDao implements ICustBasicInfoDao {

	//容器注入
	private SessionFactory sessionFactory;	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void deleteByPrimaryKey(Integer custId) {
		
		sessionFactory.getCurrentSession()
					  .createQuery("delete from CustBasicInfo where custId=?")
					  .setParameter(0, custId)
					  .executeUpdate();
	}

	@Override
	public void insert(CustBasicInfo custBasicInfo) {
		sessionFactory.getCurrentSession().save(custBasicInfo);

	}


	@Override
	public CustBasicInfo selectByPrimaryKey(Integer custId) {
		
		return (CustBasicInfo) sessionFactory.getCurrentSession().get(CustBasicInfo.class, custId);
	}


	@Override
	public void updateByPrimaryKey(CustBasicInfo custBasicInfo) {
		sessionFactory.getCurrentSession().update(custBasicInfo);

	}

}
