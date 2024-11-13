package com.hexaware.carrental.entity;
/*
 * @Author: Shreyasi Bagul
 * Description: Created POJO class for Booking
 * Date: 9th Nov 24
 */
import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int userId;
    private int carId;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;
    private Status status;

    public enum Status {
        PENDING, CONFIRMED, CANCELLED, COMPLETED
    }

    
    public Booking() {
        super();
    }

    
    
    

	public Booking(int bookingId, int userId, int carId, LocalDate startDate, LocalDate endDate, double totalPrice,
			Status status) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.carId = carId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalPrice = totalPrice;
		this.status = status;
	}





	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}





	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", carId=" + carId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", totalPrice=" + totalPrice + ", status=" + status + "]";
	}

    
    
}
