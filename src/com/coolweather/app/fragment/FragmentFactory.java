package com.coolweather.app.fragment;

import java.util.LinkedHashMap;
import java.util.Map;

import android.support.v4.app.Fragment;

import com.coolweather.app.base.BaseFragment;
import com.coolweather.app.interfaces.Constant;

/**
 * 生产Fragment实例工厂
 * @author Administrator
 *
 */
public class FragmentFactory {

	private static  Map<Integer, BaseFragment> fragments = new LinkedHashMap<Integer, BaseFragment>();
	
	
	public static Fragment getFragment(int position){
		
		BaseFragment fragment = fragments.get(position);
		if(fragment==null){
			switch (position) {
			case Constant.NOW_DAY:
				fragment = new NowWeatherFragment();
				fragments.put(Constant.NOW_DAY, fragment);
				break;
			case Constant.FIRST_DAY:
				fragment = new FirstWeatherFragment();
				fragments.put(Constant.FIRST_DAY, fragment);
				break;
			case Constant.SECOND_DAY:
				fragment = new SecondWeatherFragment();
				fragments.put(Constant.SECOND_DAY, fragment);
				break;
			case Constant.THIRD_DAY:
				fragment = new ThirdWeatherFragment();
				fragments.put(Constant.THIRD_DAY, fragment);
				break;
			case Constant.FOURTH_DAY:
				fragment = new FourthWeatherFragment();
				fragments.put(Constant.FOURTH_DAY, fragment);
				break;

			default:
				break;
			}
		}
		
		return fragment;
	}
	
}
