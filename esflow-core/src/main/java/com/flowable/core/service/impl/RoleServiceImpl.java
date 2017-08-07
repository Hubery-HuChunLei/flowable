package com.flowable.core.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;
import com.flowable.core.common.utils.PageHelper;
import com.flowable.core.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Override
	public List<Map<String, Object>> getRoleRootNodes(Map<String, String> params) {
		return null;
	}

	@Override
	public List<Map<String, Object>> getRootRole() {
		return null;
	}

	@Override
	public PageHelper<Map<String, Object>> loadUsersByRole(PageHelper<Map<String, Object>> page, List<String> roles) {
		return null;
	}

	@Override
	public Map<String, String> loadUsersByUserName(String userName) {
		return null;
	}

	@Override
	public List<Map<String, String>> findUsersByFullname(String fullname) {
		return null;
	}

	@Override
	public Set<String> getUserRolesByUserName(String username) {
		return null;
	}

	@Override
	public String getFullNameByUserName(String taskAssignee, Map<String, Map<String, String>> userCache) {
		return null;
	}

	@Override
	public PageHelper<Map<String, Object>> findUsers(PageHelper<Map<String, Object>> page, Map<String, String> params) {
		return null;
	}
}
