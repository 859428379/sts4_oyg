package com.turing.service;

import java.util.List;

import com.turing.entity.Material;

/**
 * 物资信息表业务接口
 * @author acer
 *
 */
public interface MaterialService {
	
	//查询所用物资信息
	public List<Material> findAll();
	
	//通过Id查询物资信息
	public Material findById(long id);

}
