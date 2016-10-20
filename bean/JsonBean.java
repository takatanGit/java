package com.example.bean;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JsonBean {
	@JsonProperty("ResultInfo")
	private  ResultInfo ResultInfo;
	
	@JsonProperty("Feature")
	private Feature[] Feature;
	
	@JsonGetter("ResultInfo")
	public ResultInfo getResultInfo() {
		return ResultInfo;
	}
	@JsonSetter("ResultInfo")
	public void setResultInfo(ResultInfo resultInfo) {
		ResultInfo = resultInfo;
	}
	
	@JsonGetter("Feature")
	public Feature[] getFeature() {
		return Feature;
	}
	@JsonSetter("Feature")
	public void setFeature(Feature[] feature) {
		Feature = feature;
	}

}