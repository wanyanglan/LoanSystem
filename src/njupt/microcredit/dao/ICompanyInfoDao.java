package njupt.microcredit.dao;

import java.util.List;

import njupt.microcredit.entity.CompanyInfo;

/**
 * 企业信息查询
 * @author wyl
 *
 */
public interface ICompanyInfoDao {
	
	public void deleteByPrimaryKey(Integer id);

    public void insert(CompanyInfo companyInfo);    

    public CompanyInfo selectByPrimaryKey(Integer id);
    
    //根据客户信息查询
    public List<CompanyInfo> selectByCustId(Integer custId);

    public void updateByPrimaryKey(CompanyInfo companyInfo);
    
    /**
     * 查看对公客户的信息
     */
    public List<Object[]> selectOtherCompanyInfo();
    
    /**
     * 对公客户信息模糊查询
     */
    public List<Object[]> selectFuzzyQuery(String companyName, String licenseNum, String legalPersonInfo);

    

}
