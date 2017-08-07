package com.flowable.core.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.flowable.core.common.utils.PageHelper;

public interface RoleService{

	public List<Map<String,Object>> getRoleRootNodes(Map<String,String> params) ;

	public List<Map<String,Object>> getRootRole()  ;
	
	public PageHelper<Map<String, Object>> loadUsersByRole(PageHelper<Map<String, Object>> page,List<String> roles);
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	public Map<String, String> loadUsersByUserName(String userName);

	public List<Map<String, String>> findUsersByFullname(String fullname);

	public Set<String> getUserRolesByUserName(String username);
	
	/**
	 * 带缓存 根据用户名查询用户账号查询中文名
	 * @param taskAssignee
	 * @param userCache
	 * @return
	 */
	public String getFullNameByUserName(String taskAssignee,Map<String, Map<String, String>> userCache);
	
	
	/**
	 * 人员查询  用户名  角色
	 * @param page
	 * @param params
	 * @return
	 */
	public PageHelper<Map<String, Object>> findUsers(PageHelper<Map<String, Object>> page, Map<String, String> params);
}
