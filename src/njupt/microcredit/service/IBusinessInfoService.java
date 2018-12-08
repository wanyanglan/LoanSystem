package njupt.microcredit.service;

import java.util.List;

import njupt.microcredit.entity.BusinessInfo;

public interface IBusinessInfoService {
	
	/**
	 * 根据主键删除
	 * @param id
	 * @return
	 */
	public void deletePrimaryKey(Integer id);
	
	/**
	 * 增加企业经营信息
	 * @param businessInfo
	 * @return
	 */
	public void insert(BusinessInfo businessInfo);


    /**
     * 根据主键查询
     * @param id
     * @return
     */
    public BusinessInfo selectByPrimaryKey(Integer id);
    
    public List<BusinessInfo> selectByCustId(Integer custId);
    
    /**
     * 有条件的更新信息
     * @param record
     */
    public void updateByPrimaryKeySelective(BusinessInfo businessInfo);

}
