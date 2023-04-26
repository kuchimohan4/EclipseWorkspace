package com.rest.one;

public class student {
	
	
	private int student_id;
	private String student_name;
	private int student_rank;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_rank() {
		return student_rank;
	}
	public void setStudent_rank(int student_rank) {
		this.student_rank = student_rank;
	}
	public student(int student_id, String student_name, int student_rank) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_rank = student_rank;
	}
	static int id=0;
	public student(String student_name) {
		super();
		this.student_name = student_name;
		id=id+1;
		this.student_id=id;
		this.student_rank=(Integer) null;
	}
	
	

}
