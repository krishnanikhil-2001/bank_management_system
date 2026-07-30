package com.accountmanagement.accountmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.accountmanagement.accountmanagement.model.UserLogin;

import com.accountmanagement.accountmanagement.model.UserAccount;
import com.accountmanagement.accountmanagement.service.UserLoginService;
import com.accountmanagement.accountmanagement.service.UserService;

@Controller
@RequestMapping("/userlogin")

public class UserLoginController {
	@Autowired
	UserService us;
	//@Autowired
	UserAccount usac= new UserAccount();
	//@Autowired
	UserLogin ul=new UserLogin();
	public ModelAndView showcustomermain() {
		this.getClass().getSimpleName()  ;
		return new ModelAndView("custmainpage"); // Here index is a jsp page name
	}
	public ModelAndView showcustomerlogin() {
		this.getClass().getSimpleName()  ;
		return new ModelAndView("custinvalid"); // Here index is a jsp page name
	}
	@GetMapping("/validate")
	public ModelAndView getData(@RequestParam("acc_num") String anum,@RequestParam("password") String password,@RequestParam("Login") String  loginvalue)
	{
		//uls.saveData(user);
		String checkpass= us.getpass(Long.parseLong(anum));
		
		if (checkpass.equals(password)) {
		return	showcustomermain();
		}
		
		else {
			return showcustomerlogin();
		}
	}
	

}
