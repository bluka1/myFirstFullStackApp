package com.bluka1.springboot.myfirstfullstackapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("Luka");
		boolean isValidPassword = password.equalsIgnoreCase("asdfgh");
		return isValidUserName && isValidPassword;
	}
}