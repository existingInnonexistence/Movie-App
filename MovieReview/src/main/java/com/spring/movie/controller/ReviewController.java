package com.spring.movie.controller;

import java.util.List;
import java.util.Optional;

//import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.movie.entity.ReviewEntity;
import com.spring.movie.exception.MovieAlreadyExistsException;
import com.spring.movie.exception.MovieNotExistsException;
import com.spring.movie.service.ReviewService;

@RestController
@RequestMapping("/api")
public class ReviewController {
	@Autowired
	private ReviewService reviewServ;
	
	//@GetMapping("fetch/{reviewId}")
	//@ApiOperation("Returns user based in review id .")
	//public Review getreviewId(@PathVariable Long reviewid) {return Reviewservice.getReviewById(reviewid); }
	
	@GetMapping("/all")
	public List<ReviewEntity> getAll(){
		return reviewServ.getAllReviews();
		
	}
	
	//@GetMapping("/{name}")
	//public ResponseEntity<List<String>> findByName(@PathVariable String name ) throws MovieNotExistsException{
	//	return new ResponseEntity<List<String>>(movieServ.findByName(name),HttpStatus.OK);
	//}
	
	@GetMapping("/get/{id}")
	public Optional<ReviewEntity> getSingleReview(@PathVariable("id") Long id) {
		return reviewServ.findByReviewId(id);
		
	}
	
	@PostMapping("/post")
	public void saveReview(@RequestBody ReviewEntity review) {
		reviewServ.saveNewReview(review);
	}
	
	@PutMapping("/update/{reviewId}")
	public ReviewEntity updateData(@RequestBody ReviewEntity review,@PathVariable("reviewId") Long reviewId) {
		return reviewServ.updateReview(review, reviewId);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteReview(@PathVariable("id") Long id) throws MovieNotExistsException {
		return new ResponseEntity<String>(reviewServ.deleteReview(id),HttpStatus.OK);
		
	}

}

