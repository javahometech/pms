package com.jhome.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jhome.dao.ILoginDao;
import com.jhome.pojo.User;
import com.jhome.service.ILoginService;

@Controller
@SessionAttributes(value = { "user" })
public class LoginController {
	@Autowired
	ILoginDao logindao;

	@Autowired
	ILoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	private void getLogin(@ModelAttribute("login") User user) {
System.out.println("login");
		System.out.println("this is getlogin controller method in  admin controller");

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginAuthentication(@Valid @ModelAttribute("login") User user, BindingResult result, ModelMap map) {

		if (result.hasErrors()) {
			return "login";
		}
		
		
		if (service.authenticate(user)) {
			return "home";
		} else {
			return "loginFail";
		}
	}

	// logout handler
	@RequestMapping(value = "/logout")
	private String logout() {
		System.out.println("this is logout method");
		return "logout";
	}

}
