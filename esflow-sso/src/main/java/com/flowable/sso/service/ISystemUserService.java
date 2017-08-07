package com.flowable.sso.service;

import com.flowable.core.common.service.IBaseService;
import com.flowable.sso.entity.SystemUser;

public interface ISystemUserService  extends IBaseService<SystemUser>{

	public SystemUser getUserByUsername(String username);
}
