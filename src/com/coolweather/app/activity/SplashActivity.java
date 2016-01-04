package com.coolweather.app.activity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Event;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.coolweather.app.R;
import com.coolweather.app.db.dao.DatabaseDao;
import com.coolweather.app.model.WeatherForecastInfo;
import com.coolweather.app.util.GetCityUtil;
import com.coolweather.app.util.GetWeatherUtil;
import com.coolweather.app.util.SPUtil;

public class SplashActivity extends Activity {

	private TextView select;
	private List<String> mProvinceList;// 存放省份名
	private RelativeLayout rl;// 布局
	private RelativeLayout mLoad;
	private Map<String,Map<String,String>> mAllCityMap;//存放所有省份和城市对应关系
	private Map<String,List<String>> mCityNameMap;//存放城市
	private boolean initOk = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
		
		if(SPUtil.getBoolean(SPUtil.NO_FIRST_SPLASH)){//不是第一次进入
			final String cityName = SPUtil.getString(SPUtil.MY_CITY);
			final String cityId = SPUtil.getString(SPUtil.MY_CITY_ID);
			SPUtil.saveConfig(SPUtil.AUTOGET_FLAG, true);//设置自动加载
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					
					if(SPUtil.getBoolean(SPUtil.AUTOGET_FLAG)){
						WeatherForecastInfo	weatherFroecastInfo = GetWeatherUtil.requestCityWeatherForecast(cityName, cityId);
						Intent intent = new Intent(SplashActivity.this,WeatherActivity.class);
						intent.putExtra("weatherFroecastInfo", weatherFroecastInfo);
						SplashActivity.this.startActivity(intent);
						SplashActivity.this.finish();
						}
				}
			}).start();
		}
		
		SPUtil.saveConfig(SPUtil.NO_FIRST_SPLASH, true);//第一次进入后，改变状态为非第一次
		
		select = (TextView) findViewById(R.id.button1);
		mLoad =  (RelativeLayout) findViewById(R.id.load);

		mLoad.setVisibility(View.VISIBLE);

		initProvinceData();// 初始化省份数据

		//初始化城市信息
		new Thread(new Runnable() {

			@Override
			public void run() {
				// 获取所有城市
				mAllCityMap = new LinkedHashMap<String, Map<String, String>>();
				mCityNameMap = new LinkedHashMap<String, List<String>>();
				for (String province_name : mProvinceList) {
					Map<String, String> cityMap = GetCityUtil
							.getCityData(province_name);// 获取城市城市数据
					// 将省份和相对的城市装入Map集合
					ArrayList<String> cityNameList = new ArrayList<String>(
							cityMap.keySet());
					mCityNameMap.put(province_name, cityNameList);
					// 将对应城市添加到对应省份
					mAllCityMap.put(province_name, cityMap);
				}
				/**
				 * 更新UI
				 */
				SplashActivity.this.runOnUiThread(new Runnable() {

					@Override
					public void run() {
						mLoad.setVisibility(View.GONE);//隐藏加载圈
						select.setVisibility(View.VISIBLE);//显示选择按钮
						initOk = true;
					}
				});
			}
		}).start();

		select.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SplashActivity.this,
						MyActivity.class);
				
				startActivity(intent);
				finish();

			}
		});
	}

	/**
	 * 初始化省份数据
	 */
	private void initProvinceData() {
		mProvinceList = DatabaseDao.getDatabaseDao().queryProvince();
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if(SPUtil.getString(SPUtil.MY_CITY) == null|| SPUtil.getString(SPUtil.MY_CITY_ID)==null){
			SPUtil.saveConfig(SPUtil.NO_FIRST_SPLASH, false);//当用户没有保存城市时，仍然加载该页面
		}
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_BACK:
			if(initOk){
				SplashActivity.this.finish();
			}else{
				Toast.makeText(this, "正在初始化数据，请稍后退出...", 0).show();
			}
			
			break;

		default:
			break;
		}
		return true;
	}
}
