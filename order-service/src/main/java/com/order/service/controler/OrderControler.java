package com.order.service.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.common.Payment;
import com.order.service.common.TransactionRequest;
import com.order.service.common.TransactionResponse;
import com.order.service.entity.Order;
import com.order.service.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderControler {

	@Autowired
	private OrderService service;

	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {

		return service.saveOrder(request)/* service.saveOrder(order) */;
	}

}
