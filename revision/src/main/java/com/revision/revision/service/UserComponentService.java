package com.revision.revision.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.revision.revision.model.User;

@Component
public class UserComponentService {
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1,"Smith","Paul","treop@mail.com",new Date()));
		users.add(new User(2,"Sweetie","Paulqon","atreop@mail.com",new Date()));
		users.add(new User(3,"Romeo","Pauleo","btreop@mail.com",new Date()));
		users.add(new User(4,"turner","Jean","dtreop@mail.com",new Date()));
	}
	public List<User> retourListUser(){
		return users;
	}
	public User saveUser(User user) {
		if (user.getId()==null) {
			user.setId(users.size()+1);
		}
		users.add(user);
		return user;
	}

}
