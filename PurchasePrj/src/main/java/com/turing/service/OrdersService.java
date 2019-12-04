package com.turing.service;

import java.util.List;

import com.turing.entity.Orders;

/**
 * 需求计划表业务接口
 * @author acer
 *
 */
public interface OrdersService {

	
	//查询所有需求计划信息
	public List<Orders> findAll();
	
	//通过id查询单个需求计划
	public Orders findById(Long id);
	
	//添加需求计划
	public int addOrders(Orders orders);
	
}
