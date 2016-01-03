package com.coolweather.app.fragment;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.coolweather.app.R;
import com.coolweather.app.activity.WeatherActivity;
import com.coolweather.app.base.BaseFragment;
import com.coolweather.app.interfaces.Constant;
import com.coolweather.app.model.WeatherForecastInfo;
import com.coolweather.app.model.WeatherInfo;

public abstract class WeatherFragment extends BaseFragment {

	private TextView city;
	private TextView cityid;
	private TextView date;
	private TextView week;
	private TextView curTemp;
	private TextView aqi;
	private TextView fengxiang;
	private TextView fengli;
	private TextView hightemp;
	private TextView lowtemp;
	private TextView type;

	private LinearLayout todayInfoLy;
	private LinearLayout todayInfo1;
	private TextView today_index3_chuanyi;//穿衣指数
	private TextView today_index3_fangshai;
	private TextView today_index3_ganmao;
	private TextView today_index3_yundong;
	private TextView today_index3_liangshai;
	private TextView today_index3_xiche;
	

	// private String cityName;
	/*
	 * 从子类中获取到位置标记
	 */
	public abstract int setPositionFlag();

	@Override
	public void initView() {
		View rootView = getRootView();
		city = (TextView) rootView.findViewById(R.id.title_cityname);
		cityid = (TextView) rootView.findViewById(R.id.cityid);
		date = (TextView) rootView.findViewById(R.id.title_date);
		week = (TextView) rootView.findViewById(R.id.title_week);
		curTemp = (TextView) rootView.findViewById(R.id.curtemp);
		aqi = (TextView) rootView.findViewById(R.id.api);
		fengxiang = (TextView) rootView.findViewById(R.id.fengxiang);
		fengli = (TextView) rootView.findViewById(R.id.fengli);
		hightemp = (TextView) rootView.findViewById(R.id.hightemp);
		lowtemp = (TextView) rootView.findViewById(R.id.lowtemp);
		type = (TextView) rootView.findViewById(R.id.type);
		todayInfoLy = (LinearLayout) rootView.findViewById(R.id.todayinfo);
		todayInfo1 = (LinearLayout) rootView.findViewById(R.id.today_info1);
		today_index3_chuanyi = (TextView) rootView.findViewById(R.id.today_index3_chuanyi);
		today_index3_xiche = (TextView) rootView.findViewById(R.id.today_index3_xiche);
		today_index3_fangshai = (TextView) rootView.findViewById(R.id.today_index3_fangshai);
		today_index3_liangshai = (TextView) rootView.findViewById(R.id.today_index3_liangshai);
		today_index3_yundong = (TextView) rootView.findViewById(R.id.today_index3_yundong);
		today_index3_ganmao = (TextView) rootView.findViewById(R.id.today_index3_ganmao);
	
		
	
	}

	@Override
	public void initData() {
		WeatherActivity activity = (WeatherActivity) getActivity();
		Intent intent = activity.getIntent();
		WeatherForecastInfo weatherFroecastInfo = (WeatherForecastInfo) intent
				.getSerializableExtra("weatherFroecastInfo");
		// 根据位置标记设置相应数据
		int flag = setPositionFlag();
		// 设置共有数据
		city.setText(weatherFroecastInfo.getCity());// 设置城市名
		cityid.setText(weatherFroecastInfo.getCityId());// 设置城市id
		switch (flag) {
		case Constant.NOW_DAY:// 设置当天天气
			// 显示生活指数项
			todayInfoLy.setVisibility(View.VISIBLE);
			todayInfo1.setVisibility(View.VISIBLE);
			String[] s = { weatherFroecastInfo.getToday_date(),
					weatherFroecastInfo.getToday_week(),
					weatherFroecastInfo.getToday_curTemp(),
					weatherFroecastInfo.getToday_aqi(),
					weatherFroecastInfo.getToday_fengxiang(),
					weatherFroecastInfo.getToday_fengli(),
					weatherFroecastInfo.getToday_hightemp(),
					weatherFroecastInfo.getToday_lowtemp(),
					weatherFroecastInfo.getToday_type(),
					weatherFroecastInfo.getToday_index_3_details(),
					weatherFroecastInfo.getToday_index_1_details(),
					weatherFroecastInfo.getToday_index_2_details(),
					weatherFroecastInfo.getToday_index_4_details(),
					weatherFroecastInfo.getToday_index_5_details(),
					weatherFroecastInfo.getToday_index_6_details(),
					};
			date.setText(s[0]);
			week.setText(s[1]);
			curTemp.setText(s[2]);
			aqi.setText(s[3].equals("null")?"----":s[3]);
			fengxiang.setText(s[4]);
			fengli.setText(s[5]);
			hightemp.setText(s[6]);
			lowtemp.setText(s[7]);
			type.setText(s[8]);
			// 以下设置生活指数
			today_index3_chuanyi.setText(s[9]);
			today_index3_ganmao.setText(s[10]);
			today_index3_fangshai.setText(s[11]);
			today_index3_yundong.setText(s[12]);
			today_index3_xiche.setText(s[13]);
			today_index3_liangshai.setText(s[14]);

			break;
		case Constant.FIRST_DAY:// 设置未来第一天天气
			todayInfoLy.setVisibility(View.GONE);
			todayInfo1.setVisibility(View.GONE);
			String[] s1 = { weatherFroecastInfo.getForecast_1_date(),
					weatherFroecastInfo.getForecast_1_week(),
					weatherFroecastInfo.getForecast_1_fengxiang(),
					weatherFroecastInfo.getForecast_1_fengli(),
					weatherFroecastInfo.getForecast_1_hightemp(),
					weatherFroecastInfo.getForecast_1_lowtemp(),
					weatherFroecastInfo.getForecast_1_type() };
			date.setText(s1[0]);
			week.setText(s1[1]);
			fengxiang.setText(s1[2]);
			fengli.setText(s1[3]);
			hightemp.setText(s1[4]);
			lowtemp.setText(s1[5]);
			type.setText(s1[6]);

			break;
		case Constant.SECOND_DAY:// 设置未来第二天天气
			todayInfoLy.setVisibility(View.GONE);
			todayInfo1.setVisibility(View.GONE);
			String[] s2 = { weatherFroecastInfo.getForecast_2_date(),
					weatherFroecastInfo.getForecast_2_week(),
					weatherFroecastInfo.getForecast_2_fengxiang(),
					weatherFroecastInfo.getForecast_2_fengli(),
					weatherFroecastInfo.getForecast_2_hightemp(),
					weatherFroecastInfo.getForecast_2_lowtemp(),
					weatherFroecastInfo.getForecast_2_type() };
			date.setText(s2[0]);
			week.setText(s2[1]);
			fengxiang.setText(s2[2]);
			fengli.setText(s2[3]);
			hightemp.setText(s2[4]);
			lowtemp.setText(s2[5]);
			type.setText(s2[6]);

			break;
		case Constant.THIRD_DAY:// 设置未来第三天天气
			todayInfoLy.setVisibility(View.GONE);
			todayInfo1.setVisibility(View.GONE);
			String[] s3 = { weatherFroecastInfo.getForecast_3_date(),
					weatherFroecastInfo.getForecast_3_week(),
					weatherFroecastInfo.getForecast_3_fengxiang(),
					weatherFroecastInfo.getForecast_3_fengli(),
					weatherFroecastInfo.getForecast_3_hightemp(),
					weatherFroecastInfo.getForecast_3_lowtemp(),
					weatherFroecastInfo.getForecast_3_type() };
			date.setText(s3[0]);
			week.setText(s3[1]);
			fengxiang.setText(s3[2]);
			fengli.setText(s3[3]);
			hightemp.setText(s3[4]);
			lowtemp.setText(s3[5]);
			type.setText(s3[6]);

			break;
		case Constant.FOURTH_DAY:// 设置未来第四天天气
			todayInfoLy.setVisibility(View.GONE);
			todayInfo1.setVisibility(View.GONE);
			String[] s4 = { weatherFroecastInfo.getForecast_4_date(),
					weatherFroecastInfo.getForecast_4_week(),
					weatherFroecastInfo.getForecast_4_fengxiang(),
					weatherFroecastInfo.getForecast_4_fengli(),
					weatherFroecastInfo.getForecast_4_hightemp(),
					weatherFroecastInfo.getForecast_4_lowtemp(),
					weatherFroecastInfo.getForecast_4_type() };
			date.setText(s4[0]);
			week.setText(s4[1]);
			fengxiang.setText(s4[2]);
			fengli.setText(s4[3]);
			hightemp.setText(s4[4]);
			lowtemp.setText(s4[5]);
			type.setText(s4[6]);

			break;
		default:

			break;

		}
	}

	@Override
	public int setLayout() {
		return R.layout.fragment_weather;
	}

}
