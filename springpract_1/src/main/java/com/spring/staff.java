/**
 * 
 */
package com.spring;


public class staff implements member{
	
	
	private int staffId;
	private String staffName;
	private String staffSubject;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffSubject() {
		return staffSubject;
	}
	public void setStaffSubject(String staffSubject) {
		this.staffSubject = staffSubject;
	}
	public void displaymembersdetails() {
		// TODO Auto-generated method stub
		System.out.println("staff Id:"+staffId+"\nstaff name:"+staffName+"\nstaff subject:"+staffSubject);
		
	}
	
	
	

}
