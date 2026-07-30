package com.accountmanagement.accountmanagement.controller;


import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.accountmanagement.accountmanagement.model.Admin;
import com.accountmanagement.accountmanagement.model.UserAccount;
import com.accountmanagement.accountmanagement.service.UserService;

@Controller
@RequestMapping("/admin")

public class AdminController {
	
@Autowired
UserService us;
//@Autowired
UserAccount user=new UserAccount();
	
	@PostMapping("/login")
	 public ModelAndView login(@ModelAttribute(name="loginForm") Admin login, Model m) {
		  String uname = login.getUsername();
		  String pass = login.getPassword();
		  if(uname.equals("Siva") && pass.equals("Siva@123")) {
		   m.addAttribute("uname", uname);
		   m.addAttribute("pass", pass);
		   this.getClass().getSimpleName();
		   return new ModelAndView ("adminmainpage");
		  }
		  m.addAttribute("error", "Incorrect Username & Password");
		  return new ModelAndView ("admininvalid");
		  
	}
	private ModelAndView show() {
		return  new ModelAndView ("admincustlist");
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveData(@ModelAttribute("user") UserAccount  user)
	{
		System.out.println("hello");
		
		 us.saveData(user);
return new ModelAndView("create");
	}
	@GetMapping("/fetch")
	public ModelAndView listuser(ModelAndView m)
	{
		System.out.println("fetch");
		
		System.out.println("details"+us.alluserdetails());
		//httpServletRequest.setAttribute("userdetails", us.alluserdetails());
		System.out.println("admin");
		m.addObject("userdetails", us.alluserdetails());
		m.setViewName("admincustlist");
		
		return  m;
		
	}
}