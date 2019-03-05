package com.app.spring;

import java.util.Map;

public class Map1 {
	private Map<Integer,Question> mapAns;

	public Map<Integer, Question> getMapAns() {
		return mapAns;
	}

	public void setMapAns(Map<Integer, Question> mapAns) {
		this.mapAns = mapAns;
	}

	@Override
	public String toString() {
		return "Map1 [mapAns=" + mapAns + "]";
	}
	

	
}
