package com.flowable.core.dao;

import java.util.List;

import com.flowable.core.bean.ActBizInfoDelayTime;
import com.flowable.core.common.dao.IBaseDao;

public interface ActBizInfoDelayTimeDao extends IBaseDao<ActBizInfoDelayTime>{

	public ActBizInfoDelayTime findActBizInfoByBizId(String bizId,String taskName);

	public List<ActBizInfoDelayTime> findActBizInfoDelayTime(ActBizInfoDelayTime delayTime);

}
