package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Userss {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private String email;
	private String mobileNo;
	
	public Userss(int id, String name, String city, String email, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
	
	
	public Userss() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	@Override
	public String toString() {
		return "Userss [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", mobileNo=" + mobileNo
				+ "]";
	}
	
	

}
