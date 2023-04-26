package com.mohan.todos;

import java.util.Date;

import javax.enterprise.inject.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mohan.webapp.passwordvalidatior;

@Controller
@SessionAttributes("uname")
public class todocontroller {
	@Autowired
	todoservice service;
	
	@RequestMapping(value = "/list-todos",method = RequestMethod.GET)
	public String mytodos(/* @RequestParam String uname, */ModelMap model) {
		model.addAttribute("todos",service.retrievetodos("in28Minutes"));
//		model.addAttribute("name",uname);
		return "list-todos";
	}
	
	@RequestMapping(value = "/add-todo",method = RequestMethod.GET)
	public String showtodo(ModelMap model) {
//		model.addAttribute("todos",service.retrievetodos("in28Minutes"));
//		model.addAttribute("name",uname);
		model.addAttribute("tod",new todo(0, "in28Minutes", "defalt desc", new Date(), false));
		return "todo";
	

	}
	@RequestMapping(value = "/add-todo",method = RequestMethod.POST)
	public String addtodo(ModelMap model,@RequestParam String desc ) {
		service.addtodo("in28Minutes",desc, new Date(), false);
		model.clear();
//		model.addAttribute("todos",service.retrievetodos("in28Minutes"));
//		model.addAttribute("name",uname);
		return "redirect:list-todos";
	

	}
	@RequestMapping(value = "/delete-todo",method = RequestMethod.GET)
	public String deletetodo(ModelMap model,@RequestParam int id ) {
		service.deletetodo(id);
		model.clear();
		
		return "redirect:list-todos";
	

	}
	}




	