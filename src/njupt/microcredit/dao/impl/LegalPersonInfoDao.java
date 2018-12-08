package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ILegalPersonInfoDao;
import njupt.microcredit.entity.LegalPersonInfo;

public class LegalPersonInfoDao implements ILegalPersonInfoDao {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void deleteByPrimaryKey(Integer id) {
		sessionFactory.getCurrentSession().createQuery("delete from LegalPersonInfo where id=?")
					  .setParameter(0, id)
					  .executeUpdate();

	}

	@Override
	public void insert(LegalPersonInfo legalPersonInfo) {
		sessionFactory.getCurrentSession().save(legalPersonInfo);

	}

	@Override
	public LegalPersonInfo selectByPrimaryKey(Integer id) {
		
		return (LegalPersonInfo) sessionFactory.getCurrentSession().get(LegalPersonInfo.class, id);
	}

	@Override
	public void updateByPrimaryKey(LegalPersonInfo legalPersonInfo) {
		sessionFactory.getCurrentSession().update(legalPersonInfo);

	}

	@Override
	public List<LegalPersonInfo> selectByCustId(Integer custId) {
		
		return sessionFactory.getCurrentSession()
						   .createQuery("from LegalPersonInfo where CUST_ID=?")
						   .setParameter(0, custId).list();
	}

}
