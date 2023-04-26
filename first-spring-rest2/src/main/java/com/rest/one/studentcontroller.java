package com.rest.one;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studentcontroller {
	
	@ResponseBody
	@RequestMapping("/students")
	public ArrayList<student> studentsfile() {
		
		ArrayList<student> lst=new ArrayList<>();
		student s1=new student("kuchi");
		student s2=new student("ram");
		student s3=new student("ragav");
		lst.add(s3);
		lst.add(s2);
		lst.add(s1);
		return lst;
	}

}
