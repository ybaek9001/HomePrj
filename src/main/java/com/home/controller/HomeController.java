package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {

		model.addAttribute("msg", "Hello World");
		System.out.println("dfdasfdaffddasfdasfdasfdasfdsafdsfdas");
		return "test";
	}
}
