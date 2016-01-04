package com.coolweather.app.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


/**
 * 保存所有设置值
 * @author Administrator
 *
 */
public class SPUtil {
	
	public static final String NO_FIRST_SELECT = "no_first_select";
	public static String NO_FIRST_SPLASH = "no_first_splash";//是否第一次进入
	public static String MY_CITY = "my_city";//设定的默认城市
	public static String MY_CITY_ID = "my_city_id";//默认城市id
	public static String AUTOGET_FLAG = "autoget_flag";//是否是自动获取状态
	

	public static void saveConfig(String tag,Object obj){
		SharedPreferences sp = GlobalUtil.getContext().getSharedPreferences("config", Context.MODE_PRIVATE);
		Editor edit = sp.edit();
		if(obj instanceof String){
			edit.putString(tag, (String)obj);
		}else if(obj instanceof Boolean){
			edit.putBoolean(tag, (Boolean) obj);
		}else if(obj instanceof Integer){
			edit.putInt(tag, (Integer) obj);
		}
		edit.commit();
	}
	
	public static String getString(String tag){
		
		SharedPreferences sp = GlobalUtil.getContext().getSharedPreferences("config", Context.MODE_PRIVATE);
		return sp.getString(tag, null);
	}
	
	public static boolean getBoolean(String tag){
		SharedPreferences sp = GlobalUtil.getContext().getSharedPreferences("config", Context.MODE_PRIVATE);
		
		return sp.getBoolean(tag, false);
	}
	
}
