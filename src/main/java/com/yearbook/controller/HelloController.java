package com.yearbook.controller;

import com.yearbook.model.testBed.TestBed;
import com.yearbook.service.testBed.TestBedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Properties;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	@Qualifier(value="commonConfig")
	Properties commonConfig;

	@Autowired
	TestBedService testBedService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", commonConfig.getProperty("hello"));
		List<TestBed> testBedList =  testBedService.selectTestBedAll();
		model.addAttribute("testBedList", testBedList.get(0).getContent());
		return "hello";
	}
}