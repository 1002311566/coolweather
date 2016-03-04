package com.coolweather.app.activity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.coolweather.app.R;
import com.coolweather.app.db.dao.DatabaseDao;
import com.coolweather.app.model.WeatherForecastInfo;
import com.coolweather.app.util.GetCityUtil;
import com.coolweather.app.util.GetWeatherUtil;
import com.coolweather.app.util.GlobalUtil;
import com.coolweather.app.util.LogUtils;
import com.coolweather.app.util.SPUtil;

public class MyActivity extends Activity {

	private TextView mTitle;// 标题
	private ExpandableListView mListView;// 叠加ListView

	private List<String> mProvinceList;// 存放省份名
	private Map<String, List<String>> mCityNameMap;
	private Map<String, Map<String, String>> mAllCityMap;// 存放所有省份和城市对应关系
	private MyAdapter myAdatper;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.myactivity);
		initView();// 初始化
	}

	private void initView() {
		mTitle = (TextView) findViewById(R.id.title);
		mListView = (ExpandableListView) findViewById(R.id.listview);
		if(mProvinceList==null){
			mProvinceList = DatabaseDao.getDatabaseDao().queryProvince();
		}
		mAllCityMap = new LinkedHashMap<String, Map<String, String>>();
		mCityNameMap = new LinkedHashMap<String, List<String>>();
		for (String province_name : mProvinceList) {
			Map<String, String> cityMap = GetCityUtil
					.getCityData(province_name);// 获取城市城市数据
			// 将省份和相对的城市装入Map集合
			ArrayList<String> cityNameList = new ArrayList<String>(
					cityMap.keySet());
			mCityNameMap.put(province_name, cityNameList);
			// 将对应城市添加到对应省份
			mAllCityMap.put(province_name, cityMap);
		}
		myAdatper = new MyAdapter();
		mListView.setAdapter(myAdatper);

		// 设置组项点击事件
		mListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				mTitle.setText(mProvinceList.get(groupPosition));
				if (mAllCityMap == null) {
					return true;
				}
				return false;
			}
		});

		// 设置子项点击事件
		mListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// 取出map集合中的键装入list集合
				ArrayList<String> list = new ArrayList<String>(mAllCityMap.get(
						mProvinceList.get(groupPosition)).keySet());
				final String cityname = list.get(childPosition);
				final String cityid = mAllCityMap.get(
						mProvinceList.get(groupPosition)).get(cityname);
				Toast.makeText(GlobalUtil.getContext(), cityname, 0).show();
				mTitle.setText(cityname);
				mListView.setEnabled(false);
				if(!SPUtil.getBoolean(SPUtil.NO_FIRST_SELECT)){
					SPUtil.saveConfig(SPUtil.MY_CITY, cityname);
					SPUtil.saveConfig(SPUtil.MY_CITY_ID, cityid);
					SPUtil.saveConfig(SPUtil.NO_FIRST_SELECT, true);
					SPUtil.saveConfig(SPUtil.NO_FIRST_SPLASH, true);
				}
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						Intent intent = new Intent(MyActivity.this,
								WeatherActivity.class);
						WeatherForecastInfo	weatherFroecastInfo = GetWeatherUtil.requestCityWeatherForecast(cityname, cityid);
						intent.putExtra("weatherFroecastInfo", weatherFroecastInfo);
						MyActivity.this.startActivity(intent);
						MyActivity.this.finish();
					}
				}).start();
				return true;
			}
		});

		// 设置单组展开模式
		mListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
				for (int i = 0; i < myAdatper.getGroupCount(); i++) {
					// 关闭非当前展开项
					if (groupPosition != i) {
						mListView.collapseGroup(i);// 当不是当前展开项时关闭
					}
				}
			}
		});

	}

	/**
	 * 适配器
	 * 
	 * @author Administrator
	 * 
	 */
	private class MyAdapter extends BaseExpandableListAdapter {

		public MyAdapter() {

		}

		@Override
		public int getGroupCount() {
			return mProvinceList.size();
		}

		@Override
		public int getChildrenCount(int groupPosition) {
			// 子类长度
			return mCityNameMap.get(mProvinceList.get(groupPosition)).size();
		}

		@Override
		public String getGroup(int groupPosition) {
			return mProvinceList.get(groupPosition);
		}

		@Override
		public String getChild(int groupPosition, int childPosition) {
			// 子类城市名
			String cityName = mCityNameMap
					.get(mProvinceList.get(groupPosition)).get(childPosition);
			return cityName;
		}

		@Override
		public long getGroupId(int groupPosition) {
			return groupPosition;
		}

		@Override
		public long getChildId(int groupPosition, int childPosition) {
			return childPosition;
		}

		@Override
		public boolean hasStableIds() {
			return false;
		}

		@Override
		public View getGroupView(int groupPosition, boolean isExpanded,
				View convertView, ViewGroup parent) {

			View view = null;
			GroupViewHolder groupHolder = null;
			if (convertView == null) {
				view = View.inflate(GlobalUtil.getContext(),
						R.layout.listview_item_group, null);
				groupHolder = new GroupViewHolder();
				groupHolder.groupTv = (TextView) view.findViewById(R.id.text);
				view.setTag(groupHolder);
			} else {
				view = convertView;
				groupHolder = (GroupViewHolder) convertView.getTag();
			}
			groupHolder.groupTv.setText(mProvinceList.get(groupPosition));

			return view;
		}

		@Override
		public View getChildView(int groupPosition, int childPosition,
				boolean isLastChild, View convertView, ViewGroup parent) {

			View view = null;
			ChildViewHolder childHolder = null;
			if (convertView == null) {
				view = View.inflate(GlobalUtil.getContext(),
						R.layout.listview_item_child, null);
				childHolder = new ChildViewHolder();
				childHolder.childTv = (TextView) view.findViewById(R.id.text);
				view.setTag(childHolder);
			} else {
				view = convertView;
				childHolder = (ChildViewHolder) convertView.getTag();
			}
			String cityName = mCityNameMap
					.get(mProvinceList.get(groupPosition)).get(childPosition);
			childHolder.childTv.setText(cityName);
			return view;
		}

		@Override
		public boolean isChildSelectable(int groupPosition, int childPosition) {
			return true;// 实现子项点击事件
			// return false;
		}

		class GroupViewHolder {
			TextView groupTv;
		}

		class ChildViewHolder {
			TextView childTv;
		}
		
		

	}
	
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if(SPUtil.getString(SPUtil.MY_CITY) == null|| SPUtil.getString(SPUtil.MY_CITY_ID)==null){
			SPUtil.saveConfig(SPUtil.NO_FIRST_SPLASH, false);//当用户没有保存城市时，仍然加载该页面
		}
	}

}
