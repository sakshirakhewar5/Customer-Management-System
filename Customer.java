package com.SunBaseData.SunBaseDataAssesment.POJO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	private String firstname;
	private String lastname;
	private String street;
	private String address;
	private String city;
	private String state;
	@Id
	private String email;
	private String phone;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstname, String lastname, String street, String address, String city, String state,
			String email, String phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phone = phone;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Cutomer [firstname=" + firstname + ", lastname=" + lastname + ", street=" + street + ", address="
				+ address + ", city=" + city + ", state=" + state + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
