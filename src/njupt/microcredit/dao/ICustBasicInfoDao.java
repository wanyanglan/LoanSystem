package njupt.microcredit.dao;

import java.util.List;

import njupt.microcredit.entity.CustBasicInfo;

public interface ICustBasicInfoDao {
	
	 public void deleteByPrimaryKey(Integer custId);

	 public void insert(CustBasicInfo custBasicInfo);

     public CustBasicInfo selectByPrimaryKey(Integer custId);

     public void updateByPrimaryKey(CustBasicInfo custBasicInfo);
     
    

}
