package com.ibu.springboot.web.FirstSpringBootApplication.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean isValidLogin(String name, String password) {
		return name.equalsIgnoreCase("meeram") && password.equals("dummy");
	}

}
