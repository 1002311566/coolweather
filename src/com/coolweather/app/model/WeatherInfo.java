package com.coolweather.app.model;

import java.io.Serializable;

/**
 * 天气信息类
 * @author Administrator
 *
 */
public class WeatherInfo implements Serializable{
	private String city;//城市
	private String pinyin;//城市拼音
	private String citycode;//城市编码	
	private String date;//日期
	private String time;//发布时间
	private String postCode;//邮编
	private String longitude;//经度
	private String latitude;//维度
	private String altitude;//海拔	
	private String weather;//天气情况
	private String temp;//气温
	private String l_tmp;//最低气温
	private String h_tmp;//最高气温
	private String WD;//风向
	private String WS;//风力
	private String sunrise;//日出时间
	private String sunset;//日落时间
	public WeatherInfo(String city, String pinyin, String citycode,
			String date, String time, String postCode, String longitude,
			String latitude, String altitude, String weather, String temp,
			String l_tmp, String h_tmp, String wD, String wS, String sunrise,
			String sunset) {
		super();
		this.city = city;
		this.pinyin = pinyin;
		this.citycode = citycode;
		this.date = date;
		this.time = time;
		this.postCode = postCode;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.weather = weather;
		this.temp = temp;
		this.l_tmp = l_tmp;
		this.h_tmp = h_tmp;
		WD = wD;
		WS = wS;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinyin() {
		return pinyin;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getL_tmp() {
		return l_tmp;
	}
	public void setL_tmp(String l_tmp) {
		this.l_tmp = l_tmp;
	}
	public String getH_tmp() {
		return h_tmp;
	}
	public void setH_tmp(String h_tmp) {
		this.h_tmp = h_tmp;
	}
	public String getWD() {
		return WD;
	}
	public void setWD(String wD) {
		WD = wD;
	}
	public String getWS() {
		return WS;
	}
	public void setWS(String wS) {
		WS = wS;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	@Override
	public String toString() {
		return "WeatherInfo [city=" + city + ", pinyin=" + pinyin
				+ ", citycode=" + citycode + ", date=" + date + ", time="
				+ time + ", postCode=" + postCode + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", altitude=" + altitude
				+ ", weather=" + weather + ", temp=" + temp + ", l_tmp="
				+ l_tmp + ", h_tmp=" + h_tmp + ", WD=" + WD + ", WS=" + WS
				+ ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}

	
	
}
