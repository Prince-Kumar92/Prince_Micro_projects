package com.order.service.common;

import com.order.service.entity.Order;


public class TransactionRequest {

	public TransactionRequest() {
		// TODO Auto-generated constructor stub
	}

	public TransactionRequest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	private Order order;
	private Payment payment;

}
