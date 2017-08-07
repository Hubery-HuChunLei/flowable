package com.flowable.core.dao;

import com.flowable.core.bean.BizCounterUser;
import com.flowable.core.common.dao.IBaseDao;
import com.flowable.core.common.utils.PageHelper;

/**
 * 
 * 2016年8月23日
 * @author lukw 
 * 下午8:01:21
 * com.eastcom.esflow.dao
 * @email lukw@eastcom-sw.com
 */
public interface BizCounterUserDao extends IBaseDao<BizCounterUser>{

	public PageHelper<BizCounterUser> findBizCounterUser(PageHelper<BizCounterUser> page, BizCounterUser user);

}
