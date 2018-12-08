package njupt.microcredit.service;

import java.util.List;

import njupt.microcredit.entity.LegalPersonInfo;

public interface ILegalPersonInfoService {
	
	public void deleteByPrimaryKey(Integer id);

    public void insert(LegalPersonInfo legalPersonInfo);  

    public LegalPersonInfo selectByPrimaryKey(Integer id);
    
    public List<LegalPersonInfo> selectByCustId(Integer custId);

    public void updateByPrimaryKey(LegalPersonInfo legalPersonInfo);

}
