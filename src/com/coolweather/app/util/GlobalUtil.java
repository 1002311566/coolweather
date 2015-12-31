package com.coolweather.app.util;

import android.content.Context;

import com.coolweather.app.base.BaseApplication;

/**
 * 全局工具类
 * @author Administrator
 *
 */
public class GlobalUtil {

	public static Context getContext(){
		return BaseApplication.getContext();
	}
}
