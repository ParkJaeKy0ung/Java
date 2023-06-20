package com.kh.test.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

import com.kh.test.user.model.service.UserService;

@RequestMapping("seachUser")
@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String selectUser(@ModelAttribute Model model, userId) {
		
		List<String> list = new List();
		
		String searchUser = service.select(userId);
		
		String path;
		
		if(searchUser != null) {
			model.addAttribute(searchUser);
			path += "searchSuccess"; 
					
		}else {
			path += "seacchFail";
		}
		
		return path;
	}
}