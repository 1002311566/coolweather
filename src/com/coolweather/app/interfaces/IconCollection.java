package com.coolweather.app.interfaces;

import java.util.Map;

import java.util.LinkedHashMap;

import com.coolweather.app.R;

public class IconCollection {
	public static Map<String,Integer> iconMap;
	static {
		String[] iconType ={"晴","多云","阴","阵雨","雷阵雨","雷阵雨伴有冰雹","雨夹雪","小雨","中雨",
							"大雨","暴雨","大暴雨","特大暴雨","阵雪","小雪","中雪","大雪","暴雪","雾",
							"冻雨","沙尘暴","小到中雨","中到大雨","大到暴雨","暴雨到大暴雨","大暴雨到特大暴雨",
							"小到中雪","中到大雪","大到暴雪","浮尘","扬沙","强沙尘暴","霾","无"};
		int[] iconId = {R.drawable.icon00,
						R.drawable.icon01,
						R.drawable.icon02,
						R.drawable.icon03,
						R.drawable.icon04,
						R.drawable.icon05,
						R.drawable.icon06,
						R.drawable.icon07,
						R.drawable.icon08,
						R.drawable.icon09,
						R.drawable.icon10,
						R.drawable.icon11,
						R.drawable.icon12,
						R.drawable.icon13,
						R.drawable.icon14,
						R.drawable.icon15,
						R.drawable.icon16,
						R.drawable.icon17,
						R.drawable.icon18,
						R.drawable.icon19,
						R.drawable.icon20,
						R.drawable.icon21,
						R.drawable.icon22,
						R.drawable.icon23,
						R.drawable.icon24,
						R.drawable.icon25,
						R.drawable.icon26,
						R.drawable.icon27,
						R.drawable.icon28,
						R.drawable.icon29,
						R.drawable.icon30,
						R.drawable.icon31,
						R.drawable.icon53,
						R.drawable.icon99};
		iconMap = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < iconId.length; i++) {
			
			iconMap.put(iconType[i],iconId[i]);
		}
	}
}
