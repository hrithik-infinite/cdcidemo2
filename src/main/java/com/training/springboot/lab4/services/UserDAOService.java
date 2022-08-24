package com.training.springboot.lab4.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.springboot.lab4.models.User;


@Service
public class UserDAOService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Hrithik", "Hritik@gnail.com", new Date()));
		users.add(new User(2,"Agarwal", "Agarwal@gnail.com", new Date()));
		users.add(new User(3,"abc", "abc@gnail.com", new Date()));
		users.add(new User(4,"def", "def@gnail.com", new Date()));
		users.add(new User(5,"ghi", "ghi@gnail.com", new Date()));
		users.add(new User(6,"jkl", "jkl@gnail.com", new Date()));
		
	}
	
	public List<User> findAll(){
		
		return users;
		
	}

}
