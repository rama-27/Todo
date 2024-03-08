package com.rama.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {

	private AuthenticationService authenticateService;

	public LoginController(AuthenticationService authenticateService) {
		super();
		this.authenticateService = authenticateService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLogin() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcome(@RequestParam String username, @RequestParam String password, ModelMap model) {

		if (authenticateService.authenticate(username, password) == true) {
			model.put("password", password);
			model.put("username", username);
			return "welcome";

		}
		model.put("errormsg", "Invalid Credentials!!! ");
		return "login";
	}

}
