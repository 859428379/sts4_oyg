package com.turing;

import java.util.ArrayList;
import java.util.List;

import com.turing.entity.SysMenus;

public class TreeUtil {
	
	//寻找所有一级菜单
	public static List<SysMenus> findParent(List<SysMenus> allList){
		List<SysMenus> parents=new ArrayList<>();
		for(SysMenus menu:allList) {
			//判断是否是一级菜单
			if(menu.getParentId()==0) {
				//寻找一级菜单下的子节点
				menu.setChildren(findSons(menu.getId(), allList));
				parents.add(menu);
			}
		}
		return parents;
	}

	//在所有菜单下 寻找指定父节点的子节点
	public static List<SysMenus> findSons(Long pid,List<SysMenus> allList){
		List<SysMenus> sons = new ArrayList<>();
		for(SysMenus menu:allList) {
			//menu.getParentId()==0
			if(menu.getParentId()==0) {
				continue;
			}
			if(menu.getParentId() == pid) {
				//继续再找该菜单下子节点
				//递归算法
				menu.setChildren(findSons(menu.getId(), allList));
				//添加到集合
				sons.add(menu);
			}
		}
		return sons;
	}
}
