package com.dgsh.authdemo.bean;

public class LoginDetails {
	
	private String loginUrl;
	private String authUrl;
	
	
	public LoginDetails() {

	}
	
	
	
	public LoginDetails(String loginUrl, String authUrl) {
		super();
		this.loginUrl = loginUrl;
		this.authUrl = authUrl;
	}
	public String getLoginUrl() {
		return loginUrl;
	}
	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}
	public String getAuthUrl() {
		return authUrl;
	}
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	
	
	
}
