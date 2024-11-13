package com.hexaware.carrental.service;
/*
 * @Author: Shreyasi Bagul
 * Description: Created Service Interface for Bookings
 * Date: 9th Nov 24
 */
import com.hexaware.carrental.entity.Booking;
import java.util.List;

public interface IBookingService {
    Booking getBookingById(Integer bookingId);
    List<Booking> getAllBookings();
    boolean createBooking(Booking booking);
    boolean updateBooking(Integer bookingId, Booking booking);
    boolean cancelBooking(Integer bookingId);
}
