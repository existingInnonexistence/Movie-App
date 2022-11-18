package com.spring.movie.service;


import java.util.List;
import java.util.Optional;

import com.spring.movie.entity.ReviewEntity;

public interface ReviewService {
	
	public Optional<ReviewEntity> findByReviewId(Long reviewId);
	
	public List<ReviewEntity> getAllReviews();

	public ReviewEntity saveNewReview(ReviewEntity review);

    public String deleteReview(Long reviewId);

    public ReviewEntity updateReview(ReviewEntity review, Long  reviewId);

}

