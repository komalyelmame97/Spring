package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/")
	public String helloWord() {
		return "My first Spring Program.";
	}
	
	@GetMapping("/komal")
	public String display()
	{
		return "I am komal.";
	}
}
