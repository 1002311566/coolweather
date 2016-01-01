package com.coolweather.app.util;

import java.net.URLEncoder;

import org.json.JSONObject;

import com.coolweather.app.interfaces.Constant;
import com.coolweather.app.model.WeatherInfo;

public class GetWeatherUtil {
	

	public static WeatherInfo requestCityWeather(String cityName) {
		WeatherInfo weatherInfo = null;
		// 加载天气
		String json = HttpUtil.httpGet(Constant.httpUrlWeather, "cityname="
				+ URLEncoder.encode(cityName));
		LogUtils.d("weather", json);
		// 解析json数据
		try {
			JSONObject weather = new JSONObject(json);
			JSONObject weather2 = weather.getJSONObject("retData");

			weatherInfo = new WeatherInfo(weather2.getString("city"),
					weather2.getString("pinyin"),
					weather2.getString("citycode"),
					weather2.getString("date"),
					weather2.getString("time"),
					weather2.getString("postCode"),
					weather2.getString("longitude"),
					weather2.getString("latitude"),
					weather2.getString("altitude"),
					weather2.getString("weather"),
					weather2.getString("temp"),
					weather2.getString("l_tmp"),
					weather2.getString("h_tmp"),
					weather2.getString("WD"), 
					weather2.getString("WS"),
					weather2.getString("sunrise"),
					weather2.getString("sunset"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return weatherInfo;
	}
}
