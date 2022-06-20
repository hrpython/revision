package com.revision.revision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revision.revision.model.HelloworldBean;
import com.revision.revision.model.User;
import com.revision.revision.service.UserComponentService;

@RestController
public class HelloworldController {
	
	 @Autowired
	 UserComponentService userComponentService;
	 
	@GetMapping("/")
	public String affiche() {
		return "Helloworld";
	}
	@GetMapping("/helloworldBean")
	public HelloworldBean helloworldBean() {
		return new HelloworldBean("HelloWorld");
	}
	
	@GetMapping("/helloworldBean/{name}")
	public HelloworldBean helloworldBeanPathVariable(@PathVariable String name) {
		return new HelloworldBean(String.format("HelloWorld,%s",name));
	}
	@GetMapping("/users")
	public List<User> retourUser(){
		return userComponentService.retourListUser();
	}
	@PostMapping("/user")
	public User save (@RequestBody User user){
		userComponentService.saveUser(user);
		return user;
	}

}
