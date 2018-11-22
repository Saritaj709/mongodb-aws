package com.capgemini.mongodb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.mongodb.model.LoginDTO;
import com.capgemini.mongodb.model.RegistrationDTO;
import com.capgemini.mongodb.model.User;
import com.capgemini.mongodb.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	//-------------Get All Users--------------------------
	
	@RequestMapping(value = "/getusers", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	//-----------------------Registration------------------------
	
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public ResponseEntity<String> registerUser(@RequestBody RegistrationDTO user){

			String response=userService.registerUser(user);

			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}
		
		 //--------------------------Login User-------------------------
		
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public ResponseEntity<String> loginUser(@RequestBody LoginDTO user, HttpServletRequest res) {
			String response=userService.loginUser(user);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
}
