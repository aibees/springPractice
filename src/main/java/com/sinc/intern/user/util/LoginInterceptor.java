package com.sinc.intern.user.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("login interceptor");
		ModelMap model = modelAndView.getModelMap();

		Object obj = model.get("loginUserModel");
		System.out.println(obj);
		if(obj != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", obj);
			
			Object destUrl = session.getAttribute("dest");
			String direction = (destUrl != null ? (String)destUrl : "/main.do");
			System.out.println("direction : " + direction);
			response.sendRedirect(direction);
		}
	}
}
