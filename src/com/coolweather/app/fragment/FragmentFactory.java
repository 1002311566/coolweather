package com.coolweather.app.fragment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.coolweather.app.base.BaseFragment;

import android.support.v4.app.Fragment;

/**
 * 生产Fragment实例工厂
 * @author Administrator
 *
 */
public class FragmentFactory {

	private static  Map<Integer, BaseFragment> fragments = new LinkedHashMap<Integer, BaseFragment>();
	private static final int NOW_DAY = 0;
	private static final int FIRST_DAY = 1;
	private static final int SECOND_DAY = 2;
	private static final int THIRD_DAY = 3;
	private static final int FOURTH_DAY = 4;
	
	public static Fragment getFragment(int position){
		
		BaseFragment fragment = fragments.get(position);
		if(fragment==null){
			switch (position) {
			case NOW_DAY:
				fragment = new WeatherFragment();
				fragments.put(NOW_DAY, fragment);
				break;
			case FIRST_DAY:
				fragment = new WeatherFragment();
				fragments.put(NOW_DAY, fragment);
				break;
			case SECOND_DAY:
				fragment = new WeatherFragment();
				fragments.put(NOW_DAY, fragment);
				break;
			case THIRD_DAY:
				fragment = new WeatherFragment();
				fragments.put(NOW_DAY, fragment);
				break;
			case FOURTH_DAY:
				fragment = new WeatherFragment();
				fragments.put(NOW_DAY, fragment);
				break;

			default:
				break;
			}
		}
		
		return fragment;
	}
	
}
