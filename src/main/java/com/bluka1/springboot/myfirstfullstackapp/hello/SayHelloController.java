package com.bluka1.springboot.myfirstfullstackapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>My fullstack app</title></head><body><h1>Hello</h1><p>It is fun making a web apps</p></body></html>");
		return sb.toString();
	}
	
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
