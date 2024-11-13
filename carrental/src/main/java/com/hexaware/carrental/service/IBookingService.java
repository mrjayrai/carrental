package com.hexaware.carrental.service;

import com.hexaware.carrental.entity.Booking;
import java.util.List;

public interface IBookingService {
    Booking getBookingById(Integer bookingId);
    List<Booking> getAllBookings();
    Booking createBooking(Booking booking);
    Booking updateBooking(Integer bookingId, Booking booking);
    void cancelBooking(Integer bookingId);
}
