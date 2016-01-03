package com.coolweather.app.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.coolweather.app.R;
import com.coolweather.app.fragment.FragmentFactory;

public class WeatherActivity extends FragmentActivity {
	
	private ViewPager viewPager;

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_weather);
		init();
		
		
		MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(adapter);

	}
	
	private class MyPagerAdapter extends FragmentPagerAdapter{

		public MyPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			return FragmentFactory.getFragment(position);
		}

		@Override
		public int getCount() {
			return 5;
		}
	}

		

	private void init() {
		viewPager = (ViewPager) findViewById(R.id.viewpager);
	
	}

}
