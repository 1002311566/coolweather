package com.coolweather.app.interfaces;

import java.util.LinkedHashMap;
import java.util.Map;

import com.coolweather.app.R;

public interface Constant {
	int DATABASE_VERSION = 1;
	String TABLE_PROVINCE = "Province";
	String TABLE_CITY = "City";
	String httpUrl = "http://apis.baidu.com/apistore/weatherservice/citylist";// 地址
	String httpUrlWeather = "http://apis.baidu.com/apistore/weatherservice/cityname";
	String httpUrlWeatherForecast = "http://apis.baidu.com/apistore/weatherservice/recentweathers";
	
	
	//Fragment的位置标记
	int NOW_DAY = 0;
	int FIRST_DAY = 1;
	int SECOND_DAY = 2;
	int THIRD_DAY = 3;
	int FOURTH_DAY = 4;
	

}
