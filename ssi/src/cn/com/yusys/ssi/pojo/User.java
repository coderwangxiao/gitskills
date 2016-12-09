package cn.com.yusys.ssi.pojo;

import java.util.Date;

public class User {
	private Integer id;
	private String loginName;//login_name
	private String password;
	private String realName;
	private Date birthday;
	private Integer gender;// 性别
	
	public User() {
	}

	public User(Integer id, String loginName, String password, String realName, Date birthday, Integer gender) {
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.realName = realName;
		this.birthday = birthday;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String toString() {
		return "User [id=" + id + ", loginName=" + loginName + ", password=" + password + ", realName=" + realName
				+ ", birthday=" + birthday + ", gender=" + gender + "]";
	}
}
