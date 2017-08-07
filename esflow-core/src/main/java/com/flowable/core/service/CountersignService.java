package com.flowable.core.service;

import java.util.List;

import com.flowable.core.bean.Countersign;
import com.flowable.core.common.service.IBaseService;

public interface CountersignService extends IBaseService<Countersign> {

	public List<Countersign> findCountersign(Countersign countersign);
}
