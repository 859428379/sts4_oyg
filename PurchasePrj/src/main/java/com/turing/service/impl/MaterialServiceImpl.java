package com.turing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.entity.Material;
import com.turing.mapper.MaterialMapper;
import com.turing.service.MaterialService;

/**
 * 物资信息表业务实现类
 * @author acer
 *
 */
@Service
public class MaterialServiceImpl implements MaterialService{

	//注入接口
	@Autowired
	private MaterialMapper mapper;
	
	@Override
	public List<Material> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public Material findById(long id) {
		return mapper.selectByPrimaryKey(id);
	}
 
}
