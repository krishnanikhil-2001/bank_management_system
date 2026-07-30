package com.accountmanagement.accountmanagement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.accountmanagement.accountmanagement.model.UserAccount;
import com.accountmanagement.accountmanagement.model.UserLogin;
import com.accountmanagement.accountmanagement.repository.UserRepository;

@Component
public class UserDao {
	@Autowired
	UserRepository ur;
	
	
	
	public List<UserAccount> alluserdetails()
	{
		ArrayList<UserAccount> users=new ArrayList<UserAccount>();
		for(UserAccount user:ur.findAll()) {
			users.add(user);
			
		}
		System.out.println("dao");
		return ur.findAll();
		
	}
	  public UserAccount saveData(UserAccount user) {
		
	   //ur.saveAll(user);
	   return ur.save(user);
	  //return ur.findAll();
	  
	  }
	  public int getamt(long anum) {
		java.util.Optional<UserAccount> u=ur.findById(anum);
			UserAccount u1=u.get();
			int amt=u1.getBalance();
			return amt;
	  }
	  public String getpass(long anum) {
			java.util.Optional<UserAccount> u=ur.findById(anum);
				UserAccount u1=u.get();
				String pass=u1.getPassword();
				
				return pass;
		  }
	  
	 public void setamt(long anum ,int amt) {
		  System.out.println("first");
	      java.util.Optional<UserAccount> u= ur.findById(anum);
			UserAccount u1=u.get();
				u1.setBalance(amt);
				
				ur.save(u1);
		
	  }
	 public Optional<UserAccount> userdetails(long anum)
		{
			return ur.findById(anum);
			
		}
}