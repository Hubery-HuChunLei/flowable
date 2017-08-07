package com.flowable.core.dao;

import java.util.Map;

import com.flowable.core.bean.BizSystemUserConf;
import com.flowable.core.common.dao.IBaseDao;
import com.flowable.core.common.utils.PageHelper;

public interface BizSystemUserConfDao extends IBaseDao<BizSystemUserConf> {

	public PageHelper<Map<String,String>> findBizSystemUserConf(PageHelper<Map<String,String>>  page, Map<String,String> params);
}
