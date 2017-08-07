package com.flowable.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.flowable.core.common.utils.LoginUser;
import com.flowable.core.util.WebUtil;

public class LoginFilter implements Filter{
	
	private Logger logger = Logger.getLogger(this.getClass());

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		logger.info("loginFilter init -------------------");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
		
		logger.info("loginFilter doFilter -------------------");
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		LoginUser loginUser = (LoginUser)httpRequest.getSession().getAttribute(WebUtil.LOGIN_USER);
		if(loginUser == null){
			httpRequest.getRequestDispatcher("/WEB-INF/views/modules/login/login.jsp").forward(httpRequest, response);
		}
		httpRequest.getSession().setAttribute(WebUtil.LOGIN_USER, loginUser);
		String userPath = httpRequest.getServletPath();
		httpRequest.getSession().setAttribute(WebUtil.URL, userPath);
		chain.doFilter(httpRequest, response);
	}

	@Override
	public void destroy() {
		logger.info("loginFilter destroy -------------------");
	}
}
