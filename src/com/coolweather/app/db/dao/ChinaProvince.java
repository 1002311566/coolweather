package com.coolweather.app.db.dao;

import java.util.ArrayList;

import com.coolweather.app.model.Province;

public class ChinaProvince {
	
	private String[] PROVINCE_LIST = { "山东","江苏","安徽","浙江","福建","上海","广东","广西","海南","湖北","湖南","河南","江西","北京","天津","河北","山西","内蒙古","宁夏","新疆","青海","陕西","甘肃","四川","云南","贵州","西藏","重庆","辽宁","吉林","黑龙江"};


	public void addProvince(){
		ArrayList<Province> list = new ArrayList<Province>();
		for (int i = 0; i < PROVINCE_LIST.length; i++) {
			list.add(new Province(PROVINCE_LIST[i]));
		}
		DatabaseDao.getDatabaseDao().addProvinceData(list);
	}
}
