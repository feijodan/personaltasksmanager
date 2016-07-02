package com.daniellfeijo_renanslopes8.personaltasksmanager.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthorizerInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object controller)
				throws Exception{
		String uri = request.getRequestURI();
		if(uri.endsWith("loginForm") 
				|| uri.endsWith("makeLogin") 
				|| uri.contains("resource")){
			return true;
		}
		if(request.getSession().getAttribute("loggedUser") != null){
			return true;
		}
		response.sendRedirect("loginForm");
		return false;
	}

}
