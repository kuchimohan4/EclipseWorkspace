package com.assen.coll1;

public class Batch {
	private int id;
	private String domain;
	private String code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", domain=" + domain + ", code=" + code + "]";
	}
	

}
