package com.devcamp.pizza365.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.devcamp.pizza365.model.CUser;
import com.devcamp.pizza365.repository.IUserRepository;

@CrossOrigin
@RestController
@RequestMapping("/")
public class CUserController {
	
	@Autowired
	IUserRepository pUserRepository;
	
	@GetMapping("/users")
	public ResponseEntity<List<CUser>> getUser(){
		try {
			List<CUser> pUsers = new ArrayList<CUser>();
			
			pUserRepository.findAll().forEach(pUsers::add);
			
			return new ResponseEntity<>(pUsers, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/user")
	public ResponseEntity<CUser> getUser(@RequestParam(value = "username") String username){
		try {			
			CUser cUser = pUserRepository.findByUsername(username);
			return new ResponseEntity<>(cUser, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/useremail")
	public ResponseEntity<CUser> getUserByEmail(@RequestParam(value = "email") String email){
		try {			
			CUser cUser = pUserRepository.findByEmail(email);
			return new ResponseEntity<>(cUser, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
