package com.example.bean;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Geometry {
	@JsonProperty("Type")
	private String Type;
	
	@JsonProperty("Coordinates")
	private String Coordinates;
	
	@JsonGetter("Type")
	public String getType() {
		return Type;
	}
	@JsonSetter("Type")
	public void setType(String type) {
		Type = type;
	}
	
	@JsonGetter("Coordinates")
	public String getCoordinates() {
		return Coordinates;
	}
	@JsonSetter("Coordinates")
	public void setCoordinates(String coordinates) {
		Coordinates = coordinates;
	}
	
}
