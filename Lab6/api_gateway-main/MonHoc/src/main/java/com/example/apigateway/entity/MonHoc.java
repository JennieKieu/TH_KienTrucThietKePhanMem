package com.example.apigateway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "MonHoc")
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Column(name = "ten_mon")
    private String tenMon;
    
    @Column(name = "so_luong")
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
