package com.flowable.sso.dao;

import com.flowable.core.common.dao.IBaseDao;
import com.flowable.sso.entity.SystemUser;

public interface ISystemUserDao extends IBaseDao<SystemUser>{

	public SystemUser getUserByUsername(String username);
}
