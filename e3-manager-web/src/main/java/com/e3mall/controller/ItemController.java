package com.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemService;
import com.e3mall.utils.EasyUIDataGridResult;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/tbItem/{itemId}")
	@ResponseBody
	public TbItem queryTbItemById(@PathVariable Long itemId){
		TbItem item = itemService.queryTbItemById(itemId);
		return item;
		
	}
	
	@ResponseBody
	@RequestMapping("/item/list")
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		EasyUIDataGridResult result = itemService.getPage(page, rows);
		return result;
	}
}
