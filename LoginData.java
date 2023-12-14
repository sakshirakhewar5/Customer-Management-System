package com.SunBaseData.SunBaseDataAssesment.POJO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginData {
	@Id
	private String login_id;
	private String password;
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginData(String login_id, String password) {
		super();
		this.login_id = login_id;
		this.password = password;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginData [login_id=" + login_id + ", password=" + password + "]";
	}
	
	
}
