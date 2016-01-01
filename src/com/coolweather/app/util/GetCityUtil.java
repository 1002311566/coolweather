package com.coolweather.app.util;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import android.util.Log;

import com.coolweather.app.db.dao.DatabaseDao;
import com.coolweather.app.interfaces.Constant;
import com.coolweather.app.model.City;

public class GetCityUtil {

	/**
	 * 查询规则：先从数据库查询，若没有数据则从网络加载并保存到数据库
	 * 
	 * @param province_cn
	 * @return
	 */

	private static List<String> cityList;// 存放城市名集合

	public static List<String> getCityData(String province_cn) {
		cityList = new ArrayList<String>();
		cityList.clear();// 清空集合
		// 先从数据库查询
		queryDatabase(province_cn);
		if (cityList.isEmpty()) {
			LogUtils.d("database", "从网络获取");
			// 从网络查询
			queryNet(province_cn);
			// 保存到数据库
				// saveDatabase();
		}

		return cityList;

	}

	/**
	 * 查询网络数据
	 */
	private static void queryNet(String province_cn) {
		List<City> list = new ArrayList<City>();
		
		String json = HttpUtil.httpGet(Constant.httpUrl, "cityname="
				+ URLEncoder.encode(province_cn));
		
		try {
		// Gson gson = new Gson();
		// gson.fromJson(json, City.class);
		LogUtils.d("json", json);
		// 解析json数据
			JSONObject jsonObj = new JSONObject(json);
			JSONArray ratData = jsonObj.getJSONArray("retData");
			for (int i = 0; i < ratData.length(); i++) {
				JSONObject cityInfo = ratData.getJSONObject(i);
				/**
				 * "area_id": "101200101",
				 * "district_cn": "武汉", 
				 * "name_cn": "武汉",
				 * "name_en": "wuhan", 
				 * "province_cn": "湖北"
				 */
				String area_id = cityInfo.getString("area_id");
				String district_cn = cityInfo.getString("district_cn");
				String name_cn = cityInfo.getString("name_cn");
				String name_en = cityInfo.getString("name_en");
				String province_cn1 = cityInfo.getString("province_cn");
				cityList.add(name_cn);
				LogUtils.d("cityList", cityList.get(i));
				//添加城市到集合，用于存储到数据库
				list.add(new City(province_cn1, district_cn, area_id, name_cn, name_en));
			}
			//添加到数据库
			DatabaseDao dao = DatabaseDao.getDatabaseDao();
			dao.addCityData(list);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询数据库
	 */
	private static void queryDatabase(String province_cn) {
		DatabaseDao dao = DatabaseDao.getDatabaseDao();
		cityList = dao.queryCity(province_cn);
		for (String city : cityList) {
			LogUtils.d("database", city);
			
		}
	}
}
