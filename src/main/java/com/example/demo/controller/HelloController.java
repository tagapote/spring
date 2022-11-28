package com.example.demo.controller;

import javax.validation.Valid;

import com.example.demo.model.HelloInput;
import com.example.demo.model.HelloOutput;
import com.example.demo.model.LoginForm;
import com.example.demo.service.HelloService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("hello/*")
@Controller
public class HelloController extends AbstractController{
	
	HelloService helloService;
	
	HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	/**
	 * Get用メソッド
	 * 
	 * @param model
	 * @return hello.html
	 */
	@GetMapping("world")
	public String getOpen(Model model) {
		HelloInput input = new HelloInput();
		input.setmessage("初期メッセージ");
		HelloOutput output = helloService.execute(input);
		model.addAttribute("value", output.getMessage());
		
		// 仮実装
		LoginForm loginForm = new LoginForm();
		loginForm.setId("111");
		loginForm.setPassword("pass");
		model.addAttribute("loginForm", loginForm);
		return "hello";
	}
	
	/**
	 * Post用メソッド
	 * 
	 * @param loginForm
	 * @return hello.html
	 */
	@PostMapping("world")
	public String postOpen(@Valid @ModelAttribute LoginForm loginForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			System.out.println("☆error☆");
			return "login";
		}
		System.out.println("☆correct☆");
//		HelloService helloService = new HelloService();
//		HelloInput input = new HelloInput();
//		input.setmessage("初期メッセージ");
//		HelloOutput output = helloService.execute(input);
//		model.addAttribute("value", output.getMessage());
		return "hello";
	}
}
