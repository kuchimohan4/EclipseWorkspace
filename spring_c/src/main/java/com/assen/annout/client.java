package com.assen.annout;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class client {
	@Value("lgdp private limited")
	private String clientName;
	@Value("mumbai")
	private String location;
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String dname) {
		clientName = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return  clientName +" at "+ location ;
	}
	

}
