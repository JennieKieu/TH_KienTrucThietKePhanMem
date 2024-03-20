package com.example.apigateway.entity;


public class MonHoc {

    private String id;

    private String tenMon;

    private int SoLuong;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public MonHoc(String id, String tenMon, int soLuong) {
		super();
		this.id = id;
		this.tenMon = tenMon;
		SoLuong = soLuong;
	}

	public MonHoc() {
		super();
	}

	@Override
	public String toString() {
		return "MonHoc [id=" + id + ", tenMon=" + tenMon + ", SoLuong=" + SoLuong + "]";
	}

}
