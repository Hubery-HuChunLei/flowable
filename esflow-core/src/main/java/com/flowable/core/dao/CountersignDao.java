package com.flowable.core.dao;

import java.util.List;

import com.flowable.core.bean.Countersign;
import com.flowable.core.common.dao.IBaseDao;

public interface CountersignDao extends IBaseDao<Countersign> {

	public List<Countersign> findCountersign(Countersign countersign);
}
