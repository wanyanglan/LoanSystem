package njupt.microcredit.dao;

import java.util.List;

import njupt.microcredit.entity.LegalPersonInfo;

/**
 * 法人代表信息接口设计
 * @author wyl
 *
 */
public interface ILegalPersonInfoDao {
	
	public void deleteByPrimaryKey(Integer id);

    public void insert(LegalPersonInfo legalPersonInfo);  

    public LegalPersonInfo selectByPrimaryKey(Integer id);
    
    public List<LegalPersonInfo> selectByCustId(Integer custId);

    public void updateByPrimaryKey(LegalPersonInfo legalPersonInfo);

}
