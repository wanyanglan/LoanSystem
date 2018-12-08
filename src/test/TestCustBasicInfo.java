package test;

import java.util.Date;

import org.junit.Test;

import njupt.microcredit.entity.CustBasicInfo;
import njupt.microcredit.service.impl.CustBasicInfoService;

public class TestCustBasicInfo {
	
	@Test
	public void testBasicInfo() {
		CustBasicInfo custBasicInfo = new CustBasicInfo();
		custBasicInfo.setCustId((int)new Date().getTime());
		custBasicInfo.setCustomerType(2);
		System.out.println(custBasicInfo.toString());
		
		CustBasicInfoService custBasicInfoService = new CustBasicInfoService();
		custBasicInfoService.insert(custBasicInfo);
		
	}

}
