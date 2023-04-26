package com.assen.annout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	@Value("kuchi")
	private String Ename;
	@Autowired()
	private client clint;
	
	
	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	@Override
	public String toString() {
		return  Ename + " manages client ";
		
	}

	public client geteClient() {
		return clint;
	}

	public void setClient(client eDept) {
		this.clint = eDept;
	}
	
	
	
	
}
