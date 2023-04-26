package com.assen.javaconfig;

public class Douctor {
	
	private String douctorName;
	private String specialization;
	public String getDouctorName() {
		return douctorName;
	}
	public void setDouctorName(String douctorName) {
		this.douctorName = douctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Douctor(String douctorName, String specialization) {
		this.douctorName = douctorName;
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return  douctorName +" is a " + specialization+"." ;
	}
	
	

}
