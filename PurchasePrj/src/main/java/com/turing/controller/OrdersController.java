package com.turing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turing.entity.Orders;
import com.turing.service.OrdersService;

@Controller
public class OrdersController {
	
	@Autowired
	private OrdersService service;
	
	@GetMapping("/orders")
	@ResponseBody
	public List<Orders> findAll(){
		return service.findAll();
	}
	
	
	

}
