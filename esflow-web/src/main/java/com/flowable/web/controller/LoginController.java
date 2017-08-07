package com.flowable.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flowable.core.util.WebUtil;
import com.flowable.sso.entity.SystemUser;
import com.flowable.sso.service.ISystemUserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private ISystemUserService systemUserService;

	@RequestMapping("index")
	public String index(HttpServletRequest request, HttpServletResponse response) {

		return "/shiro/login";
	}

	@RequestMapping("login")
	public String login(HttpServletRequest request, HttpServletResponse response,@RequestParam Map<String, Object> params) {

		logger.info("params : " + params);
		List<SystemUser> list = this.systemUserService.findbyParam(params, false);
		HttpSession session = request.getSession();
		if (CollectionUtils.isNotEmpty(list)) {
			session.setAttribute(WebUtil.LOGIN_USER, list.get(0));
			WebUtil.getLoginUser(request, response);
			try {
				response.sendRedirect((String) session.getAttribute(WebUtil.URL));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			params.put("LOGIN_MSG", "用户名或密码错误!");
		}
		return "/shiro/login";
	}

	@ResponseBody
	@RequestMapping(value = "ajaxLogin", method = RequestMethod.POST)
	public Map<String, Object> submitLogin(String username, String password) {

		return new HashMap<String, Object>();
	}
}
