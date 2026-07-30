package com.accountmanagement.accountmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class WelcomeController {
	@RequestMapping("/index")
	public ModelAndView showHomePage() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing Home Page.");
		return new ModelAndView("index"); // Here index is a jsp page name
	}
	@RequestMapping("/homepage")
	public ModelAndView showMainPage() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing Home Page.");
		return new ModelAndView("mainpage"); // Here index is a jsp page name
	}
	@RequestMapping("/adminlogin")
	public ModelAndView showAdminmainPage() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("adminlogin"); // Here index is a jsp page name
	}

	@RequestMapping("/customer")
	public ModelAndView showCustomerPage() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("custacdetlist"); // Here index is a jsp page name
	}
	@RequestMapping("/customersignup")
	public ModelAndView showCustomersignup() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("custsignup"); // Here index is a jsp page name
	}
	
	@RequestMapping("/customersignin")
	public ModelAndView showCustomersignin() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("custlogin"); // Here index is a jsp page name
	}
	
	@RequestMapping("/customerdetails")
	public ModelAndView showCustomerdetails() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("custdetails"); // Here index is a jsp page name
	}
	@RequestMapping("/customerwithdraw")
	public ModelAndView showCustomerwithdraw() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("custwithdraw"); // Here index is a jsp page name
	}
	@RequestMapping("/customerdeposit")
	public ModelAndView showCustomerdeposit() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("custdeposit"); // Here index is a jsp page name
	}
	@RequestMapping("/customermainpage")
	public ModelAndView showCustomermainpage() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("custmainpage"); // Here index is a jsp page name
	}
	@RequestMapping("/custaccsignin")
	public ModelAndView showCustaccsignin() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("accsignin"); // Here index is a jsp page name
	}
	@RequestMapping("/admincreate")
	public ModelAndView showaccountcreate() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing AdminLogin Page.");
		return new ModelAndView("admincreate"); // Here index is a jsp page name
	}
	
	
}
