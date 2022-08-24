package com.training.springboot.lab4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.lab4.models.User;
import com.training.springboot.lab4.services.UserDAOService;

@RestController
public class UserController {
	
	@Autowired
	private UserDAOService userDAOService;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
//		System.out.println("Get API");
		return userDAOService.findAll();
	}
		
//		
//	}
////	@GetMapping("/users/{id}")
//	public void getUserById() {
//		System.out.println("Post API");
//		
//	}
	@PostMapping("/users")
	public void createUser() {
		System.out.println("Post API");
		
	
	}
	@PutMapping("/users")
	public void updateUser() {
		System.out.println("Update API");
		
	}
	@DeleteMapping("/users")
	public void deleteUser() {
		
		System.out.println("Delete API");
		
		
	}
	

}
