package com.sagarkirtakar.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagarkirtakar.entity.User;

@RestController
@RequestMapping("/myController")
public class MyController {

	private Map<Integer, User> map = new HashMap<>();
	
	@GetMapping
	public List<User> getAllUser() {
		return new ArrayList<>(map.values());
	}
	
	@PostMapping
	public String addUserDetails(@RequestBody User user) {
		
		map.put(user.getId(), user);
		
		return "Data Insert Succsessfully...";
	}
	
	@GetMapping("id/{myId}")
	public User getUserById(@PathVariable int myId) {
		return map.get(myId);
	}
	
	@DeleteMapping("id/{myId}")
	public String deleteUserById(@PathVariable int myId) {
		map.remove(myId);
		return "User Deleted Successfully..!";
	}
	
	@PutMapping("id/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User user) {
		map.put(id, user);
		return "User updated successfully..!";
	}
	
}
