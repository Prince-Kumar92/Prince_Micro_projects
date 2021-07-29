package com.order.service.common;

public class Payment {

	private int paymentId;
	private String paymentStatus;
	private int transactionId;
	private int ordeId;
	private double amount;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentId, String paymentStatus, int transactionId, int ordeId, double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.ordeId = ordeId;
		this.amount = amount;
	}

	public int getOrdeId() {
		return ordeId;
	}

	public void setOrdeId(int ordeId) {
		this.ordeId = ordeId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
}
