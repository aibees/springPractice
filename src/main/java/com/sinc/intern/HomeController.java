package com.sinc.intern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/main.do")
	public String home() {
		System.out.println("main ctrl");
		return "home";
	}
	
	@RequestMapping("/interceptor.do")
	public String interceptorsample () {
		System.out.println("interceptor test");
		return null;
	}
}
