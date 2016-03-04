package com.coolweather.app.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

import com.coolweather.app.R;
import com.coolweather.app.activity.MyActivity;




public class HttpUtil {
	
	
	public static String httpGet(String httpUrl,String httpArg){
		
		String result = null;
		BufferedReader reader= null;
		StringBuffer stringBuffer = new StringBuffer();
		httpUrl = httpUrl +"?"+ httpArg;
		
		try {
			URL url = new URL(httpUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("apikey", "ad6a79c95aa698b83c2e62fd73854fb1");
			conn.connect();
			InputStream is = conn.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			String strRead = null;
			while((strRead = reader.readLine())!=null){
				stringBuffer.append(strRead);
				stringBuffer.append("\r\n");
			}
			reader.close();
			result = stringBuffer.toString();
		} catch (Exception e) {
				
					Builder builder = new AlertDialog.Builder(GlobalUtil.getContext());
					builder.setTitle("错误").setIcon(R.drawable.net_errer).setMessage("加载失败").setCancelable(false).setPositiveButton("返回", new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
						}
					}).create().show();
			e.printStackTrace();
		}
		
	
		return result;
	}
}
