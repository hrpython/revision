package com.revision.revision.model;

import java.util.Date;


public class User {
	
	private Integer id;
	private String name;
	private String firstName;
	private String email;
	private Date birthDate;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String firstName, String email, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.birthDate = birthDate;
		
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate=birthDate;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
