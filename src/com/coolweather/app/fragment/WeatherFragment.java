package com.coolweather.app.fragment;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

import com.coolweather.app.R;
import com.coolweather.app.activity.WeatherActivity;
import com.coolweather.app.base.BaseFragment;
import com.coolweather.app.model.WeatherInfo;

public  class WeatherFragment extends BaseFragment{

	private TextView altitude;
	private TextView city;
	private TextView citycode;
	private TextView date;
	private TextView h_tmp;
	private TextView l_tmp;
	private TextView latitude;
	private TextView pinyin;
	private TextView postcode;
	private TextView sunrise;
	private TextView sunset;
	private TextView temp;
	private TextView time;
	private TextView wd;
	private TextView weather;
	private TextView ws;
	private TextView longitude;
	
	private String cityName;
	@Override
	public void initData() {
		WeatherActivity activity = (WeatherActivity) getActivity();
		Intent intent = activity.getIntent();
		WeatherInfo weatherInfo = (WeatherInfo) intent.getSerializableExtra("WEATHER");
		city.setText(cityName = weatherInfo.getCity());
		pinyin.setText(weatherInfo.getPinyin());
		citycode.setText(weatherInfo.getCitycode());
		date.setText(weatherInfo.getDate());
		time.setText(weatherInfo.getTime());
		postcode.setText(weatherInfo.getPostCode());
		longitude.setText(weatherInfo.getLongitude());
		latitude.setText(weatherInfo.getLatitude());
		altitude.setText(weatherInfo.getAltitude());
		weather.setText(weatherInfo.getWeather());
		temp.setText(weatherInfo.getTemp());
		l_tmp.setText(weatherInfo.getL_tmp());
		h_tmp.setText(weatherInfo.getH_tmp());
		wd.setText(weatherInfo.getWD());
		ws.setText(weatherInfo.getWS());
		sunrise.setText(weatherInfo.getSunrise());
		sunset.setText(weatherInfo.getSunset());
		
	}

	@Override
	public int setLayout() {
		return R.layout.fragment_weather;
	}

	@Override
	public void initView() {
		View rootview = getRootView();
		altitude = (TextView) rootview.findViewById(R.id.altitude);
		city = (TextView) rootview.findViewById(R.id.city);
		citycode = (TextView) rootview.findViewById(R.id.citycode);
		date = (TextView) rootview.findViewById(R.id.date);
		h_tmp = (TextView) rootview.findViewById(R.id.h_tmp);
		l_tmp = (TextView) rootview.findViewById(R.id.l_tmp);
		latitude = (TextView) rootview.findViewById(R.id.latitude);
		pinyin = (TextView) rootview.findViewById(R.id.pinyin);
		postcode = (TextView) rootview.findViewById(R.id.postcode);
		sunrise = (TextView) rootview.findViewById(R.id.sunrise);
		sunset = (TextView) rootview.findViewById(R.id.sunset);
		temp = (TextView) rootview.findViewById(R.id.temp);
		time = (TextView) rootview.findViewById(R.id.time);
		ws = (TextView) rootview.findViewById(R.id.ws);
		weather = (TextView) rootview.findViewById(R.id.weather);
		wd = (TextView) rootview.findViewById(R.id.wd);
		longitude = (TextView) rootview.findViewById(R.id.longitude);
		
	}

	@Override
	public String setTitleCity() {
		
		if(cityName!= null){
			return cityName;
		}
		return "无信息";
	}
	
}
