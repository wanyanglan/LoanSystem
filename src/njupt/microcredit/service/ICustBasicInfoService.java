package njupt.microcredit.service;

import njupt.microcredit.entity.CustBasicInfo;

public interface ICustBasicInfoService {
	
	 public void deleteByPrimaryKey(Integer custId);

	 public void insert(CustBasicInfo custBasicInfo);

     public CustBasicInfo selectByPrimaryKey(Integer custId);

     public void updateByPrimaryKey(CustBasicInfo custBasicInfo);

}
