package com.mvc.upgrade.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("[Interceptor] : preHandle");
		//ds에서 c로 넘어가는 사이에서 interceptor가 작동
		
		//spring3.2 이상 부터는 servlet-context.xml에서 <exclude-mapping-path>를 설정 가능
		if(request.getRequestURI().contains("/loginform.do")||
			request.getRequestURI().contains("/ajaxlogin.do")||
			request.getSession().getAttribute("login")!= null
			) {
			return true;
		}
		//로그인 안되어있으면 로그인하라고 보냄
		if(request.getSession().getAttribute("login")== null) {
			response.sendRedirect("loginform.do");
		}
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("[Interceptor] : postHandle");
		
		if(modelAndView != null) {
			logger.info("target View : " +modelAndView.getViewName());
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("[Interceptor] : afterCompletion");
	}

}
