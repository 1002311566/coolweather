package com.coolweather.app.activity;

import java.io.Serializable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.coolweather.app.R;
import com.coolweather.app.model.WeatherInfo;

public class WeatherActivity extends Activity {

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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weather);
		init();
		Intent intent = getIntent();
		WeatherInfo weatherInfo = (WeatherInfo) intent.getSerializableExtra("WEATHER");
		city.setText(weatherInfo.getCity());
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

	private void init() {
	altitude = (TextView) findViewById(R.id.altitude);
	city = (TextView) findViewById(R.id.city);
	citycode = (TextView) findViewById(R.id.citycode);
	date = (TextView) findViewById(R.id.date);
	h_tmp = (TextView) findViewById(R.id.h_tmp);
	l_tmp = (TextView) findViewById(R.id.l_tmp);
	latitude = (TextView) findViewById(R.id.latitude);
	pinyin = (TextView) findViewById(R.id.pinyin);
	postcode = (TextView) findViewById(R.id.postcode);
	sunrise = (TextView) findViewById(R.id.sunrise);
	sunset = (TextView) findViewById(R.id.sunset);
	temp = (TextView) findViewById(R.id.temp);
	time = (TextView) findViewById(R.id.time);
	ws = (TextView) findViewById(R.id.ws);
	weather = (TextView) findViewById(R.id.weather);
	wd = (TextView) findViewById(R.id.wd);
	longitude = (TextView) findViewById(R.id.longitude);
	}

}
