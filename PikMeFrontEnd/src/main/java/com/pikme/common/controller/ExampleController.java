package com.pikme.common.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pikme.common.bean.ExampleBean;

public class ExampleController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
 
		ExampleBean obj = (ExampleBean) context.getBean("exampleBean");
		model.addAttribute("message", "Hello " + obj.getName());
		return "example";
 
	}
}

