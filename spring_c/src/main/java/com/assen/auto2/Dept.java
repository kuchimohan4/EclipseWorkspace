package com.assen.auto2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dept {
	@Value("computer dept ")
	private String Dname;
	@Value("mumbai")
	private String location;
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return  Dname +" at "+ location ;
	}
	

}
