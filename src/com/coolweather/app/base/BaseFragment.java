package com.coolweather.app.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.coolweather.app.R;
import com.coolweather.app.activity.MyActivity;
import com.coolweather.app.activity.WeatherActivity;


public abstract class BaseFragment extends Fragment {

	private View rootView;
	private TextView title_selectTv;
	private TextView title_dateTv;
	private TextView title_weekTv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			rootView = inflater.inflate(setLayout(), null);
			title_selectTv = (TextView) rootView.findViewById(R.id.select_city);
			title_dateTv = (TextView) rootView.findViewById(R.id.title_date);
			title_weekTv = (TextView) rootView.findViewById(R.id.title_week);
			initView();
			initData();
			
			//选择城市点击事件
			title_selectTv.setOnClickListener(new SelectListener());
		return rootView;
	}
	
	private class SelectListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			WeatherActivity activity = (WeatherActivity) getActivity();
			Intent intent = new Intent(activity,MyActivity.class);
			activity.startActivity(intent);
		}
		
	}
	
	
//	public abstract String setTitleDate();
//	
//	public abstract String setTitleWeek();
	
	/**
	 * 初始化视图
	 */
	public abstract void initView();
	/**
	 * 初始化数据
	 */
	public abstract void initData();

	/**
	 * 布局id
	 */
	public abstract int setLayout();
	
	protected View getRootView(){
		
		return rootView;
	}
}
