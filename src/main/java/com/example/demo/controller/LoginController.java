package com.example.demo.controller;

import com.example.demo.model.LoginForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login/*")
@Controller
public class LoginController extends AbstractController {
	
	@GetMapping("/index")
	public String login(Model model) {
		model.addAttribute("loginForm", new LoginForm());
		return "login";
	}
}
