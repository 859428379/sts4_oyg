package com.turing.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.turing.entity.Orders;
import com.turing.mapper.OrdersMapper;
import com.turing.service.OrdersService;

/**
 * 需求计划表业务实现类
 * @author acer
 *
 */
@Service
public class OrdersServiceImpl implements OrdersService{

    //注入mapper
	@Autowired
	private OrdersMapper mapper;
	
	@Override
	public List<Orders> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public Orders findById(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int addOrders(Orders orders) {
		return mapper.insertSelective(orders);
	}

	
}
