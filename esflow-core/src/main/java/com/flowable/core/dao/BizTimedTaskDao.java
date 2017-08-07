package com.flowable.core.dao;

import java.util.List;

import com.flowable.core.bean.BizTimedTask;
import com.flowable.core.common.dao.IBaseDao;

public interface BizTimedTaskDao extends IBaseDao<BizTimedTask>{

	public List<BizTimedTask> findBizTimedTask(BizTimedTask bizTask);

	void deleteTimedTask(String id);
}
