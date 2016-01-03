package com.coolweather.app.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


/**
 * 保存所有设置值
 * @author Administrator
 *
 */
public class SharedPreferenceUtil {

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
	
}
