package com.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class logincontroller {
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String loginpage() {
		
		return "loginnew";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String welcome(@RequestParam String uname,@RequestParam String password,ModelMap model) {
		
//		System.out.println(password);
		model.put("uname", uname);
//		model.put(
		return "welcome";
	}
}




	