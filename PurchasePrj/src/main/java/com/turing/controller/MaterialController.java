package com.turing.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.turing.entity.Material;
import com.turing.entity.MaterialExample;
import com.turing.entity.MaterialExample.Criteria;
import com.turing.mapper.MaterialMapper;
import com.turing.service.MaterialService;

@Controller
public class MaterialController{
	
	@Autowired
	private MaterialService service;
	
	@Autowired
	private MaterialMapper mapper;
	
	@GetMapping("/materials")
	@ResponseBody
	@SuppressWarnings("unchecked")
	public Map findAll(int page,int rows,Model model,String typeUnit){
    	//模糊查询条件
    	MaterialExample example=new MaterialExample();
    	Criteria criteria=example.createCriteria();
    	if (typeUnit!=null) {
    		if(typeUnit.equals("全部")) {
    			criteria.andTypeUnitLike("%");
    		}else {
    			criteria.andTypeUnitLike("%"+typeUnit+"%");
    		}	
		}
    	
    	//设置分页的条件
    	PageHelper.startPage(page, rows);
    	List<Material> list=mapper.selectByExample(example);
    	PageInfo<Material> pageInfo=new PageInfo<>(list);
    	Map data=new HashMap<>();
    	data.put("total", pageInfo.getTotal());
    	data.put("rows", pageInfo.getList());
    	return data;
	}
	
	@GetMapping("/findMaterial")
	@ResponseBody
	public 	List<Material>  findMaterial(long id,Model model){
		List<Material> materials=new ArrayList<>();
		Material material=service.findById(id);
		System.out.println(material.getMaterialName());
		materials.add(material);
		model.addAttribute("materials", materials);
		return materials;
	}

}
