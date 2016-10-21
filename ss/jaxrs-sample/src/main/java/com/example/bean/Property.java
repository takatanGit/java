package com.example.bean;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Property {
	@JsonProperty("WeatherAreaCode")
    private Object WeatherAreaCode;
	//@JsonProperty("WeatherList")
    //private Weather[] weatherList;
	@JsonProperty("WeatherList")
	private WeatherList WeatherList;
	
	
	public WeatherList getWeatherList() {
		return WeatherList;
	}
	public void setWeatherList(WeatherList weatherList) {
		WeatherList = weatherList;
	}
	public Object getWeatherAreaCode() {
		return WeatherAreaCode;
	}
	public void setWeatherAreaCode(Object weatherAreaCode) {
		this.WeatherAreaCode = weatherAreaCode;
	}
	/*
	public Weather[] getWeatherList() {
		return weatherList;
	}
	public void setWeatherList(Weather[] weatherList) {
		this.weatherList = weatherList;
	}
	*/
}
