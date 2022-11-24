package com.example.demo.service;

import com.example.demo.model.HelloInput;
import com.example.demo.model.HelloOutput;

public class HelloService {

	public HelloOutput execute(HelloInput input) {
		HelloOutput helloOutput = new HelloOutput();
		helloOutput.setMessage(input.getmessage());
		return helloOutput;
	}

}
