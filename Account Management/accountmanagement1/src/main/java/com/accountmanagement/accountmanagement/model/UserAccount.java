package com.accountmanagement.accountmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
@Entity
@Table(name="useraccount")
public class UserAccount {
	@Id
	@BatchSize(size=10)
	private Long acc_num;
	private String password;
	private String repassword;
	private String person_name;
	private String address;
	private Long mobile_num;
	private String email;
	private int balance;
	public Long getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(Long acc_num) {
		this.acc_num = acc_num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(Long mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public UserAccount(Long acc_num, String password, String repassword, String person_name, String address,
			Long mobile_num, String email, int balance) {
		super();
		this.acc_num = acc_num;
		this.password = password;
		this.repassword = repassword;
		this.person_name = person_name;
		this.address = address;
		this.mobile_num = mobile_num;
		this.email = email;
		this.balance = balance;
	}
	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
		 }
