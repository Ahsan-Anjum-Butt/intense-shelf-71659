package com.example;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {
	String userID;
	@NotNull
	String name;
	@NotNull
	String gender;
	@NotNull
	String DOB;
	@NotNull
	@Min(100000)
	Integer CNIC;
	@NotNull
	String address;
	@NotNull
	String contactNo;
	@NotNull
	String username;
	@NotNull
	String password;
	String dpURL;
	String role;
	String rating;
	boolean idSet, noneSet;

	public User() {
		noneSet = true;
		idSet = false;
	}

	public User(String name, String gender, String dOB, Integer cNIC, String address, String contactNo, String username,
			String password,
			String dpURL, String role, String rating) {
		super();
		noneSet = idSet = false;
		this.name = name;
		this.gender = gender;
		DOB = dOB;
		CNIC = cNIC;
		this.address = address;
		this.contactNo = contactNo;
		this.username = username;
		this.password = password;
		this.dpURL = dpURL;
		this.role = role;
		this.rating = rating;
	}

	public User(String userID, String name, String gender, String dOB, Integer cNIC, String address, String contactNo,
			String username,
			String password, String dpURL, String role, String rating) {
		super();
		noneSet = idSet = true;
		this.userID = userID;
		this.name = name;
		this.gender = gender;
		DOB = dOB;
		CNIC = cNIC;
		this.address = address;
		this.contactNo = contactNo;
		this.username = username;
		this.password = password;
		this.dpURL = dpURL;
		this.role = role;
		this.rating = rating;
	}

	public boolean isIdSet() {
		return idSet;
	}

	public void setIdSet(boolean idSet) {
		this.idSet = idSet;
	}

	public boolean isNoneSet() {
		return noneSet;
	}

	public void setNoneSet(boolean noneSet) {
		this.noneSet = noneSet;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public Integer getCNIC() {
		return CNIC;
	}

	public void setCNIC(Integer cNIC) {
		CNIC = cNIC;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDpURL() {
		return dpURL;
	}

	public void setDpURL(String dpURL) {
		this.dpURL = dpURL;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
