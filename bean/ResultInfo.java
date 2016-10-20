package com.example.bean;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultInfo {

    @JsonProperty("Count")
	private Integer Count;
    @JsonProperty("Total")
	private Integer Total;
    @JsonProperty("Start")
	private Integer Start;
    @JsonProperty("Status")
	private Integer Status;
    @JsonProperty("Latency")
	private double Latency;
    @JsonProperty("Description")
	private String Description;
    @JsonProperty("Copyright")
	private String Copyright;
    
    @JsonGetter("Count")
	public Integer getCount() {
		return Count;
	}
    @JsonSetter("Count")
	public void setCount(Integer count) {
		this.Count = count;
	}
	
    @JsonGetter("Total")
	public Integer getTotal() {
		return Total;
	}
    @JsonSetter("Total")
	public void setTotal(Integer total) {
		this.Total = total;
	}
	
	@JsonGetter("Start")
	public Integer getStart() {
		return Start;
	}
	@JsonSetter("Start")
	public void setStart(Integer start) {
		this.Start = start;
	}
	
	@JsonGetter("Status")
	public Integer getStatus() {
		return Status;
	}
	@JsonSetter("Status")
	public void setStatus(Integer status) {
		this.Status = status;
	}
	
	@JsonGetter("Latency")
	public double getLatency() {
		return Latency;
	}
	@JsonSetter("Latency")
	public void setLatency(double latency) {
		Latency = latency;
	}
	
	@JsonGetter("Description")
	public String getDescription() {
		return Description;
	}
	@JsonSetter("Description")
	public void setDescription(String description) {
		Description = description;
	}
	
	@JsonGetter("Copyright")
	public String getCopyright() {
		return Copyright;
	
	}
	@JsonSetter("Copyright")
	public void setCopyright(String copyright) {
		Copyright = copyright;
	}
}
