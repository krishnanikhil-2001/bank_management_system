package com.accountmanagement.accountmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.accountmanagement.accountmanagement.model.UserAccount;
import com.accountmanagement.accountmanagement.service.UserService;


@Controller
@RequestMapping("/useraccount")
public class UserController {
	@Autowired
	UserService us;
	//@Autowired
	UserAccount user= new UserAccount();
	
	
	
	public ModelAndView showUserPage() {
		//System.out.println(this.getClass().getSimpleName() + ":=======>Showing CustomerMain Page.");
        return new ModelAndView("custmainpage"); // Here index is a jsp page name
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveData(@ModelAttribute("user") UserAccount  user)
	{
		System.out.println("hello");
		
		 us.saveData(user);
return showUserPage();
	}
	
	 @PostMapping("/withdraw") 
		public ModelAndView withdraw(@RequestParam("acc_num") String anum ,@RequestParam("amount") String withdrawamt,@RequestParam("submit") String submit) {
		System.out.println("withdraw amount");	
		int balance=us.getamt(Long.parseLong(anum));
		
			int withdraw=Integer.parseInt(withdrawamt);
			if((balance-500)<withdraw) {
				return new ModelAndView("insufficient");
			}
			else {
			balance-=withdraw;
			us.setamt(Long.parseLong(anum),balance);
			return new ModelAndView("trans");}
		}
	@PostMapping("/deposit") 
	public ModelAndView deposit(@RequestParam("acc_num") String anum,@RequestParam("amount") int withdrawamt) {
		int balance=us.getamt(Long.parseLong(anum));
		balance+=withdrawamt;
		us.setamt(Long.parseLong(anum),balance);
		return new ModelAndView("trans");
	}
	@GetMapping("/fetch")
	public ModelAndView listuser(@RequestParam("acc_num") long anum, ModelAndView model)
	{
		Optional<UserAccount> userdetail=us.userdetails(anum);
		model.addObject("userdetail",userdetail);
		model.setViewName("custdetails");
		
		return model;
		
	}
	
		
	}

