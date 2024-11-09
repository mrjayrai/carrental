package com.hexaware.carrental.entity;

import java.time.LocalDateTime;

public class Payment {
	 private Integer paymentId;
	    private Integer bookingId;
	    private Double amount;
	    private LocalDateTime paymentDate;
	    private PaymentMethod paymentMethod;
	    private Status status;
	    public enum PaymentMethod {
	        CREDIT_CARD, DEBIT_CARD, CASH, ONLINE
	    }
	    public enum Status {
	        PENDING, PAID, FAILED
	    }
		public Payment() {
			super();
		}
		public Payment(Integer paymentId, Integer bookingId, Double amount, LocalDateTime paymentDate,
				PaymentMethod paymentMethod, Status status) {
			super();
			this.paymentId = paymentId;
			this.bookingId = bookingId;
			this.amount = amount;
			this.paymentDate = paymentDate;
			this.paymentMethod = paymentMethod;
			this.status = status;
		}
		public Integer getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(Integer paymentId) {
			this.paymentId = paymentId;
		}
		public Integer getBookingId() {
			return bookingId;
		}
		public void setBookingId(Integer bookingId) {
			this.bookingId = bookingId;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public LocalDateTime getPaymentDate() {
			return paymentDate;
		}
		public void setPaymentDate(LocalDateTime paymentDate) {
			this.paymentDate = paymentDate;
		}
		public PaymentMethod getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(PaymentMethod paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public Status getStatus() {
			return status;
		}
		public void setStatus(Status status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", amount=" + amount
					+ ", paymentDate=" + paymentDate + ", paymentMethod=" + paymentMethod + ", status=" + status + "]";
		}
	    

}
