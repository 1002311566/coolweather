package com.coolweather.app.model;

public class Province {
	private int id;
	private String province_name;
	public Province(String province_name) {
		this.province_name = province_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", province_name=" + province_name + "]";
	}
	
}
