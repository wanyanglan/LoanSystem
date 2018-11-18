package njupt.microcredit.service.impl;

import java.util.List;

import njupt.microcredit.dao.IClientInfoDao;
import njupt.microcredit.dao.impl.ClientInfoDao;
import njupt.microcredit.entity.ClientInfo;
import njupt.microcredit.service.IClientInfoService;

public class ClientInfoService implements IClientInfoService{

	//注入IClientInfoDao类的dao
	private IClientInfoDao clientInfoDao;
	public void setClientInfoDao(IClientInfoDao clientInfoDao) {
		this.clientInfoDao = clientInfoDao;
	}
	
	
	@Override
	public void save(ClientInfo clientInfo) {
		clientInfoDao.save(clientInfo);
		
	}

	@Override
	public void update(ClientInfo clientInfo) {
		clientInfoDao.update(clientInfo);
		
	}

	@Override
	public void delete(int id) {
		clientInfoDao.delete(id);
		
	}

	@Override
	public ClientInfo findById(int id) {
		
		return clientInfoDao.findById(id);
	}

	@Override
	public List<ClientInfo> getAll() {
		
		return clientInfoDao.getAll();
	}

	@Override
	public List<ClientInfo> getAll(String clientName) {
		
		return clientInfoDao.getAll(clientName);
	}

}
