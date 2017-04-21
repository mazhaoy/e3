package com.e3mall.service;

import java.util.List;

import com.e3mall.utils.EasyUITreeNode;

public interface ItemCatService {

	public List<EasyUITreeNode> queryTree(long parentId);
}
