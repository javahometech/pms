package com.jhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContrloller {
	@RequestMapping(value = "/home")
	public void home() {
	}

	@RequestMapping(value = "/aboutUs")
	public void aboutUs() {
		System.out.println("this is aboutUs method ");

	}
}
