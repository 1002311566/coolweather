package com.coolweather.app.db.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.coolweather.app.db.DatabaseHelper;
import com.coolweather.app.interfaces.Constant;
import com.coolweather.app.model.City;
import com.coolweather.app.model.Province;


/**
 * 数据库操作类
 * @author Administrator
 *
 */
public class DatabaseDao {
	
	private static DatabaseHelper dbHelper = null;
	private static DatabaseDao dao = null;
	private DatabaseDao(){
	}
	
	public static DatabaseDao getDatabaseDao(){
		if(dao == null){
			dao = new DatabaseDao();
			dbHelper = new DatabaseHelper();
			new ChinaProvince().addProvince();//初始化省份列表
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
			values.put("Province_cn", city.getProvince_cn());
			values.put("City_id", city.getCity_id());
			values.put("City_name_cn", city.getCity_name_cn());
			values.put("City_name_en", city.getCity_name_en());
			db.insert(Constant.TABLE_PROVINCE, null, values);
		}
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
	public Cursor queryCity(String province_name){
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		Cursor cursor = db.query(Constant.TABLE_CITY, new String[]{"City_name_cn"}, "province_name =?", new String[]{province_name}	, null, null, null);
		db.close();
		return cursor;
	}
	
}