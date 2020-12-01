package kr.co.ikosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	
	@RequestMapping(value = "/hello")
	public String hello(Model m) {
		
		m.addAttribute("msg", "æ»≥Á«œººø‰!");
		return "hello";
		
	}

}
