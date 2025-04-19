package com.authetication.services;

import com.authetication.entities.User;

public interface UserService {
	boolean usernameExists(String user);
	void addUser(User user);
	boolean validateUser(String username,String password);

}
