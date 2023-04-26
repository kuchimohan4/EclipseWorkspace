package com.assen.coll1;

import java.util.List;

public class Location {
	
	private String locationCode;
	private String locationName;
	private List<Batch> batches;
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public List<Batch> getBatches() {
		return batches;
	}
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	public void displayInfo() {
		System.out.println("Location is "+locationName+"\nBatches in the Location are");
		for(Batch batch:batches) {
			System.out.println(batch.getCode());
		}
		
	}
	

}
