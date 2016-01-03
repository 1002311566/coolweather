package com.coolweather.app.fragment;

import com.coolweather.app.interfaces.Constant;

public class SecondWeatherFragment extends WeatherFragment {

	@Override
	public int setPositionFlag() {
		return Constant.SECOND_DAY;
	}

}
