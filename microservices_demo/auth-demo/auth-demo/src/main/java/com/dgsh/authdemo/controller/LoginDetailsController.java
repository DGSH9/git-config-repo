package com.dgsh.authdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgsh.authdemo.bean.LoginDetails;
import com.dgsh.authdemo.config.LoginConfig;

@RestController
public class LoginDetailsController {
	
	
	@Autowired
	private LoginConfig loginConfig;
	
	@GetMapping("/logindetails")
	public LoginDetails getAllLogin() {
		return new LoginDetails(loginConfig.getLoginurl(),loginConfig.getAuthurl());
	}

}
