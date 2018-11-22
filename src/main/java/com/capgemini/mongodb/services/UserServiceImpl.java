package com.capgemini.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.mongodb.model.LoginDTO;
import com.capgemini.mongodb.model.RegistrationDTO;
import com.capgemini.mongodb.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		List<User> userList = userRepository.findAll();
		return userList;
	}

	@Override
	public String registerUser(RegistrationDTO registrationDto) {
		
		Optional<User> checkUser = userRepository.findByEmail(registrationDto.getEmail());

		if(checkUser.isPresent()) {
			return "User with given email is already registered";
		}
		
		if(!registrationDto.getPassword().equals(registrationDto.getConfirmPassword()))
		{
			return "both passwords should be same";
		}
		User user = new User();
		user.setEmail(registrationDto.getEmail());
		user.setFirstname(registrationDto.getFirstname());
		user.setLastname(registrationDto.getLastname());
		user.setPhoneNo(registrationDto.getPhoneNo());
		user.setPassword(registrationDto.getPassword());
	
		userRepository.save(user);
		return "user registered successfully";
	}

	@Override
	public String loginUser(LoginDTO loginDto) {

		Optional<User> checkUser = userRepository.findByEmail(loginDto.getEmail());

		if (!checkUser.isPresent()) {
			return "This Email id does not exist";
		}
		else {
			return "user successfully logged in";
		}
	}

}
