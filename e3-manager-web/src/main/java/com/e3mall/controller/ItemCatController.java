package com.e3mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3mall.service.ItemCatService;
import com.e3mall.utils.EasyUITreeNode;

@Controller
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;
	
	@ResponseBody
	@RequestMapping("/item/cat/list")
	private List<EasyUITreeNode> getItemCatList(@RequestParam(name="id",defaultValue="0") Long parentId){
		return itemCatService.queryTree(parentId);
	}
}
