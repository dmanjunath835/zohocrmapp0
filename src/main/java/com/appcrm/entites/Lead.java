package com.appcrm.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Lead extends AbstractClass {
	@Column(name="first_name",nullable = false)
	private String firstName;
	@Column(name="last_name",nullable = false)
	private String lastName;
	@Column(name="email",nullable = false)
	private String email;
	@Column(name="mobile",nullable = false)
	private long mobile;
	@Column(name="mobile",nullable = false)
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
}
