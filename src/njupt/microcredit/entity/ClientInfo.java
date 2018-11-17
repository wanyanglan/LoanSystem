package njupt.microcredit.entity;

import java.sql.Date;
/**
 * 客户基本信息实体
 * @author wyl
 *
 */
public class ClientInfo {
	private int clientId;                     // 客户编号
	private String clientName;                //姓名
	private String clientGender;			  //性别
	private int clientAge;					  //年龄
	private String phoneNumber;				  //手机号
	private String identifyType;			  //证件类型
	private String identifyNum;				  //证件号码
	private String maritalStatus;			  //婚姻状况
	private String clientEducation;			  //教育水平
	private String clientCensus;              //户籍
	private String clentAddress;			  //家庭地址
	private Date clientBirthday;			  //出生日期
	private int addrYears;					  //现址居住年限
	private String jabTitle;				  //职位
	private String occupationTitle;			  //职称
	private double monthlyIncome;             //月收入
	private int unitService;				  //现单位工龄
	private String clientEmail;  			  //电子邮箱
	private String badRecord;				  //公安司法不良记录
	private String unitType;				  //单位性质
	private String companyAddress;			  //单位地址
	private String companyPhone;			  //单位电话
	private String companyName;				  //单位名称
	private Date updateDate;				  //创建时间
	private int createUser;				     //创建用户(受理客户的人)
	private int clientBelong;				  //客户归属
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientGender() {
		return clientGender;
	}
	public void setClientGender(String clientGender) {
		this.clientGender = clientGender;
	}
	public int getClientAge() {
		return clientAge;
	}
	public void setClientAge(int clientAge) {
		this.clientAge = clientAge;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIdentifyType() {
		return identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}
	public String getIdentifyNum() {
		return identifyNum;
	}
	public void setIdentifyNum(String identifyNum) {
		this.identifyNum = identifyNum;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getClientEducation() {
		return clientEducation;
	}
	public void setClientEducation(String clientEducation) {
		this.clientEducation = clientEducation;
	}
	public String getClientCensus() {
		return clientCensus;
	}
	public void setClientCensus(String clientCensus) {
		this.clientCensus = clientCensus;
	}
	public String getClentAddress() {
		return clentAddress;
	}
	public void setClentAddress(String clentAddress) {
		this.clentAddress = clentAddress;
	}
	public Date getClientBirthday() {
		return clientBirthday;
	}
	public void setClientBirthday(Date clientBirthday) {
		this.clientBirthday = clientBirthday;
	}
	public int getAddrYears() {
		return addrYears;
	}
	public void setAddrYears(int addrYears) {
		this.addrYears = addrYears;
	}
	public String getJabTitle() {
		return jabTitle;
	}
	public void setJabTitle(String jabTitle) {
		this.jabTitle = jabTitle;
	}
	public String getOccupationTitle() {
		return occupationTitle;
	}
	public void setOccupationTitle(String occupationTitle) {
		this.occupationTitle = occupationTitle;
	}
	public double getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public int getUnitService() {
		return unitService;
	}
	public void setUnitService(int unitService) {
		this.unitService = unitService;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getBadRecord() {
		return badRecord;
	}
	public void setBadRecord(String badRecord) {
		this.badRecord = badRecord;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getCreateUser() {
		return createUser;
	}
	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}
	public int getClientBelong() {
		return clientBelong;
	}
	public void setClientBelong(int clientBelong) {
		this.clientBelong = clientBelong;
	}
	@Override
	public String toString() {
		return "ClientInfo [clientId=" + clientId + ", clientName=" + clientName + ", clientGender=" + clientGender
				+ ", clientAge=" + clientAge + ", phoneNumber=" + phoneNumber + ", identifyType=" + identifyType
				+ ", identifyNum=" + identifyNum + ", maritalStatus=" + maritalStatus + ", clientEducation="
				+ clientEducation + ", clientCensus=" + clientCensus + ", clentAddress=" + clentAddress
				+ ", clientBirthday=" + clientBirthday + ", addrYears=" + addrYears + ", jabTitle=" + jabTitle
				+ ", occupationTitle=" + occupationTitle + ", monthlyIncome=" + monthlyIncome + ", unitService="
				+ unitService + ", clientEmail=" + clientEmail + ", badRecord=" + badRecord + ", unitType=" + unitType
				+ ", companyAddress=" + companyAddress + ", companyPhone=" + companyPhone + ", companyName="
				+ companyName + ", updateDate=" + updateDate + ", createUser=" + createUser + ", clientBelong="
				+ clientBelong + "]";
	}

}
