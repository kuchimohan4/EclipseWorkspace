package com.login;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

public class login {
	
	private int id;
	@Size(min = 3,max = 30)
	private String pass;
	private String name;
	private Date dob;
	private ArrayList<String> lst;
	private address address;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	public ArrayList<String> getLst() {
		return lst;
	}
	public void setLst(ArrayList<String> lst) {
		this.lst = lst;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public login(int id, String pass, String name) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
	}
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
