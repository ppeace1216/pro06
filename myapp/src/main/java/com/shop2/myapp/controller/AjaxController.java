package com.shop2.myapp.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop2.myapp.dto.CustomerDTO;
import com.shop2.myapp.service.AjaxService;

@Controller
@RequestMapping("/ajax/")
public class AjaxController {
	
	@Resource
	private AjaxService ajaxService;
	
	@Resource
	private HttpSession session;
	
	@GetMapping("test1")
	public String testLoad(Model model) throws Exception {
		return "ajax/test1";
	}
	
	@GetMapping("idCheck.do")
	@ResponseBody
	public boolean idCheck(@RequestParam("id") String id) throws Exception {
		CustomerDTO dto = ajaxService.getCus(id);
		if(dto==null) {
			return true;
		} else {
			return false;
		}
	}
	
	@GetMapping("test2")
	public String testLoad2(Model model) throws Exception {
		return "ajax/test2";
	}
	
	@GetMapping("cusList.do")
	@ResponseBody
	public List<CustomerDTO> cusList(Model model) throws Exception {
		List<CustomerDTO> cusList = ajaxService.cusList();
		return cusList;
	}
	
	@GetMapping("test3")
	public String testLoad3(Model model) throws Exception {
		return "ajax/test3";
	}
	
	@GetMapping("getCus.do")
	@ResponseBody
	public CustomerDTO getCus(@RequestParam("id") String id, Model model) throws Exception {
		CustomerDTO getCus = ajaxService.getCus(id);
		return getCus;
	}
	
	@GetMapping("test4")
	public String testLoad4(Model model) throws Exception {
		return "ajax/test4";
	}
	
//	@PostMapping("loginCus.do")
//	@ResponseBody
//	public HttpSession loginCus(@ModelAttribute("cus") CustomerDTO cus, Model model) throws Exception {
//		CustomerDTO cu = ajaxService.loginCus(cus.getId(), cus.getPw());
//		if (cu==null) {
//			session.invalidate();
//		} else {
//			session.setAttribute("sid", cu.getId());
//			session.setAttribute("sname", cu.getName());
//		}
//		return session;
//	}
	
	@GetMapping("loginCus.do")
	@ResponseBody
	public CustomerDTO loginCus(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {
		CustomerDTO cu = ajaxService.logCus(id, pw);
		if(cu==null) {
			session.invalidate();
		} else {
			session.setAttribute("sid", cu.getId());
			session.setAttribute("sname", cu.getName());
		}
		return cu;
	}
	
}
