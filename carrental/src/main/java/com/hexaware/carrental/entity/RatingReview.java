package com.hexaware.carrental.entity;
/*
 * @Author: Rajeshwari 
 * Description: Created POJO class for Rating Review
 * Date: 9th Nov 24
 */
import java.time.LocalDate;

public class RatingReview {
private int reviewId;
private int userId;
private int bookingId;
private String reviewText;
private LocalDate reviewDate;
private int rating;
public RatingReview() {
	super();
}
public RatingReview(int reviewId, int userId, int bookingId, String reviewText, LocalDate reviewDate, int rating) {
	super();
	this.reviewId = reviewId;
	this.userId = userId;
	this.bookingId = bookingId;
	this.reviewText = reviewText;
	this.reviewDate = reviewDate;
	this.rating = rating;
}
public int getReviewId() {
	return reviewId;
}
public void setReviewId(int reviewId) {
	this.reviewId = reviewId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public String getReviewText() {
	return reviewText;
}
public void setReviewText(String reviewText) {
	this.reviewText = reviewText;
}
public LocalDate getReviewDate() {
	return reviewDate;
}
public void setReviewDate(LocalDate reviewDate) {
	this.reviewDate = reviewDate;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "RatingReview [reviewId=" + reviewId + ", userId=" + userId + ", bookingId=" + bookingId + ", reviewText="
			+ reviewText + ", reviewDate=" + reviewDate + ", rating=" + rating + "]";
}



}
