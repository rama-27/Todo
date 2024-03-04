package com.rama.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("rama");
		boolean isValidPassword = password.equalsIgnoreCase("raju");

		return isValidUsername && isValidPassword;
	}
}
