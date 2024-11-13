package com.hexaware.carrental.entity;

import java.time.LocalDate;

public class Booking {
    private Integer bookingId;
    private Integer userId;
    private Integer carId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double totalPrice;
    private Status status;

    public enum Status {
        PENDING, CONFIRMED, CANCELLED, COMPLETED
    }

    
    public Booking() {
        super();
    }

    
    public Booking(Integer bookingId, Integer userId, Integer carId, LocalDate startDate, LocalDate endDate, 
                   Double totalPrice, Status status) {
        super();
        this.bookingId = bookingId;
        this.userId = userId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", carId=" + carId 
               + ", startDate=" + startDate + ", endDate=" + endDate 
               + ", totalPrice=" + totalPrice + ", status=" + status + "]";
    }
}
