package com.rest.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.spi.http.HttpHandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class studentcontroller {
    private ArrayList<student> studentList=studentsfile();
	
	@RequestMapping(value = "/students", method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE )
	public ArrayList<student> studentsfile() {

		ArrayList<student> lst = new ArrayList<>();
		student s1 = new student("kuchi");
		student s2 = new student("ram");
		student s3 = new student("ragav");
		lst.add(s3);
		lst.add(s2);
		lst.add(s1);
		return lst;
	}
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
	public student studentwithName(@PathVariable("name") String name/* ,@Context UriInfo uriInfo */) {
		student s1 = null;
		for (student student : studentList) {
//			student.addLink("self",);
//			System.out.println(uriInfo.getBaseUriBuilder().path(getClass()).path(name).build().toString());
//			System.out.println(name);
//			System.out.println(student.getStudent_name());
			if (student.getStudent_name().equals(name)) {
				s1 = student;
			}

		}
		return s1;
	}
//	@RequestMapping(value = "/student", method = RequestMethod.GET)
//	public String studentwit() {
//		
//		return "hello";
//	}

	@RequestMapping(value = "/students/{name}", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String name, @RequestBody student student) {

		
		for (student stud : studentList) {
			System.out.println(name);
			System.out.println(stud.getStudent_name());
			if (stud.getStudent_name().equals(name)) {
				HttpHeaders httpHeaders=new HttpHeaders();
				httpHeaders.add(stud.getStudent_name(),"1");
				stud.setStudent_name(student.getStudent_name());
				stud.setStudent_rank(student.getStudent_rank());
				System.out.println(stud.getStudent_name());
				httpHeaders.add(stud.getStudent_name(),"2");
				
				 return new ResponseEntity<Boolean>(true,httpHeaders,HttpStatus.OK);
			}

		}

		return new ResponseEntity<Boolean>(false,HttpStatus.BAD_REQUEST);

	}
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addstudent(@PathVariable("name") String name, @RequestBody student student) {
		
		studentList.add(new student(0,student.getStudent_name(),student.getStudent_rank()));
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("location",ServletUriComponentsBuilder.fromCurrentRequest().path("/{name}").toUriString() );
		
		return new ResponseEntity<Boolean>(true,httpHeaders,HttpStatus.CREATED);

		}
	
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deletestudent(@PathVariable("name") String name) {

		
		for (student stud : studentList) {
			if (stud.getStudent_name().equals(name)) {
				studentList.remove(stud);
				HttpHeaders httpHeaders=new HttpHeaders();
                httpHeaders.add("deleted", name);
				 return new ResponseEntity<Boolean>(true,httpHeaders,HttpStatus.OK);
			}

		}
		return null;
	
	

}}
