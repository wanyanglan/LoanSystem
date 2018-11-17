package njupt.microcredit.service;

import java.util.List;

import njupt.microcredit.entity.ClientInfo;

public interface IClientInfoService {
	/**
	 * 增加客户信息
	 * @param client
	 */
	public void save(ClientInfo clientInfo);
	
	/**
	 * 更新客户信息
	 * @param client
	 */
	public void update(ClientInfo clientInfo);
	
	/**
	 * 根据主键删除客户信息
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 根据主键查询客户信息
	 * @param id
	 * @return
	 */
	public ClientInfo findById(int id);
	
	/**
	 * 查询全部客户信息
	 * @return
	 */
	public List<ClientInfo> getAll();
	
	/**
	 * 根据客户姓名模糊查询
	 * @param clientName
	 * @return
	 */
	public List<ClientInfo> getAll(String clientName);

}
