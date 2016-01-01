package com.coolweather.app.model;

public class City {

	private int id;
	private String province_cn;//所属省份
	private String district_cn;//所属城市
	private String city_id;//城市id
	private String city_name_cn;//城市名字中文
	private String city_name_en;//城市名字拼音
	public City(String province_cn, String district_cn, String city_id,
			String city_name_cn, String city_name_en) {
		super();
		this.province_cn = province_cn;
		this.district_cn = district_cn;
		this.city_id = city_id;
		this.city_name_cn = city_name_cn;
		this.city_name_en = city_name_en;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince_cn() {
		return province_cn;
	}
	public void setProvince_cn(String province_cn) {
		this.province_cn = province_cn;
	}
	public String getDistrict_cn() {
		return district_cn;
	}
	public void setDistrict_cn(String district_cn) {
		this.district_cn = district_cn;
	}
	public String getCity_id() {
		return city_id;
	}
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
	public String getCity_name_cn() {
		return city_name_cn;
	}
	public void setCity_name_cn(String city_name_cn) {
		this.city_name_cn = city_name_cn;
	}
	public String getCity_name_en() {
		return city_name_en;
	}
	public void setCity_name_en(String city_name_en) {
		this.city_name_en = city_name_en;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", province_cn=" + province_cn
				+ ", district_cn=" + district_cn + ", city_id=" + city_id
				+ ", city_name_cn=" + city_name_cn + ", city_name_en="
				+ city_name_en + "]";
	}
	
	
	
	
	
}
