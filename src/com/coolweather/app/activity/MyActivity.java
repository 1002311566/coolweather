package com.coolweather.app.activity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.coolweather.app.R;
import com.coolweather.app.db.dao.DatabaseDao;
import com.coolweather.app.model.City;
import com.coolweather.app.util.GlobalUtil;

public class MyActivity extends Activity {

	private TextView mTitle;
	private ExpandableListView mListView;

	private Map<String,List<City>> mList = null;
	private List<String> mProvincelist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactivity);
		initView();// 初始化
	}

	private void initView() {
		mTitle = (TextView) findViewById(R.id.title);
		mListView = (ExpandableListView) findViewById(R.id.listview);
		initProvinceData();
		Log.i("d",mList.size()+"");
		 MyAdapter myAdatper = new MyAdapter();
		 mListView.setAdapter(myAdatper);
		 
		 mListView.setOnGroupClickListener(new OnGroupClickListener() {
			
			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				mTitle.setText(mProvincelist.get(groupPosition));
				return false;
			}
		});
		 
		 mListView.setOnChildClickListener(new OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				Toast.makeText(GlobalUtil.getContext(), "子项点击", 0).show();
				return true;
			}
		});
		
	}
	
	private void initProvinceData() {
		mList = new LinkedHashMap<String, List<City>>();
		mProvincelist = DatabaseDao.getDatabaseDao().queryProvince();
		for (String str : mProvincelist) {
			ArrayList<City> arrayList = new ArrayList<City>();
			arrayList.add(new City(str,"1000","北京","beijing"));
			mList.put(str,arrayList);
		}

	}
	
	private class MyAdapter extends BaseExpandableListAdapter{

		public MyAdapter(){
			
		}
		


//		@Override
//		public View getView(int position, View convertView, ViewGroup parent) {
//			View view = null;
//			ViewHolder holder = null;
//			if(convertView == null){
//				holder = new ViewHolder();
//				view = View.inflate(GlobalUtil.getContext(), R.layout.listview_item, null);
//				holder.tv = (TextView) view.findViewById(R.id.text);
//				view.setTag(holder);
//			}else{
//				view = convertView;
//				holder = (ViewHolder) convertView.getTag();
//			}
//			holder.tv.setText(mProvinceList.get(position));
//			return view;
//		}
//		
//		class ViewHolder{
//			TextView tv;
//		}

		@Override
		public int getGroupCount() {
			return mList.size();
		}

		@Override
		public int getChildrenCount(int groupPosition) {
			return mList.get(mProvincelist.get(groupPosition)).size();
		}

		@Override
		public String getGroup(int groupPosition) {
			return mProvincelist.get(groupPosition);
		}

		@Override
		public City getChild(int groupPosition, int childPosition) {
			return mList.get(mProvincelist.get(groupPosition)).get(childPosition);
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
			if(convertView == null){
				view = View.inflate(GlobalUtil.getContext(), R.layout.listview_item_group, null);
				groupHolder = new GroupViewHolder();
				groupHolder.groupTv = (TextView) view.findViewById(R.id.text);
				view.setTag(groupHolder);
			}else{
				view = convertView;
				groupHolder = (GroupViewHolder) convertView.getTag();
			}
			groupHolder.groupTv.setText(mProvincelist.get(groupPosition));
			
			return view;
		}

		@Override
		public View getChildView(int groupPosition, int childPosition,
				boolean isLastChild, View convertView, ViewGroup parent) {
			
			View view = null;
			ChildViewHolder childHolder = null;
			if(convertView == null){
				view = View.inflate(GlobalUtil.getContext(), R.layout.listview_item_group, null);
//				childHolder = new ChildViewHolder();
//				childHolder.groupTv = (TextView) view.findViewById(R.id.text);
//				view.setTag(childHolder);
			}else{
				view = convertView;
//				groupHolder = (GroupViewHolder) convertView.getTag();
			}
			
			return view;
		}

		@Override
		public boolean isChildSelectable(int groupPosition, int childPosition) {
			return true;//实现子项点击事件
//			return false;
		}
		
		class GroupViewHolder{
			TextView groupTv;
		}
		class ChildViewHolder{
			
		}
		
	} 

	
}
