package com.flowable.web.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flowable.core.common.utils.DataGrid;
import com.flowable.core.common.utils.Json;
import com.flowable.core.common.utils.PageHelper;
import com.flowable.core.service.IBizHandleService;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/bizHandle")
public class BizHandleController{

	private Logger logger = Logger.getLogger("bizHandle");
	
	@Autowired
	private IBizHandleService bizHandleService;
	
	/**
	 * 部门列表
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "/loadSectors")
	@ResponseBody
	public Json loadSectors(@RequestParam Map<String,Object> params){
		Json res = new Json();
		res.setSuccess(false);
		try {
			List<Map<String,Object>> list =  bizHandleService.loadSectors(params);
			if(list !=null && list.size()>0){
				res.setObj(list);
			}
			res.setSuccess(true);
			
		} catch (Exception e) {
			res.setMsg(e.getLocalizedMessage());
		}
		return res;
	}
}
