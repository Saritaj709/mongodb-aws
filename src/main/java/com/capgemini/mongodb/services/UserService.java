package com.capgemini.mongodb.services;

import java.util.List;

import com.capgemini.mongodb.model.LoginDTO;
import com.capgemini.mongodb.model.RegistrationDTO;
import com.capgemini.mongodb.model.User;

public interface UserService {

	public List<User> getAllUsers();
	public String registerUser(RegistrationDTO registrationDto);
	public String loginUser(LoginDTO loginDto);
}
