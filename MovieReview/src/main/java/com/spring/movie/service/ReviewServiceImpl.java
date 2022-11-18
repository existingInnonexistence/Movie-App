package com.spring.movie.service;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.movie.entity.ReviewEntity;
import com.spring.movie.repository.ReviewRepository;
@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewRepository reviewRepo;

	@Override
	public Optional<ReviewEntity> findByReviewId(Long reviewId) {
		// TODO Auto-generated method stub
		return reviewRepo.findById(reviewId);
	}

	@Override
	public List<ReviewEntity> getAllReviews() {
		// TODO Auto-generated method stub
		return reviewRepo.findAll();
	}

	@Override
	public ReviewEntity saveNewReview(ReviewEntity review) {
		// TODO Auto-generated method stub
		return reviewRepo.save(review);
		//return "Review Successfully Added";
	}

	@Override
	public String deleteReview(Long reviewId) {
		// TODO Auto-generated method stub
		reviewRepo.deleteById(reviewId);
		return "deleted";
	}

	@Override
	public ReviewEntity updateReview(ReviewEntity review, Long reviewId) {
		// TODO Auto-generated method stub
		ReviewEntity update=reviewRepo.findById(reviewId).get();
		if(Objects.nonNull(review.getContent()) && ! " ".equalsIgnoreCase(review.getContent())) {
			update.setContent(review.getContent());
		}
		return reviewRepo.save(update);
	} 

}
