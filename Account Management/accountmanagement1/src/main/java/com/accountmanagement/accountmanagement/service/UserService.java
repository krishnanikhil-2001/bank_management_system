package com.accountmanagement.accountmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountmanagement.accountmanagement.dao.UserDao;
import com.accountmanagement.accountmanagement.model.UserAccount;


@Service
public class UserService {
	@Autowired
	UserDao ud;

	public Optional<UserAccount> userdetails(long anum) {
		return ud.userdetails(anum);
		

	}
	public List<UserAccount> alluserdetails() {
		return ud.alluserdetails();
		

	}


	public UserAccount saveData(UserAccount user) {

		return ud.saveData(user);

	}
	public int getamt(long anum) {
		return ud.getamt(anum);
	}
	public String getpass(long anum) {
		return ud.getpass(anum);
	}

public void setamt(long anum,int amt) {

		ud.setamt(anum,amt);
		
	}
}
