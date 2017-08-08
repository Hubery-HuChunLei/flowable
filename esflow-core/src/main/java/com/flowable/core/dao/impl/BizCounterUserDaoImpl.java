package com.flowable.core.dao.impl;

import com.flowable.core.bean.BizCounterUser;
import com.flowable.core.common.dao.BaseDaoImpl;
import com.flowable.core.common.utils.PageHelper;
import com.flowable.core.dao.BizCounterUserDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lukew
 * Date: 2017-08-08
 * Time: 11:49
 */
@Repository
public class BizCounterUserDaoImpl extends BaseDaoImpl<BizCounterUser> implements BizCounterUserDao {

    @Override
    public PageHelper<BizCounterUser> findBizCounterUser(PageHelper<BizCounterUser> page, BizCounterUser user) {

        List<Object> list = new ArrayList<Object>();
        StringBuffer hql = new StringBuffer(" from BizCounterUser b where 1=1 ");
        if(user != null){
            hql.append(" and b.bizId = ? ");
            list.add(user.getBizId());
        }
        return this.find(page,hql.toString(),list.toArray());
    }
}
