package com.example.demo.controller;

import com.example.demo.model.HelloInput;
import com.example.demo.model.HelloOutput;
import com.example.demo.service.HelloService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("hello/*")
@Controller
public class HelloController extends AbstractController{
	@GetMapping("world")
	public String open(Model model) {
		HelloService helloService = new HelloService();
		HelloInput input = new HelloInput();
		input.setmessage("初期メッセージ");
		HelloOutput output = helloService.execute(input);
		model.addAttribute("value", output.getMessage());
		return "hello";
	}
}
