package com.order.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.service.common.Payment;
import com.order.service.common.TransactionRequest;
import com.order.service.common.TransactionResponse;
import com.order.service.entity.Order;
import com.order.service.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Autowired
	private RestTemplate template;

	public TransactionResponse saveOrder(TransactionRequest request) {

		String response = "";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrdeId(order.getId());
		payment.setAmount(order.getPrice());

		Payment paymentResponse = template.postForObject("http://PAYMENT-SERVICE/payment/dopayment", payment,
				Payment.class);
		response = paymentResponse.getPaymentStatus().equals(paymentResponse)
				? "payment processing Successful and order placed "
				: "there is a failure in payment api , orde added to cart";
		repository.save(order);
		return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(),
				response);
	}
}
