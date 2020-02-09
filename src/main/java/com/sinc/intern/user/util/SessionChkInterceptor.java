package com.sinc.intern.user.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionChkInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser") == null) {
			System.out.println("session is null");
			
			// LOGIN으로 다시 돌려 보내지만, 로그인 후 지금 있는 페이지로 다시 돌아올 수 있도록 작업해준다.
			String uri = request.getRequestURI();
			String query = request.getQueryString();
			String path = uri;
			
			if(request.getMethod().equalsIgnoreCase("get")) {
				path = uri + "?" + query;
			}
			
			session.setAttribute("dest", path);
			
			response.sendRedirect("/loginForm.do");
			return false;
		}
		
		return true;
	}
}
