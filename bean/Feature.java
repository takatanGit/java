package com.example.bean;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Feature {
	
	@JsonProperty("Id")
	private String Id;
	
	@JsonProperty("Name")
	private String Name;
	
	@JsonProperty("Geometry")
	private Geometry Geometry;
	
	@JsonProperty("Property")
	private Property Property;
	
	@JsonGetter("Id")
	public String getId() {
		return Id;
	}
	@JsonSetter("Id")
	public void setId(String id) {
		Id = id;
	}
	
	@JsonGetter("Name")
	public String getName() {
		return Name;
	}
	@JsonSetter("Name")
	public void setName(String name) {
		Name = name;
	}
	
	@JsonGetter("Geometry")
	public Geometry getGeometry() {
		return Geometry;
	}
	@JsonSetter("Geometry")
	public void setGeometry(Geometry geometry) {
		Geometry = geometry;
	}
	
	@JsonGetter("Property")
	public Property getProperty() {
		return Property;
	}
	@JsonSetter("Property")
	public void setProperty(Property property) {
		Property = property;
	}
	
}