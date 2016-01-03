package com.coolweather.app.util;

import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

import com.coolweather.app.interfaces.Constant;
import com.coolweather.app.model.WeatherForecastInfo;
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
					weather2.getString("citycode"), weather2.getString("date"),
					weather2.getString("time"), weather2.getString("postCode"),
					weather2.getString("longitude"),
					weather2.getString("latitude"),
					weather2.getString("altitude"),
					weather2.getString("weather"), weather2.getString("temp"),
					weather2.getString("l_tmp"), weather2.getString("h_tmp"),
					weather2.getString("WD"), weather2.getString("WS"),
					weather2.getString("sunrise"), weather2.getString("sunset"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return weatherInfo;
	}

	/**
	 * 获取未来几天天气
	 */
	public static WeatherForecastInfo requestCityWeatherForecast(String cityName,String cityId){
		WeatherForecastInfo weatherForecastInfo = null;
		String json = HttpUtil.httpGet(Constant.httpUrlWeatherForecast, "cityname="+URLEncoder.encode(cityName)+"&cityid="+cityId);
		LogUtils.d("requestCityWeatherForecast", json);
		
		try {
			
			JSONObject info = new JSONObject(json);
			JSONObject retData = info.getJSONObject("retData");
			String city = retData.getString("city");
			String cityid = retData.getString("cityid");
			
			JSONObject today = retData.getJSONObject("today");
			
			String today_date = today.getString("date");
			String today_week = today.getString("week");
			String today_curTemp = today.getString("curTemp");
			String today_aqi = today.getString("aqi");
			String today_fengxiang = today.getString("fengxiang");
			String today_fengli = today.getString("fengli");
			String today_hightemp = today.getString("hightemp");
			String today_lowtemp = today.getString("lowtemp");
			String today_type = today.getString("type");
			
			JSONArray today_index = today.getJSONArray("index");
			
			JSONObject today_index_1 = today_index.getJSONObject(0);
			String today_index_1_name = today_index_1.getString("name");
			String today_index_1_code = today_index_1.getString("code");
			String today_index_1_index = today_index_1.getString("index");
			String today_index_1_details = today_index_1.getString("details");
			
			JSONObject today_index_2 = today_index.getJSONObject(1);
			String today_index_2_name = today_index_2.getString("name");
			String today_index_2_code = today_index_2.getString("code");
			String today_index_2_index = today_index_2.getString("index");
			String today_index_2_details = today_index_2.getString("details");
			
			JSONObject today_index_3 = today_index.getJSONObject(2);
			String today_index_3_name = today_index_3.getString("name");
			String today_index_3_code = today_index_3.getString("code");
			String today_index_3_index = today_index_3.getString("index");
			String today_index_3_details = today_index_3.getString("details");
			
			JSONObject today_index_4 = today_index.getJSONObject(3);
			String today_index_4_name = today_index_4.getString("name");
			String today_index_4_code = today_index_4.getString("code");
			String today_index_4_index = today_index_4.getString("index");
			String today_index_4_details = today_index_4.getString("details");
			
			JSONObject today_index_5 = today_index.getJSONObject(4);
			String today_index_5_name = today_index_5.getString("name");
			String today_index_5_code = today_index_5.getString("code");
			String today_index_5_index = today_index_5.getString("index");
			String today_index_5_details = today_index_5.getString("details");
			
			JSONObject today_index_6 = today_index.getJSONObject(5);
			String today_index_6_name = today_index_6.getString("name");
			String today_index_6_code = today_index_6.getString("code");
			String today_index_6_index = today_index_6.getString("index");
			String today_index_6_details = today_index_6.getString("details");
			
			//未来天气
			JSONArray forecast = retData.getJSONArray("forecast");
			
			JSONObject forecast_1 = forecast.getJSONObject(0);
			String forecast_1_date = forecast_1.getString("date");
			String forecast_1_week = forecast_1.getString("week");
			String forecast_1_fengxiang = forecast_1.getString("fengxiang");
			String forecast_1_fengli = forecast_1.getString("fengli");
			String forecast_1_hightemp = forecast_1.getString("hightemp");
			String forecast_1_lowtemp = forecast_1.getString("lowtemp");
			String forecast_1_type = forecast_1.getString("type");
			
			JSONObject forecast_2 = forecast.getJSONObject(1);
			String forecast_2_date = forecast_2.getString("date");
			String forecast_2_week = forecast_2.getString("week");
			String forecast_2_fengxiang = forecast_2.getString("fengxiang");
			String forecast_2_fengli = forecast_2.getString("fengli");
			String forecast_2_hightemp = forecast_2.getString("hightemp");
			String forecast_2_lowtemp = forecast_2.getString("lowtemp");
			String forecast_2_type = forecast_2.getString("type");
			
			JSONObject forecast_3 = forecast.getJSONObject(2);
			String forecast_3_date = forecast_3.getString("date");
			String forecast_3_week = forecast_3.getString("week");
			String forecast_3_fengxiang = forecast_3.getString("fengxiang");
			String forecast_3_fengli = forecast_3.getString("fengli");
			String forecast_3_hightemp = forecast_3.getString("hightemp");
			String forecast_3_lowtemp = forecast_3.getString("lowtemp");
			String forecast_3_type = forecast_3.getString("type");
			
			JSONObject forecast_4 = forecast.getJSONObject(3);
			String forecast_4_date = forecast_4.getString("date");
			String forecast_4_week = forecast_4.getString("week");
			String forecast_4_fengxiang = forecast_4.getString("fengxiang");
			String forecast_4_fengli = forecast_4.getString("fengli");
			String forecast_4_hightemp = forecast_4.getString("hightemp");
			String forecast_4_lowtemp = forecast_4.getString("lowtemp");
			String forecast_4_type = forecast_4.getString("type");
			
			weatherForecastInfo = new WeatherForecastInfo(city, cityid, today_date,
					today_week, today_curTemp, today_aqi, today_fengxiang, today_fengli,
					today_hightemp, today_lowtemp, today_type, today_index_1_name, today_index_1_code,
					today_index_1_index, today_index_1_details, today_index_2_name, today_index_2_code,
					today_index_2_index, today_index_2_details, today_index_3_name, today_index_3_code,
					today_index_3_index, today_index_3_details, today_index_4_name, today_index_4_code,
					today_index_4_index, today_index_4_details, today_index_5_name, today_index_5_code,
					today_index_5_index, today_index_5_details, today_index_6_name, today_index_6_code,
					today_index_6_index, today_index_6_details, forecast_1_date, forecast_1_week,
					forecast_1_fengxiang, forecast_1_fengli, forecast_1_hightemp, forecast_1_lowtemp,
					forecast_1_type, forecast_2_date, forecast_2_week, forecast_2_fengxiang, forecast_2_fengli,
					forecast_2_hightemp, forecast_2_lowtemp, forecast_2_type, forecast_3_date, forecast_3_week,
					forecast_3_fengxiang, forecast_3_fengli, forecast_3_hightemp, forecast_3_lowtemp, forecast_3_type,
					forecast_4_date, forecast_4_week, forecast_4_fengxiang, forecast_4_fengli, forecast_4_hightemp,
					forecast_4_lowtemp, forecast_4_type);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return weatherForecastInfo;
	}
}
