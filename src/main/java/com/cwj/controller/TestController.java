package com.cwj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cwj.inter.DemoService;

@Controller
public class TestController {
	@Autowired
	private DemoService demoService;

	@RequestMapping("test")
	public String test(String name,HttpServletRequest request){
		System.out.println("MVC WELCOME");
		System.out.println(demoService.sayHello(name));
		request.setAttribute("hello",demoService.sayHello(name));
		return "test";
	}
	
}
