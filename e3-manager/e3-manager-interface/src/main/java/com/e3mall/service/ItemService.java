package com.e3mall.service;

import com.e3mall.pojo.TbItem;
import com.e3mall.utils.EasyUIDataGridResult;

public interface ItemService {
	public TbItem queryTbItemById(Long id);
	
	public EasyUIDataGridResult getPage(int page,int rows);
}
