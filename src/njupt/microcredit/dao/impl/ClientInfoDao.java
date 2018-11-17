package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.IClientInfoDao;
import njupt.microcredit.entity.ClientInfo;

public class ClientInfoDao implements IClientInfoDao{
	//容器注入
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(ClientInfo clientInfo) {
		
		
	}

	@Override
	public void update(ClientInfo clientInfo) {
		
		
	}

	@Override
	public void delete(int id) {
		
		
	}

	@Override
	public ClientInfo findById(int id) {
		
		return null;
	}

	@Override
	public List<ClientInfo> getAll() {
		
		return null;
	}

	@Override
	public List<ClientInfo> getAll(String clientName) {
		
		return null;
	}

}
