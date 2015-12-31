package com.coolweather.app.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.coolweather.app.interfaces.Constant;
import com.coolweather.app.util.GlobalUtil;

public class DatabaseHelper extends SQLiteOpenHelper {

	private static final String WEATHER_INFO_DATABASE_NAME = "CoolWeather.db";// 数据库名			id integer primary key autoincrement,name text,price real
	private static final String CREATE_PROVINCE_TABLE = "create table "+Constant.TABLE_PROVINCE+" (id integer primary key autoincrement,province_name text)";// 创建省份表
	private static final String CREATE_CITY_TABLE = "create table "+Constant.TABLE_CITY+" (id integer primary key autoincrement,province_cn text,city_id text,city_name_cn text,city_name_en text)";// 创建城市表

	public DatabaseHelper() {
		super(GlobalUtil.getContext(), WEATHER_INFO_DATABASE_NAME, null,
				Constant.DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE_TABLE);// 创建省份表
		db.execSQL(CREATE_CITY_TABLE);// 创建城市表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		// 更新

	}

}
