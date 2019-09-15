package njupt.microcredit.entity;

public class Company {

    private String id;
    //公司名称
    private String name;
    //公司网址
    private String link;
    //公司地址
    private String address;
    //公司描述
    private String desc;
    //注册资金
    private String capital;
    //经营状态
    private String state;
    //注册号
    private String registerNum;
    //统一社会信用代码
    private String code;
    //组织机构代码
    private String mechanism;
    //纳税人识别号
    private String taxpayer;
    //公司类型
    private String type;
    //营业期限
    private String term;
    //行业
    private String industry;
    //纳税人资质
    private String qualifications;
    //核准日期
    private String date;
    //实缴资本
    private String paid;
    //人员规模
    private String scale;
    //参保人数
    private String number;
    //登记机关
    private String authority;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(String registerNum) {
        this.registerNum = registerNum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public String getTaxpayer() {
        return taxpayer;
    }

    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", link=" + link + ", address=" + address + ", desc=" + desc
				+ ", capital=" + capital + ", state=" + state + ", registerNum=" + registerNum + ", code=" + code
				+ ", mechanism=" + mechanism + ", taxpayer=" + taxpayer + ", type=" + type + ", term=" + term
				+ ", industry=" + industry + ", qualifications=" + qualifications + ", date=" + date + ", paid=" + paid
				+ ", scale=" + scale + ", number=" + number + ", authority=" + authority + "]";
	}

    
}
