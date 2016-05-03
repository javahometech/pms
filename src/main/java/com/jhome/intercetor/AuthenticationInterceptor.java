package com.jhome.intercetor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthenticationInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object object) throws Exception {

		StringBuffer requestURL = request.getRequestURL();
		String url = requestURL.toString();

		if (url != null && url.endsWith("login.htm")) {
			return true;
		}

		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null) {
			System.out
					.println("this is preHandle() method in handler interceptor ");

			response.sendRedirect("login.htm");
			return false;

		}
		return true;
	}

}
