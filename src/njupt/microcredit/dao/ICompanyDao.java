package njupt.microcredit.dao;

import njupt.microcredit.entity.BusinessInfo;
import njupt.microcredit.entity.Company;

/**
 * 公司信息接口模块
 *
 */
public interface ICompanyDao {
	
	/**
	 * 增加公司信息
	 * @param businessInfo
	 * @return
	 */
	public void insert(Company company);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    public Company selectByPrimaryKey(String id);
}
