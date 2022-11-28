package com.example.demo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
	
	@NotNull
	@Size(min=4)
	private String id;
	@NotNull
	@Size(min=8)
	private String password;
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
