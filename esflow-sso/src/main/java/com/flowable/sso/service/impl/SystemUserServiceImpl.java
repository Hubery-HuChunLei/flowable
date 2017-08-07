package com.flowable.sso.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowable.core.common.service.BaseServiceImpl;
import com.flowable.sso.dao.ISystemUserDao;
import com.flowable.sso.entity.SystemUser;
import com.flowable.sso.service.ISystemUserService;

@Service
public class SystemUserServiceImpl extends BaseServiceImpl<SystemUser> implements ISystemUserService{

	@Autowired
	private ISystemUserDao systemUserDaoImpl;
	
	@Override
	public SystemUser getUserByUsername(String username) {
		
		if(StringUtils.isNotBlank(username)){
			systemUserDaoImpl.getUserByUsername(username);
		}
		return null;
	}
}
