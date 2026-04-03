package com.usermanagement.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.user.entity.User;
import com.usermanagement.user.service.UserService;


@CrossOrigin("https://localhost:3000")
@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return service.getAllUser();
	}
	
	@PostMapping("/users")
	public User addusers(@RequestBody User user) {
		return service.saveUser(user);
	}
	@PutMapping("/users/{id}")
	public User updateUsers(@PathVariable Long id,@RequestBody User user) {
		return service.updateUser(id,user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		 service.deleteUser(id);
	}

}
