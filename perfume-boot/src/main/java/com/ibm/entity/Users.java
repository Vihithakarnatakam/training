package com.ibm.entity;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {//give trigger of sku from products table 
	@Id @GeneratedValue @Column(name="user_id")
	private int userId;
	
	//each user can give MORE THAN 1 reviews
	@OneToMany(mappedBy = "users") //on line "12" in orderItem java program
	private List<Review> revUid;
	
	//each user is associated with many orderItems
	@OneToMany(mappedBy = "users") //on line "12" in orderItem java program
	private List<OrderItem> itemUid;
	
	@Column(length=30)
	private String fullName;
	
	@Column(length=30)
	private String emailId;
	
	@Column(length=30)
	private int phoneNo;
	
	@Column(length=30)
	private String lineOne;
	
	@Column(length=30)
	private String lineTwo;
	
	@Column(length=30)
	private String city;
	
	@Column(length=30)
	private String state;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Review> getRevUid() {
		return revUid;
	}

	public void setRevUid(List<Review> revUid) {
		this.revUid = revUid;
	}

	public List<OrderItem> getItemUid() {
		return itemUid;
	}

	public void setItemUid(List<OrderItem> itemUid) {
		this.itemUid = itemUid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getLineOne() {
		return lineOne;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public String getLineTwo() {
		return lineTwo;
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
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
	
	
}
	
	
