package com.coolweather.app.db.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.coolweather.app.db.DatabaseHelper;
import com.coolweather.app.interfaces.Constant;
import com.coolweather.app.model.City;
import com.coolweather.app.model.Province;
import com.coolweather.app.util.LogUtils;


/**
 * 数据库操作类
 * @author Administrator
 *
 */
public class DatabaseDao {
	
	private static DatabaseHelper dbHelper = null;
	private static DatabaseDao dao = null;
	public static String[] PROVINCE_LIST = { "山东","江苏","安徽","浙江","福建","上海","广东","广西","海南","湖北","湖南","河南","江西","北京","天津","河北","山西","内蒙古","宁夏","新疆","青海","陕西","甘肃","四川","云南","贵州","西藏","重庆","辽宁","吉林","黑龙江"};

	public static List<Province> list;
	
	static{
		dbHelper = new DatabaseHelper();
		list = new ArrayList<Province>();
		for (int i = 0; i < PROVINCE_LIST.length; i++) {
			list.add(new Province(PROVINCE_LIST[i]));
		}
		DatabaseDao dao2 = new DatabaseDao();
		
		dao2.addProvinceData(list);
		
	}
	
	
	private DatabaseDao(){
	}
	
	public static DatabaseDao getDatabaseDao(){
		if(dao == null){
			dao = new DatabaseDao();
		}
		return dao;
	}
	
		
	
	/**
	 * 添加省份数据
	 */
	public void addProvinceData(List<Province> datas){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		ContentValues values = new ContentValues();
		//将所有省份数据添加进去
		for(Province province:datas){
			values.put("province_name", province.getProvince_name());
			db.insert(Constant.TABLE_PROVINCE, null, values);
		}
		db.close();
	}
	
	/**
	 * 添加城市数据
	 */
	public void addCityData(List<City> datas){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		ContentValues values = new ContentValues();
		//将所有城市数据添加进去
		for(City city:datas){
			values.put("province_cn", city.getProvince_cn());
			values.put("district_cn", city.getDistrict_cn());
			values.put("city_id", city.getCity_id());
			values.put("city_name_cn", city.getCity_name_cn());
			values.put("city_name_en", city.getCity_name_en());
			db.insert(Constant.TABLE_CITY, null, values);
			LogUtils.d("database", "添加----"+city.getCity_name_cn()+"----到数据库成功");
		}
		LogUtils.d("database", "添加完成");
		db.close();
	}
	
	/**
	 * 查询省份
	 */
	public List<String> queryProvince(){
		SQLiteDatabase db = dbHelper.getReadableDatabase();
//		Cursor cursor = db.query(Constant.TABLE_PROVINCE, new String[]{"province_name"}, null,null,null,null,null);
//		Cursor cursor = db.rawQuery("select ? from Province", new String[]{"province_name"});
		Cursor cursor = db.rawQuery("select * from Province",null);
		List<String> list = new ArrayList<String>();
		while (cursor.moveToNext()) {
			String name = cursor.getString(cursor
					.getColumnIndex("province_name"));
			list.add(name);
		}
		cursor.close();
		db.close();
		return list;
	}
	
	/**
	 * 查询城市,根据省份名查询所有城市
	 */
	public Map<String,String> queryCity(String province_name){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		Cursor cursor = db.rawQuery("select city_name_cn,city_id from City where province_cn=? ", new String[]{province_name});
		Map<String,String> map = new LinkedHashMap<String, String>();
		while(cursor.moveToNext()){
			String cityName = cursor.getString(cursor.getColumnIndex("city_name_cn"));
			String cityId = cursor.getString(cursor.getColumnIndex("city_id"));
			map.put(cityName, cityId);
		}
		db.close();
		cursor.close();
		return map;
	}
	
}
