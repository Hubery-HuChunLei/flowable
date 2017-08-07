package com.flowable.web.util;

import java.util.HashSet;
import java.util.Set;

public class LoginUser {

	private String username;
	
	private String dept;
	
	private Set<String> roles = new HashSet<String>();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
}
