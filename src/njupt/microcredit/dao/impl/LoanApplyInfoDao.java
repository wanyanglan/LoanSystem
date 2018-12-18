package njupt.microcredit.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.el.lang.ELArithmetic;
import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ILoanApplyInfoDao;
import njupt.microcredit.entity.LoanApplyInfo;

public class LoanApplyInfoDao implements ILoanApplyInfoDao {

	//容器注入
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void deleteByPrimaryKey(Integer loanId) {
		sessionFactory.getCurrentSession().createQuery("delete from LoanApplyInfo where loanId=?")
					  .setParameter(0, loanId)
					  .executeUpdate();

	}

	@Override
	public void insert(LoanApplyInfo loanApplyInfo) {
		sessionFactory.getCurrentSession().save(loanApplyInfo);

	}

	@Override
	public LoanApplyInfo selectByPrimaryKey(Integer loanId) {
		
		return (LoanApplyInfo) sessionFactory.getCurrentSession().get(LoanApplyInfo.class, loanId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanApplyInfo> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from LoanApplyInfo").list();
	}

	@Override
	public void updateByPrimaryKey(LoanApplyInfo loanApplyInfo) {
		sessionFactory.getCurrentSession().update(loanApplyInfo);

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getList() {
		
		return sessionFactory.getCurrentSession()
							 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
							 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
							 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2").list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getPersonList() {
		
		return sessionFactory.getCurrentSession()
				 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
				 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1").list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> selectPersonCondition(String privateclient, String clientinfo, String loantype,
			String applytime1, String applytime2) {
		List<Object[]> resultSet = null;
		//第一种方式
		if("".equals(clientinfo) && "".equals(loantype) && "".equals(applytime1) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1")
					 .list();	
		}else if(!("".equals(clientinfo)) && !("".equals(loantype)) && "".equals(applytime1) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and (a.CUST_NAME like ? or a.PHONE_NUM=? or a.IDENTIFY_NUM=? ) and b.LOAN_CLASS=?")
					 .setParameter(0, "%" + clientinfo + "%")
					 .setParameter(1, clientinfo)
					 .setParameter(2, clientinfo)
					 .setParameter(3, loantype)				
					 .list();
		}else if(!("".equals(clientinfo)) && "".equals(loantype) && !("".equals(applytime1)) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and (a.CUST_NAME like ? or a.PHONE_NUM=? or a.IDENTIFY_NUM=? ) and b.APPLY_TIME>=?")
					 .setParameter(0, "%" + clientinfo + "%")
					 .setParameter(1, clientinfo)
					 .setParameter(2, clientinfo)
					 .setParameter(3, applytime1)				
					 .list();
		}else if("".equals(clientinfo) && !("".equals(loantype)) && !("".equals(applytime1)) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and b.LOAN_CLASS=? and b.APPLY_TIME>=?")
					 .setParameter(0, loantype)
					 .setParameter(1, applytime1)				
					 .list();
		}else if("".equals(clientinfo) && !("".equals(loantype)) && "".equals(applytime1) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and b.LOAN_CLASS=? and b.APPLY_TIME<=?")
					 .setParameter(0, loantype)
					 .setParameter(1, applytime2)				
					 .list();
		}else if(!("".equals(clientinfo)) && "".equals(loantype) && "".equals(applytime1) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and (a.CUST_NAME like ? or a.PHONE_NUM=? or a.IDENTIFY_NUM=? ) and b.APPLY_TIME<=?")
					 .setParameter(0, "%" + clientinfo + "%")
					 .setParameter(1, clientinfo)
					 .setParameter(2, clientinfo)
					 .setParameter(3, applytime2)				
					 .list();
		}else if("".equals(clientinfo) && "".equals(loantype) && !("".equals(applytime1)) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and b.APPLY_TIME between ? and ?")
					 .setParameter(0, applytime1)
					 .setParameter(1, applytime2)				
					 .list();
		}else if(!("".equals(clientinfo)) && !("".equals(loantype)) && !("".equals(applytime1)) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and (a.CUST_NAME like ? or a.PHONE_NUM=? or a.IDENTIFY_NUM=?) and b.LOAN_CLASS=? and b.APPLY_TIME>=?")
					 .setParameter(0, "%" + clientinfo + "%")
					 .setParameter(1, clientinfo)
					 .setParameter(2, clientinfo)
					 .setParameter(3, loantype)
					 .setParameter(4, applytime1)				
					 .list();
		}else if(!("".equals(clientinfo)) && !("".equals(loantype)) && "".equals(applytime1) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and (a.CUST_NAME like ? or a.PHONE_NUM=? or a.IDENTIFY_NUM=? ) and b.LOAN_CLASS=? and b.APPLY_TIME<=?")
					 .setParameter(0, "%" + clientinfo + "%")
					 .setParameter(1, clientinfo)
					 .setParameter(2, clientinfo)
					 .setParameter(3, loantype)
					 .setParameter(4, applytime2)				
					 .list();
		}else if(!("".equals(clientinfo)) && "".equals(loantype) && !("".equals(applytime1)) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and (a.CUST_NAME like ? or a.PHONE_NUM=? or a.IDENTIFY_NUM=? ) and b.APPLY_TIME BETWEEN ? AND ?")
					 .setParameter(0, "%" + clientinfo + "%")
					 .setParameter(1, clientinfo)
					 .setParameter(2, clientinfo)
					 .setParameter(3, applytime1)
					 .setParameter(4, applytime2)				
					 .list();
		}else if("".equals(clientinfo) && !("".equals(loantype)) && !("".equals(applytime1)) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and b.LOAN_CLASS=? and b.APPLY_TIME BETWEEN ? AND ?")
					 .setParameter(0, loantype)
					 .setParameter(1, applytime1)
					 .setParameter(2, applytime2)				
					 .list();
		}else if(!("".equals(clientinfo)) && "".equals(loantype) && "".equals(applytime1) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and (a.CUST_NAME like ? or a.PHONE_NUM=? or a.IDENTIFY_NUM=? )")
					 .setParameter(0, "%" + clientinfo + "%")
					 .setParameter(1, clientinfo)
					 .setParameter(2, clientinfo)
					 .list();	
		}else if("".equals(clientinfo) && !("".equals(loantype)) && "".equals(applytime1) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and b.LOAN_CLASS=?")
					 .setParameter(0, loantype)
					 .list();	
		}else if("".equals(clientinfo) && "".equals(loantype) && !("".equals(applytime1)) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and b.APPLY_TIME>=?")
					 .setParameter(0, applytime1)
					 .list();
		}else if("".equals(clientinfo) && "".equals(loantype) && "".equals(applytime1) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and b.APPLY_TIME<=?")
					 .setParameter(0, applytime2)
					 .list();
		}else {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
						 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 "
						 		+ "and (a.CUST_NAME like ? or a.PHONE_NUM=? or a.IDENTIFY_NUM=?) and b.LOAN_CLASS=? and b.APPLY_TIME BETWEEN ? AND ?")
					 .setParameter(0, "%" + clientinfo + "%")
					 .setParameter(1, clientinfo)
					 .setParameter(2, clientinfo)
					 .setParameter(3, loantype)
					 .setParameter(4, applytime1)
					 .setParameter(5, applytime2)	 
					 .list();	
		}
		
		/**
		 * 方式二：执行模糊查询
		*/
//		String sql = "SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.PHONE_NUM,a.IDENTIFY_NUM,b.LOAN_ID,b.LOAN_CLASS,b.APPLY_AMOUNT,b.APPLY_TIME\r\n" + 
// 		" FROM customer_info a,loan_apply_info b WHERE a.CUST_ID = b.CUST_ID AND b.CUST_TYPE=1 ";
//		
//		if(!("".equals(clientinfo))) {
//			sql = sql + "and (a.CUST_NAME like "+"'%"+clientinfo+"%'"+" or a.PHONE_NUM='"+clientinfo+"' or a.IDENTIFY_NUM='"+clientinfo+"') ";
//		}
//		
//		if(!("".equals(loantype))) {
//			sql = sql + "and b.LOAN_CLASS='"+loantype+"' ";
//		}
//		
//		if(!("".equals(applytime1)) && "".equals(applytime2)) {
//			sql = sql + "and b.APPLY_TIME>="+applytime1+" ";
//		}else if(!("".equals(applytime2)) && "".equals(applytime1)) {
//			sql = sql + "and b.APPLY_TIME<="+applytime2+" ";
//		}else {
//			sql = sql + "and b.APPLY_TIME between '"+applytime1+"' and '"+applytime2+"' ";
//		}
//		
//		resultSet = sessionFactory.getCurrentSession().createSQLQuery(sql).list();
		 
		return resultSet;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> selectCompanyCondition(String publicclient, String companyinfo, String loantype,
			String applytime1, String applytime2) {
		List<Object[]> resultSet = null;
		/**
		 * 方式一
		 */
		if("".equals(companyinfo) && "".equals(loantype) && "".equals(applytime1) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2")
					 .list();	
		}else if(!("".equals(companyinfo)) && !("".equals(loantype)) && "".equals(applytime1) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 +"and (b.CUST_NAME like ? or a.LICENSE_NUM=? ) and c.LOAN_CLASS=?")
					 .setParameter(0, "%" + companyinfo + "%")
					 .setParameter(1, companyinfo)
					 .setParameter(2, loantype)				
					 .list();
		}else if(!("".equals(companyinfo)) && "".equals(loantype) && !("".equals(applytime1)) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 +"and (b.CUST_NAME like ? or a.LICENSE_NUM=? ) and c.APPLY_TIME>=?")
					 .setParameter(0, "%" + companyinfo + "%")
					 .setParameter(1, companyinfo)
					 .setParameter(2, applytime1)				
					 .list();
		}else if("".equals(companyinfo) && !("".equals(loantype)) && !("".equals(applytime1)) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and c.LOAN_CLASS= and c.APPLY_TIME>=?")
					 .setParameter(0, loantype)
					 .setParameter(1, applytime1)
					 .list();	
		}else if("".equals(companyinfo) && !("".equals(loantype)) && "".equals(applytime1) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and c.LOAN_CLASS=? and c.APPLY_TIME<=?")
					 .setParameter(0, loantype)
					 .setParameter(1, applytime2)
					 .list();	
		}else if(!("".equals(companyinfo)) && "".equals(loantype) && "".equals(applytime1) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and (b.CUST_NAME like ? or a.LICENSE_NUM=? ) and c.APPLY_TIME<=?")
					 .setParameter(0, "%" + companyinfo + "%")
					 .setParameter(1, companyinfo)
					 .setParameter(2, applytime2)	
					 .list();	
		}else if("".equals(companyinfo) && "".equals(loantype) && !("".equals(applytime1)) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and c.APPLY_TIME BETWEEN ? AND ?")
					 .setParameter(0, applytime1)
					 .setParameter(1, applytime2)
					 .list();
		}else if(!("".equals(companyinfo)) && !("".equals(loantype)) && !("".equals(applytime1)) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and (b.CUST_NAME like ? or a.LICENSE_NUM=?) and c.LOAN_CLASS=? and c.APPLY_TIME>=?")
					 .setParameter(0, "%" + companyinfo + "%")
					 .setParameter(1, companyinfo)
					 .setParameter(2, loantype)
					 .setParameter(3, applytime1)
					 .list();
		}else if(!("".equals(companyinfo)) && !("".equals(loantype)) && "".equals(applytime1) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and (b.CUST_NAME like ? or a.LICENSE_NUM=?) and c.LOAN_CLASS=? and c.APPLY_TIME<=?")
					 .setParameter(0, "%" + companyinfo + "%")
					 .setParameter(1, companyinfo)
					 .setParameter(2, loantype)
					 .setParameter(3, applytime2)
					 .list();
		}else if(!("".equals(companyinfo)) && "".equals(loantype) && !("".equals(applytime1)) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and (b.CUST_NAME like ? or a.LICENSE_NUM=?) and c.APPLY_TIME BETWEEN ? AND ?")
					 .setParameter(0, "%" + companyinfo + "%")
					 .setParameter(1, companyinfo)
					 .setParameter(2, applytime1)
					 .setParameter(3, applytime2)
					 .list();
		}else if("".equals(companyinfo) && !("".equals(loantype)) && !("".equals(applytime1)) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and c.LOAN_CLASS=? and c.APPLY_TIME BETWEEN ? AND ?")
					 .setParameter(0, loantype)
					 .setParameter(1, applytime1)
					 .setParameter(2, applytime2)
					 .list();
		}else if(!("".equals(companyinfo)) && "".equals(loantype) && "".equals(applytime1) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and (b.CUST_NAME like ? or a.LICENSE_NUM=?)")
					 .setParameter(0, "%" + companyinfo + "%")
					 .setParameter(1, companyinfo)
					 .list();
		}else if("".equals(companyinfo) && !("".equals(loantype)) && "".equals(applytime1) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and c.LOAN_CLASS=?")
					 .setParameter(0, loantype)
					 .list();
		}else if("".equals(companyinfo) && "".equals(loantype) && !("".equals(applytime1)) && "".equals(applytime2)) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and c.APPLY_TIME>=?")
					 .setParameter(0, applytime1)
					 .list();
		}else if("".equals(companyinfo) && "".equals(loantype) && "".equals(applytime1) && !("".equals(applytime2))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and c.APPLY_TIME<=?")
					 .setParameter(0, applytime2)
					 .list();
		}else {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
					 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
					 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 "
					 + "and (b.CUST_NAME like ? or a.LICENSE_NUM=?) and c.LOAN_CLASS=? and c.APPLY_TIME BETWEEN ? AND ?")
					 .setParameter(0, "%" + companyinfo + "%")
					 .setParameter(1, companyinfo)
					 .setParameter(2, loantype)
					 .setParameter(3, applytime1)
					 .setParameter(4, applytime2)	 
					 .list();	
		}
		
		/**
		 * 方式二：执行模糊查询
		 */
//		String sql = "select c.LOAN_ID,b.CUST_NAME,a.LICENSE_NUM,d.CUST_TYPE,c.LOAN_CLASS,c.APPLY_AMOUNT,c.APPLY_TIME,a.ID,b.ID,d.ID \r\n" + 
//				 "from business_info a,company_info b,loan_apply_info c,legal_person_info d \r\n" + 
//				 "where c.CUST_ID=a.CUST_ID and c.CUST_ID=b.CUST_ID and c.CUST_ID=d.CUST_ID and c.CUST_TYPE=2 ";
//		
//		if(!("".equals(companyinfo))) {
//			sql = sql + "and (b.CUST_NAME like "+"'%"+companyinfo+"%'"+" or a.LICENSE_NUM='"+companyinfo+"') ";
//		}
//		
//		if(!("".equals(loantype))) {
//			sql = sql + "and c.LOAN_CLASS='"+loantype+"' ";
//		}
//		
//		if(!("".equals(applytime1)) && "".equals(applytime2)) {
//			sql = sql + "and c.APPLY_TIME>="+applytime1+" ";
//		}else if(!("".equals(applytime2)) && "".equals(applytime1)) {
//			sql = sql + "and c.APPLY_TIME<="+applytime2+" ";
//		}else {
//			sql = sql + "and c.APPLY_TIME between '"+applytime1+"' and '"+applytime2+"' ";
//		}
//		
//		resultSet = sessionFactory.getCurrentSession().createSQLQuery(sql).list();
		return resultSet;
	}

}
