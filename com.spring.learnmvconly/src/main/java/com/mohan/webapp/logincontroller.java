package com.mohan.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("uname")
public class logincontroller {
	@Autowired
	passwordvalidatior pv;
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String loginpage() {
		
		return "loginnew";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String welcome(@RequestParam String uname,@RequestParam String password,ModelMap model) {
//		System.out.println("\n"+uname+password);
//		System.out.println(pv.validatepassword(uname, password));
		if(pv.validatepassword(uname, password)) {
//		System.out.println(password);
		model.put("uname", uname);
//		model.put(
		return "welcome";
		}
		else {
			model.put("errormsg", "invalid credentials");
			
			return "loginnew";
			
		}
	}
}




	