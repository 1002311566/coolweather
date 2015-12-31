package com.coolweather.app.base;

import android.app.Application;
import android.content.Context;

public class BaseApplication extends Application {
	/**
	 * 全局Context
	 */
	private static Context context;
	
	@Override
	public void onCreate() {
		super.onCreate();
		context = getApplicationContext();
		
	}
	
	public static Context getContext(){
		return context;
	}
}
