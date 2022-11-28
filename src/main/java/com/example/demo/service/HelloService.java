package com.example.demo.service;

import com.example.demo.model.HelloInput;
import com.example.demo.model.HelloOutput;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public HelloOutput execute(HelloInput input) {
		HelloOutput helloOutput = new HelloOutput();
		helloOutput.setMessage(input.getmessage());
		return helloOutput;
	}

}
