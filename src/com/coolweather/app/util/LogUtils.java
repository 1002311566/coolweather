package com.coolweather.app.util;

import android.util.Log;
/**
 * LogUtils工具类
 * @author Administrator
 *
 */
public class LogUtils {
	public static final int VERBOSE = 1;
	public static final int DEBUT = 2;
	public static final int INFO = 3;
	public static final int WARN = 4;
	public static final int ERROR = 5;
	public static final int NOTHING = 6;
	public static final int LEVEL = NOTHING;
	
	public static void v(String tag, String msg){
		if(LEVEL<=VERBOSE){
			Log.v(tag,msg);
		}
	}
	
	public static void d(String tag, String msg){
		if(LEVEL<=DEBUT){
			Log.d(tag,msg);
		}
	}
	
	public static void i(String tag, String msg){
		if(LEVEL<=INFO){
			Log.i(tag,msg);
		}
	}
	
	public static void w(String tag, String msg){
		if(LEVEL<=WARN){
			Log.w(tag,msg);
		}
	}
	
	public static void e(String tag, String msg){
		if(LEVEL<=ERROR){
			Log.e(tag,msg);
		}
	}
	
	
	
}
