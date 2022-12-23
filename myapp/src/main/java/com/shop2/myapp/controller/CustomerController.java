package com.shop2.myapp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop2.myapp.service.CustomerService;

@Controller
@RequestMapping("/cus/")
public class CustomerController {
	
	@Resource
	private CustomerService customerService;
	
	@Resource
	private HttpSession session;
	
	@GetMapping("agree")
	public String agreeForm(Model model) throws Exception {
		return "cus/agree";
	}
}
