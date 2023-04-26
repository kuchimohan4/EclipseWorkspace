package com.assen.auto2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	@Value("kuchi")
	private String Ename;
	@Autowired()
	private Dept eDept;
	
	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	@Override
	public String toString() {
		return  Ename + " works in ";
		
	}

	public Dept geteDept() {
		return eDept;
	}

	public void seteDept(Dept eDept) {
		this.eDept = eDept;
	}
	
	
	
	
}
