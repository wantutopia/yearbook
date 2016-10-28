package com.yearbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String printWelcome() {
		return "/demo/main";
	}
}
