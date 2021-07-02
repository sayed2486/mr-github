package com.ibu.springboot.web.FirstSpringBootApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ibu.springboot.web.FirstSpringBootApplication.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loggingMessage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loggingMessage(@RequestParam String name,@RequestParam String password, ModelMap model) {
		if(!loginService.isValidLogin(name, password) && false) {
			model.put("errorMsg", "Invalid Credential");
			return "login";
		}
		model.put("name", name);
				return "welcome";
	}

}
