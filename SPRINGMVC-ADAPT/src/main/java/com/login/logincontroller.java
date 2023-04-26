package com.login;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class logincontroller {
	
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"address.city"});//for name we just use name
		SimpleDateFormat format=new SimpleDateFormat("yyyy**MM**dd");
		binder.registerCustomEditor(Date.class,"dob",new CustomDateEditor(format,false));
		binder.registerCustomEditor(String.class,"name",new nameeditor());
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginpage() {
		return "loginnew";
	}
	
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String welcome(@Valid @ModelAttribute("login1")login login1,BindingResult result) {
		
		
		if(result.hasErrors()) {
			return "loginnew";
		}
		
		
		return "welcome";
	}
	
	

}
