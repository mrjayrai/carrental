package com.hexaware.carrental.service;
/*
 * @Author: Rajeshwari
 * Description: Created Service Interface Implementation for Payments
 * Date: 9th Nov 24
 */
import java.util.List;

import com.hexaware.carrental.entity.Payment;

public class PayementServiceImp implements IPaymentService {

	@Override
	public Payment processPayment(int userId, int bookingId, double amount, String paymentMethod, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPaymentById(int paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getPaymentsByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getPaymentHistoryByBookingId(int bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean savePaymentMethod(int userId, String paymentDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean issueRefund(int paymentId, double refundAmount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validatePaymentDetails(String paymentDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePaymentStatus(Integer paymentId, String status) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Double getTotalAmountPaid(Integer bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPaymentCompleted(Integer bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

}
