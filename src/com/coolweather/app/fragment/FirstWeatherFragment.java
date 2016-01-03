package com.coolweather.app.fragment;

import com.coolweather.app.interfaces.Constant;

public class FirstWeatherFragment extends WeatherFragment {

	@Override
	public int setPositionFlag() {
		return Constant.FIRST_DAY;
	}

}
