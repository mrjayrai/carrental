package com.hexaware.carrental.service;
/*
 * @Author: Rajeshwari
 * Description: Created Service Interface for Rating Review
 * Date: 9th Nov 24
 */
import java.util.List;
import java.util.Optional;

import com.hexaware.carrental.entity.RatingReview;

public interface IRatingReview {
	// Add a new review for a booking
    boolean addReview(RatingReview review);

    // Update an existing review (by reviewId)
    boolean updateReview(Integer reviewId, String reviewText, int rating);

    // Delete a review by its ID
    boolean deleteReview(Integer reviewId);

    // Fetch a review by its ID
    Optional<RatingReview> getReviewById(Integer reviewId);

    // Fetch all reviews for a specific booking
    List<RatingReview> getReviewsByBookingId(Integer bookingId);

    // Fetch all reviews made by a specific user
    List<RatingReview> getReviewsByUserId(Integer userId);

    // Fetch all reviews in the system (for admin use)
    List<RatingReview> getAllReviews();

    // Fetch average rating for a specific car (if linked via bookingId)
    double getAverageRatingByCarId(Integer carId);

    // Check if a user has already reviewed a booking
    boolean hasUserReviewedBooking(Integer userId, Integer bookingId);

    // Fetch top N recent reviews
    List<RatingReview> getRecentReviews(int limit);
}
