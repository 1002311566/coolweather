package com.coolweather.app.fragment;

import com.coolweather.app.interfaces.Constant;

public class NowWeatherFragment extends WeatherFragment {

	@Override
	public int setPositionFlag() {
		return Constant.NOW_DAY;
	}

}
