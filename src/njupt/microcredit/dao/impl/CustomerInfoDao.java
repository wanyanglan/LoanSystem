package njupt.microcredit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import njupt.microcredit.dao.ICustomerInfoDao;
import njupt.microcredit.entity.CustomerInfo;

public class CustomerInfoDao implements ICustomerInfoDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void deleteByPrimaryKey(Integer id) {
		sessionFactory.getCurrentSession()
					  .createQuery("delete from CustomerInfo where id=?")
					  .setParameter(0, id)
					  .executeUpdate();

	}

	@Override
	public void insert(CustomerInfo customerInfo) {
		sessionFactory.getCurrentSession().save(customerInfo);

	}

	@Override
	public CustomerInfo selectByPrimaryKey(Integer id) {
		
		return (CustomerInfo) sessionFactory.getCurrentSession().get(CustomerInfo.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerInfo> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from CustomerInfo").list();
	}

	@Override
	public void updateByPrimaryKey(CustomerInfo customerInfo) {
		sessionFactory.getCurrentSession().update(customerInfo);

	}
	
	/**
     * 对私客户查看客户的操作者
     * @return
     */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> selectByOtherInfo() {
		
		return sessionFactory.getCurrentSession()
							 .createSQLQuery("select a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.IDENTIFY_TYPE,a.IDENTIFY_NUM,a.PHONE_NUM,b.CUST_ID,b.CREATE_OR\r\n" + 
							 "from customer_info a,cust_basic_info b where a.CUST_ID = b.CUST_ID")
							 .list();
	}
	
	
	 /**
     * 对私客户信息模糊查询
     */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> selectFuzzyQuery(String firstCondition, String phoneNum) {
		List<Object[]> resultSet = null;
		/**
		 * 方式一
		 */
		if("".equals(firstCondition) && !("".equals(phoneNum))) {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("SELECT a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.IDENTIFY_TYPE,a.IDENTIFY_NUM,a.PHONE_NUM,b.CUST_ID,b.CREATE_OR\r\n" + 
					 		"FROM customer_info a,cust_basic_info b WHERE a.CUST_ID = b.CUST_ID AND a.PHONE_NUM LIKE ?")
					 .setParameter(0,  phoneNum+"%")
					 .list();
		}else if(!("".equals(firstCondition)) && "".equals(phoneNum)){
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.IDENTIFY_TYPE,a.IDENTIFY_NUM,a.PHONE_NUM,b.CUST_ID,b.CREATE_OR\r\n" + 
					 "from customer_info a,cust_basic_info b where a.CUST_ID = b.CUST_ID and (a.CUST_NAME like ? or a.IDENTIFY_NUM like ?)")
					 .setParameter(0, "%"+firstCondition +"%")
					 .setParameter(1,  firstCondition)
					 .list();
		}else if(!("".equals(firstCondition)) && !("".equals(phoneNum))){
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.IDENTIFY_TYPE,a.IDENTIFY_NUM,a.PHONE_NUM,b.CUST_ID,b.CREATE_OR\r\n" + 
					 "from customer_info a,cust_basic_info b where a.CUST_ID = b.CUST_ID and (a.CUST_NAME like ? or a.IDENTIFY_NUM like ?) and a.PHONE_NUM like ?")
					 .setParameter(0, "%"+firstCondition +"%")
					 .setParameter(1, firstCondition +"%")
					 .setParameter(2, phoneNum +"%")
					 .list();
		}else {
			resultSet = sessionFactory.getCurrentSession()
					 .createSQLQuery("select a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.IDENTIFY_TYPE,a.IDENTIFY_NUM,a.PHONE_NUM,b.CUST_ID,b.CREATE_OR\r\n" + 
					 "from customer_info a,cust_basic_info b where a.CUST_ID = b.CUST_ID and (a.CUST_NAME like ? or a.IDENTIFY_NUM =?) and a.PHONE_NUM =?")
					 .setParameter(0, firstCondition)
					 .setParameter(1, firstCondition)
					 .setParameter(2, phoneNum)
					 .list();
		}
		/**
		 * 方式二
		 */
//		String sql = "select a.ID,a.CUST_NAME,a.CUST_GENDER,a.CUST_AGE,a.IDENTIFY_TYPE,a.IDENTIFY_NUM,a.PHONE_NUM,b.CUST_ID,b.CREATE_OR\r\n" + 
//				 "from customer_info a,cust_basic_info b where a.CUST_ID = b.CUST_ID ";
//		if(!("".equals(firstCondition))) {			
//			sql = sql + "and (a.CUST_NAME like '"+"%"+firstCondition+"%"+"' or a.IDENTIFY_NUM ='"+firstCondition+"') ";
//		}
//		if (!("".equals(phoneNum.trim()))) {
//			sql = sql + "and a.PHONE_NUM='"+phoneNum+"' ";
//		}
//		resultSet = sessionFactory.getCurrentSession().createSQLQuery(sql).list();
		return resultSet;
		
	}

}
