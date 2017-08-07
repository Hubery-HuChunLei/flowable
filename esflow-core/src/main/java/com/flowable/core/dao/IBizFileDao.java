package com.flowable.core.dao;

import java.util.List;
import java.util.Map;

import com.flowable.core.bean.BizFile;
import com.flowable.core.common.dao.IBaseDao;

public interface IBizFileDao extends IBaseDao<BizFile> {

	public List<BizFile> loadBizFileByBizId(String bizId, String taskId);
	
	public List<BizFile> findBizFile(Map<String,String> params);
}
