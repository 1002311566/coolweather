package com.coolweather.app.model;

import java.io.Serializable;

/**
 * 未来四天天气
 * 
 * @author Administrator
 * 
 */
public class WeatherForecastInfo implements Serializable{

	private String city;
	private String cityId;

	private String today_date;
	private String today_week;
	private String today_curTemp;
	private String today_aqi;
	private String today_fengxiang;
	private String today_fengli;
	private String today_hightemp;
	private String today_lowtemp;
	private String today_type;

	private String today_index_1_name;
	private String today_index_1_code;
	private String today_index_1_index;
	private String today_index_1_details;

	private String today_index_2_name;
	private String today_index_2_code;
	private String today_index_2_index;
	private String today_index_2_details;

	private String today_index_3_name;
	private String today_index_3_code;
	private String today_index_3_index;
	private String today_index_3_details;

	private String today_index_4_name;
	private String today_index_4_code;
	private String today_index_4_index;
	private String today_index_4_details;

	private String today_index_5_name;
	private String today_index_5_code;
	private String today_index_5_index;
	private String today_index_5_details;

	private String today_index_6_name;
	private String today_index_6_code;
	private String today_index_6_index;
	private String today_index_6_details;

	private String forecast_1_date;
	private String forecast_1_week;
	private String forecast_1_fengxiang;
	private String forecast_1_fengli;
	private String forecast_1_hightemp;
	private String forecast_1_lowtemp;
	private String forecast_1_type;

	private String forecast_2_date;
	private String forecast_2_week;
	private String forecast_2_fengxiang;
	private String forecast_2_fengli;
	private String forecast_2_hightemp;
	private String forecast_2_lowtemp;
	private String forecast_2_type;

	private String forecast_3_date;
	private String forecast_3_week;
	private String forecast_3_fengxiang;
	private String forecast_3_fengli;
	private String forecast_3_hightemp;
	private String forecast_3_lowtemp;
	private String forecast_3_type;

	private String forecast_4_date;
	private String forecast_4_week;
	private String forecast_4_fengxiang;
	private String forecast_4_fengli;
	private String forecast_4_hightemp;
	private String forecast_4_lowtemp;
	private String forecast_4_type;

	public WeatherForecastInfo(String city, String cityId, String today_date,
			String today_week, String today_curTemp, String today_aqi,
			String today_fengxiang, String today_fengli, String today_hightemp,
			String today_lowtemp, String today_type, String today_index_1_name,
			String today_index_1_code, String today_index_1_index,
			String today_index_1_details, String today_index_2_name,
			String today_index_2_code, String today_index_2_index,
			String today_index_2_details, String today_index_3_name,
			String today_index_3_code, String today_index_3_index,
			String today_index_3_details, String today_index_4_name,
			String today_index_4_code, String today_index_4_index,
			String today_index_4_details, String today_index_5_name,
			String today_index_5_code, String today_index_5_index,
			String today_index_5_details, String today_index_6_name,
			String today_index_6_code, String today_index_6_index,
			String today_index_6_details, String forecast_1_date,
			String forecast_1_week, String forecast_1_fengxiang,
			String forecast_1_fengli, String forecast_1_hightemp,
			String forecast_1_lowtemp, String forecast_1_type,
			String forecast_2_date, String forecast_2_week,
			String forecast_2_fengxiang, String forecast_2_fengli,
			String forecast_2_hightemp, String forecast_2_lowtemp,
			String forecast_2_type, String forecast_3_date,
			String forecast_3_week, String forecast_3_fengxiang,
			String forecast_3_fengli, String forecast_3_hightemp,
			String forecast_3_lowtemp, String forecast_3_type,
			String forecast_4_date, String forecast_4_week,
			String forecast_4_fengxiang, String forecast_4_fengli,
			String forecast_4_hightemp, String forecast_4_lowtemp,
			String forecast_4_type) {
		super();
		this.city = city;
		this.cityId = cityId;
		this.today_date = today_date;
		this.today_week = today_week;
		this.today_curTemp = today_curTemp;
		this.today_aqi = today_aqi;
		this.today_fengxiang = today_fengxiang;
		this.today_fengli = today_fengli;
		this.today_hightemp = today_hightemp;
		this.today_lowtemp = today_lowtemp;
		this.today_type = today_type;
		this.today_index_1_name = today_index_1_name;
		this.today_index_1_code = today_index_1_code;
		this.today_index_1_index = today_index_1_index;
		this.today_index_1_details = today_index_1_details;
		this.today_index_2_name = today_index_2_name;
		this.today_index_2_code = today_index_2_code;
		this.today_index_2_index = today_index_2_index;
		this.today_index_2_details = today_index_2_details;
		this.today_index_3_name = today_index_3_name;
		this.today_index_3_code = today_index_3_code;
		this.today_index_3_index = today_index_3_index;
		this.today_index_3_details = today_index_3_details;
		this.today_index_4_name = today_index_4_name;
		this.today_index_4_code = today_index_4_code;
		this.today_index_4_index = today_index_4_index;
		this.today_index_4_details = today_index_4_details;
		this.today_index_5_name = today_index_5_name;
		this.today_index_5_code = today_index_5_code;
		this.today_index_5_index = today_index_5_index;
		this.today_index_5_details = today_index_5_details;
		this.today_index_6_name = today_index_6_name;
		this.today_index_6_code = today_index_6_code;
		this.today_index_6_index = today_index_6_index;
		this.today_index_6_details = today_index_6_details;
		this.forecast_1_date = forecast_1_date;
		this.forecast_1_week = forecast_1_week;
		this.forecast_1_fengxiang = forecast_1_fengxiang;
		this.forecast_1_fengli = forecast_1_fengli;
		this.forecast_1_hightemp = forecast_1_hightemp;
		this.forecast_1_lowtemp = forecast_1_lowtemp;
		this.forecast_1_type = forecast_1_type;
		this.forecast_2_date = forecast_2_date;
		this.forecast_2_week = forecast_2_week;
		this.forecast_2_fengxiang = forecast_2_fengxiang;
		this.forecast_2_fengli = forecast_2_fengli;
		this.forecast_2_hightemp = forecast_2_hightemp;
		this.forecast_2_lowtemp = forecast_2_lowtemp;
		this.forecast_2_type = forecast_2_type;
		this.forecast_3_date = forecast_3_date;
		this.forecast_3_week = forecast_3_week;
		this.forecast_3_fengxiang = forecast_3_fengxiang;
		this.forecast_3_fengli = forecast_3_fengli;
		this.forecast_3_hightemp = forecast_3_hightemp;
		this.forecast_3_lowtemp = forecast_3_lowtemp;
		this.forecast_3_type = forecast_3_type;
		this.forecast_4_date = forecast_4_date;
		this.forecast_4_week = forecast_4_week;
		this.forecast_4_fengxiang = forecast_4_fengxiang;
		this.forecast_4_fengli = forecast_4_fengli;
		this.forecast_4_hightemp = forecast_4_hightemp;
		this.forecast_4_lowtemp = forecast_4_lowtemp;
		this.forecast_4_type = forecast_4_type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getToday_date() {
		return today_date;
	}

	public void setToday_date(String today_date) {
		this.today_date = today_date;
	}

	public String getToday_week() {
		return today_week;
	}

	public void setToday_week(String today_week) {
		this.today_week = today_week;
	}

	public String getToday_curTemp() {
		return today_curTemp;
	}

	public void setToday_curTemp(String today_curTemp) {
		this.today_curTemp = today_curTemp;
	}

	public String getToday_aqi() {
		return today_aqi;
	}

	public void setToday_aqi(String today_aqi) {
		this.today_aqi = today_aqi;
	}

	public String getToday_fengxiang() {
		return today_fengxiang;
	}

	public void setToday_fengxiang(String today_fengxiang) {
		this.today_fengxiang = today_fengxiang;
	}

	public String getToday_fengli() {
		return today_fengli;
	}

	public void setToday_fengli(String today_fengli) {
		this.today_fengli = today_fengli;
	}

	public String getToday_hightemp() {
		return today_hightemp;
	}

	public void setToday_hightemp(String today_hightemp) {
		this.today_hightemp = today_hightemp;
	}

	public String getToday_lowtemp() {
		return today_lowtemp;
	}

	public void setToday_lowtemp(String today_lowtemp) {
		this.today_lowtemp = today_lowtemp;
	}

	public String getToday_type() {
		return today_type;
	}

	public void setToday_type(String today_type) {
		this.today_type = today_type;
	}

	public String getToday_index_1_name() {
		return today_index_1_name;
	}

	public void setToday_index_1_name(String today_index_1_name) {
		this.today_index_1_name = today_index_1_name;
	}

	public String getToday_index_1_code() {
		return today_index_1_code;
	}

	public void setToday_index_1_code(String today_index_1_code) {
		this.today_index_1_code = today_index_1_code;
	}

	public String getToday_index_1_index() {
		return today_index_1_index;
	}

	public void setToday_index_1_index(String today_index_1_index) {
		this.today_index_1_index = today_index_1_index;
	}

	public String getToday_index_1_details() {
		return today_index_1_details;
	}

	public void setToday_index_1_details(String today_index_1_details) {
		this.today_index_1_details = today_index_1_details;
	}

	public String getToday_index_2_name() {
		return today_index_2_name;
	}

	public void setToday_index_2_name(String today_index_2_name) {
		this.today_index_2_name = today_index_2_name;
	}

	public String getToday_index_2_code() {
		return today_index_2_code;
	}

	public void setToday_index_2_code(String today_index_2_code) {
		this.today_index_2_code = today_index_2_code;
	}

	public String getToday_index_2_index() {
		return today_index_2_index;
	}

	public void setToday_index_2_index(String today_index_2_index) {
		this.today_index_2_index = today_index_2_index;
	}

	public String getToday_index_2_details() {
		return today_index_2_details;
	}

	public void setToday_index_2_details(String today_index_2_details) {
		this.today_index_2_details = today_index_2_details;
	}

	public String getToday_index_3_name() {
		return today_index_3_name;
	}

	public void setToday_index_3_name(String today_index_3_name) {
		this.today_index_3_name = today_index_3_name;
	}

	public String getToday_index_3_code() {
		return today_index_3_code;
	}

	public void setToday_index_3_code(String today_index_3_code) {
		this.today_index_3_code = today_index_3_code;
	}

	public String getToday_index_3_index() {
		return today_index_3_index;
	}

	public void setToday_index_3_index(String today_index_3_index) {
		this.today_index_3_index = today_index_3_index;
	}

	public String getToday_index_3_details() {
		return today_index_3_details;
	}

	public void setToday_index_3_details(String today_index_3_details) {
		this.today_index_3_details = today_index_3_details;
	}

	public String getToday_index_4_name() {
		return today_index_4_name;
	}

	public void setToday_index_4_name(String today_index_4_name) {
		this.today_index_4_name = today_index_4_name;
	}

	public String getToday_index_4_code() {
		return today_index_4_code;
	}

	public void setToday_index_4_code(String today_index_4_code) {
		this.today_index_4_code = today_index_4_code;
	}

	public String getToday_index_4_index() {
		return today_index_4_index;
	}

	public void setToday_index_4_index(String today_index_4_index) {
		this.today_index_4_index = today_index_4_index;
	}

	public String getToday_index_4_details() {
		return today_index_4_details;
	}

	public void setToday_index_4_details(String today_index_4_details) {
		this.today_index_4_details = today_index_4_details;
	}

	public String getToday_index_5_name() {
		return today_index_5_name;
	}

	public void setToday_index_5_name(String today_index_5_name) {
		this.today_index_5_name = today_index_5_name;
	}

	public String getToday_index_5_code() {
		return today_index_5_code;
	}

	public void setToday_index_5_code(String today_index_5_code) {
		this.today_index_5_code = today_index_5_code;
	}

	public String getToday_index_5_index() {
		return today_index_5_index;
	}

	public void setToday_index_5_index(String today_index_5_index) {
		this.today_index_5_index = today_index_5_index;
	}

	public String getToday_index_5_details() {
		return today_index_5_details;
	}

	public void setToday_index_5_details(String today_index_5_details) {
		this.today_index_5_details = today_index_5_details;
	}

	public String getToday_index_6_name() {
		return today_index_6_name;
	}

	public void setToday_index_6_name(String today_index_6_name) {
		this.today_index_6_name = today_index_6_name;
	}

	public String getToday_index_6_code() {
		return today_index_6_code;
	}

	public void setToday_index_6_code(String today_index_6_code) {
		this.today_index_6_code = today_index_6_code;
	}

	public String getToday_index_6_index() {
		return today_index_6_index;
	}

	public void setToday_index_6_index(String today_index_6_index) {
		this.today_index_6_index = today_index_6_index;
	}

	public String getToday_index_6_details() {
		return today_index_6_details;
	}

	public void setToday_index_6_details(String today_index_6_details) {
		this.today_index_6_details = today_index_6_details;
	}

	public String getForecast_1_date() {
		return forecast_1_date;
	}

	public void setForecast_1_date(String forecast_1_date) {
		this.forecast_1_date = forecast_1_date;
	}

	public String getForecast_1_week() {
		return forecast_1_week;
	}

	public void setForecast_1_week(String forecast_1_week) {
		this.forecast_1_week = forecast_1_week;
	}

	public String getForecast_1_fengxiang() {
		return forecast_1_fengxiang;
	}

	public void setForecast_1_fengxiang(String forecast_1_fengxiang) {
		this.forecast_1_fengxiang = forecast_1_fengxiang;
	}

	public String getForecast_1_fengli() {
		return forecast_1_fengli;
	}

	public void setForecast_1_fengli(String forecast_1_fengli) {
		this.forecast_1_fengli = forecast_1_fengli;
	}

	public String getForecast_1_hightemp() {
		return forecast_1_hightemp;
	}

	public void setForecast_1_hightemp(String forecast_1_hightemp) {
		this.forecast_1_hightemp = forecast_1_hightemp;
	}

	public String getForecast_1_lowtemp() {
		return forecast_1_lowtemp;
	}

	public void setForecast_1_lowtemp(String forecast_1_lowtemp) {
		this.forecast_1_lowtemp = forecast_1_lowtemp;
	}

	public String getForecast_1_type() {
		return forecast_1_type;
	}

	public void setForecast_1_type(String forecast_1_type) {
		this.forecast_1_type = forecast_1_type;
	}

	public String getForecast_2_date() {
		return forecast_2_date;
	}

	public void setForecast_2_date(String forecast_2_date) {
		this.forecast_2_date = forecast_2_date;
	}

	public String getForecast_2_week() {
		return forecast_2_week;
	}

	public void setForecast_2_week(String forecast_2_week) {
		this.forecast_2_week = forecast_2_week;
	}

	public String getForecast_2_fengxiang() {
		return forecast_2_fengxiang;
	}

	public void setForecast_2_fengxiang(String forecast_2_fengxiang) {
		this.forecast_2_fengxiang = forecast_2_fengxiang;
	}

	public String getForecast_2_fengli() {
		return forecast_2_fengli;
	}

	public void setForecast_2_fengli(String forecast_2_fengli) {
		this.forecast_2_fengli = forecast_2_fengli;
	}

	public String getForecast_2_hightemp() {
		return forecast_2_hightemp;
	}

	public void setForecast_2_hightemp(String forecast_2_hightemp) {
		this.forecast_2_hightemp = forecast_2_hightemp;
	}

	public String getForecast_2_lowtemp() {
		return forecast_2_lowtemp;
	}

	public void setForecast_2_lowtemp(String forecast_2_lowtemp) {
		this.forecast_2_lowtemp = forecast_2_lowtemp;
	}

	public String getForecast_2_type() {
		return forecast_2_type;
	}

	public void setForecast_2_type(String forecast_2_type) {
		this.forecast_2_type = forecast_2_type;
	}

	public String getForecast_3_date() {
		return forecast_3_date;
	}

	public void setForecast_3_date(String forecast_3_date) {
		this.forecast_3_date = forecast_3_date;
	}

	public String getForecast_3_week() {
		return forecast_3_week;
	}

	public void setForecast_3_week(String forecast_3_week) {
		this.forecast_3_week = forecast_3_week;
	}

	public String getForecast_3_fengxiang() {
		return forecast_3_fengxiang;
	}

	public void setForecast_3_fengxiang(String forecast_3_fengxiang) {
		this.forecast_3_fengxiang = forecast_3_fengxiang;
	}

	public String getForecast_3_fengli() {
		return forecast_3_fengli;
	}

	public void setForecast_3_fengli(String forecast_3_fengli) {
		this.forecast_3_fengli = forecast_3_fengli;
	}

	public String getForecast_3_hightemp() {
		return forecast_3_hightemp;
	}

	public void setForecast_3_hightemp(String forecast_3_hightemp) {
		this.forecast_3_hightemp = forecast_3_hightemp;
	}

	public String getForecast_3_lowtemp() {
		return forecast_3_lowtemp;
	}

	public void setForecast_3_lowtemp(String forecast_3_lowtemp) {
		this.forecast_3_lowtemp = forecast_3_lowtemp;
	}

	public String getForecast_3_type() {
		return forecast_3_type;
	}

	public void setForecast_3_type(String forecast_3_type) {
		this.forecast_3_type = forecast_3_type;
	}

	public String getForecast_4_date() {
		return forecast_4_date;
	}

	public void setForecast_4_date(String forecast_4_date) {
		this.forecast_4_date = forecast_4_date;
	}

	public String getForecast_4_week() {
		return forecast_4_week;
	}

	public void setForecast_4_week(String forecast_4_week) {
		this.forecast_4_week = forecast_4_week;
	}

	public String getForecast_4_fengxiang() {
		return forecast_4_fengxiang;
	}

	public void setForecast_4_fengxiang(String forecast_4_fengxiang) {
		this.forecast_4_fengxiang = forecast_4_fengxiang;
	}

	public String getForecast_4_fengli() {
		return forecast_4_fengli;
	}

	public void setForecast_4_fengli(String forecast_4_fengli) {
		this.forecast_4_fengli = forecast_4_fengli;
	}

	public String getForecast_4_hightemp() {
		return forecast_4_hightemp;
	}

	public void setForecast_4_hightemp(String forecast_4_hightemp) {
		this.forecast_4_hightemp = forecast_4_hightemp;
	}

	public String getForecast_4_lowtemp() {
		return forecast_4_lowtemp;
	}

	public void setForecast_4_lowtemp(String forecast_4_lowtemp) {
		this.forecast_4_lowtemp = forecast_4_lowtemp;
	}

	public String getForecast_4_type() {
		return forecast_4_type;
	}

	public void setForecast_4_type(String forecast_4_type) {
		this.forecast_4_type = forecast_4_type;
	}

	@Override
	public String toString() {
		return "WeatherForecastInfo [city=" + city + ", cityId=" + cityId
				+ ", today_date=" + today_date + ", today_week=" + today_week
				+ ", today_curTemp=" + today_curTemp + ", today_aqi="
				+ today_aqi + ", today_fengxiang=" + today_fengxiang
				+ ", today_fengli=" + today_fengli + ", today_hightemp="
				+ today_hightemp + ", today_lowtemp=" + today_lowtemp
				+ ", today_type=" + today_type + ", today_index_1_name="
				+ today_index_1_name + ", today_index_1_code="
				+ today_index_1_code + ", today_index_1_index="
				+ today_index_1_index + ", today_index_1_details="
				+ today_index_1_details + ", today_index_2_name="
				+ today_index_2_name + ", today_index_2_code="
				+ today_index_2_code + ", today_index_2_index="
				+ today_index_2_index + ", today_index_2_details="
				+ today_index_2_details + ", today_index_3_name="
				+ today_index_3_name + ", today_index_3_code="
				+ today_index_3_code + ", today_index_3_index="
				+ today_index_3_index + ", today_index_3_details="
				+ today_index_3_details + ", today_index_4_name="
				+ today_index_4_name + ", today_index_4_code="
				+ today_index_4_code + ", today_index_4_index="
				+ today_index_4_index + ", today_index_4_details="
				+ today_index_4_details + ", today_index_5_name="
				+ today_index_5_name + ", today_index_5_code="
				+ today_index_5_code + ", today_index_5_index="
				+ today_index_5_index + ", today_index_5_details="
				+ today_index_5_details + ", today_index_6_name="
				+ today_index_6_name + ", today_index_6_code="
				+ today_index_6_code + ", today_index_6_index="
				+ today_index_6_index + ", today_index_6_details="
				+ today_index_6_details + ", forecast_1_date="
				+ forecast_1_date + ", forecast_1_week=" + forecast_1_week
				+ ", forecast_1_fengxiang=" + forecast_1_fengxiang
				+ ", forecast_1_fengli=" + forecast_1_fengli
				+ ", forecast_1_hightemp=" + forecast_1_hightemp
				+ ", forecast_1_lowtemp=" + forecast_1_lowtemp
				+ ", forecast_1_type=" + forecast_1_type + ", forecast_2_date="
				+ forecast_2_date + ", forecast_2_week=" + forecast_2_week
				+ ", forecast_2_fengxiang=" + forecast_2_fengxiang
				+ ", forecast_2_fengli=" + forecast_2_fengli
				+ ", forecast_2_hightemp=" + forecast_2_hightemp
				+ ", forecast_2_lowtemp=" + forecast_2_lowtemp
				+ ", forecast_2_type=" + forecast_2_type + ", forecast_3_date="
				+ forecast_3_date + ", forecast_3_week=" + forecast_3_week
				+ ", forecast_3_fengxiang=" + forecast_3_fengxiang
				+ ", forecast_3_fengli=" + forecast_3_fengli
				+ ", forecast_3_hightemp=" + forecast_3_hightemp
				+ ", forecast_3_lowtemp=" + forecast_3_lowtemp
				+ ", forecast_3_type=" + forecast_3_type + ", forecast_4_date="
				+ forecast_4_date + ", forecast_4_week=" + forecast_4_week
				+ ", forecast_4_fengxiang=" + forecast_4_fengxiang
				+ ", forecast_4_fengli=" + forecast_4_fengli
				+ ", forecast_4_hightemp=" + forecast_4_hightemp
				+ ", forecast_4_lowtemp=" + forecast_4_lowtemp
				+ ", forecast_4_type=" + forecast_4_type + "]";
	}

}
