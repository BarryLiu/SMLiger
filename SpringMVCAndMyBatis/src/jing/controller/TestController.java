package jing.controller;

import jing.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UserService service;
	 
	
}
