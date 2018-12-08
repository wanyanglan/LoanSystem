package njupt.microcredit.dao.impl;

import java.util.List;

import javax.persistence.criteria.From;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.IClientInfoDao;
import njupt.microcredit.entity.ClientInfo;

/**
 * 实现客户信息的增删改查功能
 * @author wyl
 *
 */
public class ClientInfoDao implements IClientInfoDao{
	//容器注入
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(ClientInfo clientInfo) {
		sessionFactory.getCurrentSession().save(clientInfo);
		
	}

	@Override
	public void update(ClientInfo clientInfo) {
		sessionFactory.getCurrentSession().update(clientInfo);
		
	}

	@Override
	public void delete(int id) {
		sessionFactory.getCurrentSession()
		              .createQuery("delete from ClientInfo where clientId=?")
		              .setParameter(0, id).executeUpdate();
		
	}

	@Override
	public ClientInfo findById(int id) {
		
		return (ClientInfo) sessionFactory.getCurrentSession().get(ClientInfo.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ClientInfo> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from ClientInfo").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ClientInfo> getAll(String clientName) {
		
		return sessionFactory.getCurrentSession()
				.createQuery("from ClientInfo where clientName like ?")
				.setParameter(0, "%"+clientName+"%")
				.list();
	}

}
