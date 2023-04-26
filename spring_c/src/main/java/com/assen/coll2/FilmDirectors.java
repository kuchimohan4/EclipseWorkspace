package com.assen.coll2;

import java.util.Map;

public class FilmDirectors {
	private Map<String, String> directorMap;

	public Map<String, String> getDirectorMap() {
		return directorMap;
	}

	public void setDirectorMap(Map<String, String> directorMap) {
		this.directorMap = directorMap;
	}
	public void printFilmInfo() {
		for(Map.Entry<String, String> entry:directorMap.entrySet()) {
			
			System.out.println("Film Name:"+entry.getKey()+"Film Director:"+entry.getValue());
			
			
		}
		
	}

}
