package com.ibu.springboot.web.FirstSpringBootApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ibu.springboot.web.FirstSpringBootApplication.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value = "/getTodoList", method =  RequestMethod.GET)
	public String getToLilst(ModelMap modelMap) {
		String name = (String) modelMap.get("name");
		modelMap.put("todoList", todoService.retrieveTodos(name));
		return "todo";
	}

}
 