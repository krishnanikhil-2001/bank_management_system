package com.accountmanagement.accountmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserLogin")
public class UserLogin {
	@Id
	Long acc_num;
	String Password;
	public Long getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(Long acc_num) {
		this.acc_num = acc_num;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public UserLogin(Long acc_num, String password) {
		super();
		this.acc_num = acc_num;
		Password = password;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
