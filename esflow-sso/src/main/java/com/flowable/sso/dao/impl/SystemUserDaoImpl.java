package com.flowable.sso.dao.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;

import com.flowable.core.common.dao.BaseDaoImpl;
import com.flowable.sso.dao.ISystemUserDao;
import com.flowable.sso.entity.SystemUser;

@Repository
public class SystemUserDaoImpl extends BaseDaoImpl<SystemUser> implements ISystemUserDao{

	@Override
	public SystemUser getUserByUsername(String username) {
		
		try {
			String hql = "from SystemUser where username = ? ";
			List<SystemUser> list = this.find(hql,new Object[]{username});
			if(CollectionUtils.isNotEmpty(list))
				return list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
