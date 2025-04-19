package com.authetication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authetication.entities.User;
import com.authetication.repository.UserRepository;


@Service
public class UserServiceImplementation implements UserService {

	
	@Autowired
	UserRepository repo;
	
	@Override
	public boolean usernameExists(String username) {
		User user=repo.findByUsername(username);
		if(user!=null) {
			return true;
		}
		return false;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}
	@Override
	public boolean validateUser(String username,String password) {
		if(usernameExists(username)) {
			User user=repo.findByUsername(username);
			String dbPass=user.getPassword();
			if(password.equals(dbPass)) 
				return true;
			else 
				return false;
		}
		return false;
		
	}

}
