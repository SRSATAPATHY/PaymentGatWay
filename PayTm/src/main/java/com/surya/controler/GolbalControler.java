package com.surya.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GolbalControler {
	@RequestMapping(value="/")
	public String global() {
		System.out.println("enter");
		return "index";
		
	}

}
