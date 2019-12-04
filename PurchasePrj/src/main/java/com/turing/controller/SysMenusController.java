package com.turing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turing.TreeUtil;
import com.turing.entity.SysMenus;
import com.turing.mapper.SysMenusMapper;

@Controller
public class SysMenusController {
	
	@Autowired
	private SysMenusMapper mapper;
	
    //创建树形菜单 获取所有菜单信息(json集合格式数据)
	@GetMapping("/menus")
	@ResponseBody
	public List<SysMenus> findAll(){
		//1,查询所有的菜单信息
		List<SysMenus> allList = mapper.selectByExample(null);
		List<SysMenus> parents = TreeUtil.findParent(allList);
		return parents;
	}

	

}
