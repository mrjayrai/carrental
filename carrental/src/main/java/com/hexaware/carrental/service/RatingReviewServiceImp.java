package com.hexaware.carrental.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.carrental.entity.RatingReview;

public class RatingReviewServiceImp implements IRatingReview {

	@Override
	public boolean addReview(RatingReview review) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateReview(Integer reviewId, String reviewText, int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteReview(Integer reviewId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<RatingReview> getReviewById(Integer reviewId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<RatingReview> getReviewsByBookingId(Integer bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RatingReview> getReviewsByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RatingReview> getAllReviews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getAverageRatingByCarId(Integer carId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasUserReviewedBooking(Integer userId, Integer bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RatingReview> getRecentReviews(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
