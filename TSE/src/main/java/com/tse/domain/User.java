package com.tse.domain;

import com.tse.enums.Role;

//@Entity(name = "USER")
public class User {
	private String name;
	private String lastName;
	private String userName;
	private String password;
	private Role role;

	//@Column(name = "name", length = 64)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//@Column(name = "lastname", length = 64)
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//@Column(name = "username", length = 64)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//@Column(name = "password", length = 128)
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//@Column(name = "role", length = 4)
	//@Enumerated(EnumType.STRING)
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
}
