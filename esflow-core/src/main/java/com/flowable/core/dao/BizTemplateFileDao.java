package com.flowable.core.dao;

import com.flowable.core.bean.BizTemplateFile;
import com.flowable.core.common.dao.IBaseDao;
import com.flowable.core.common.utils.PageHelper;

public interface BizTemplateFileDao extends IBaseDao<BizTemplateFile>{

	public PageHelper<BizTemplateFile> findTemplateFlies(PageHelper<BizTemplateFile> page,BizTemplateFile file,boolean islike);
}
