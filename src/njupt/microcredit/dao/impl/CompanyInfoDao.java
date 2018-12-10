package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ICompanyInfoDao;
import njupt.microcredit.entity.CompanyInfo;

public class CompanyInfoDao implements ICompanyInfoDao {
	
	//容器注入
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void deleteByPrimaryKey(Integer id) {
		sessionFactory.getCurrentSession()
					  .createQuery("delete from CompanyInfo where id=?")
					  .setParameter(0, id).executeUpdate();

	}

	@Override
	public void insert(CompanyInfo companyInfo) {
		sessionFactory.getCurrentSession().save(companyInfo);

	}

	@Override
	public CompanyInfo selectByPrimaryKey(Integer id) {
		
		return (CompanyInfo) sessionFactory.getCurrentSession().get(CompanyInfo.class, id);
	}

	@Override
	public void updateByPrimaryKey(CompanyInfo companyInfo) {
		sessionFactory.getCurrentSession().update(companyInfo);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CompanyInfo> selectByCustId(Integer custId) {
		
		return sessionFactory.getCurrentSession()
							 .createQuery("from CompanyInfo where CUST_ID=?")
							 .setParameter(0, custId).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> selectOtherCompanyInfo() {
		
		return sessionFactory.getCurrentSession()
				.createSQLQuery("select b.ID,b.CUST_NAME,a.ID,a.LICENSE_NUM,c.ID,c.CUST_TYPE,c.IDENTIFY_NUM,b.COMPANY_PHONE,d.CUST_ID,d.CREATE_OR \r\n" + 
						"from business_info a,company_info b,legal_person_info c,cust_basic_info d \r\n" + 
						"where d.CUST_ID=a.CUST_ID and d.CUST_ID=b.CUST_ID and d.CUST_ID=c.CUST_ID ").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> selectFuzzyQuery(String companyName, String licenseNum, String legalPerson) {
		List<Object[]> resultSet = null;
		
		if("".equals(companyName) && "".equals(licenseNum) && "".equals(legalPerson)) {
			resultSet = sessionFactory.getCurrentSession()
					.createSQLQuery("select b.ID,b.CUST_NAME,a.ID,a.LICENSE_NUM,c.ID,c.CUST_TYPE,c.IDENTIFY_NUM,b.COMPANY_PHONE,d.CUST_ID,d.CREATE_OR \r\n" + 
							"from business_info a,company_info b,legal_person_info c,cust_basic_info d \r\n" + 
							"where d.CUST_ID=a.CUST_ID and d.CUST_ID=b.CUST_ID and d.CUST_ID=c.CUST_ID "
							+ "and b.CUST_NAME=? and a.LICENSE_NUM=? and (c.CUST_TYPE=? or c.IDENTIFY_NUM=?)")
					.setParameter(0, companyName)
					.setParameter(1, licenseNum)
					.setParameter(2, legalPerson)
					.setParameter(3, legalPerson)
					.list();
		}else{
			resultSet = sessionFactory.getCurrentSession()
					.createSQLQuery("select b.ID,b.CUST_NAME,a.ID,a.LICENSE_NUM,c.ID,c.CUST_TYPE,c.IDENTIFY_NUM,b.COMPANY_PHONE,d.CUST_ID,d.CREATE_OR \r\n" + 
							"from business_info a,company_info b,legal_person_info c,cust_basic_info d \r\n" + 
							"where d.CUST_ID=a.CUST_ID and d.CUST_ID=b.CUST_ID and d.CUST_ID=c.CUST_ID "
							+ "and (b.CUST_NAME like ? or a.LICENSE_NUM like ? or c.CUST_TYPE like ? or c.IDENTIFY_NUM like ?)")
					.setParameter(0, "%" + companyName + "%")
					.setParameter(1, licenseNum + "%")
					.setParameter(2, legalPerson + "%")
					.setParameter(3, legalPerson + "%")
					.list();
		}
		
		return resultSet;
	}

}
