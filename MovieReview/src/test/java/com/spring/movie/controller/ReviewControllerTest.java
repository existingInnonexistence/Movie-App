package com.spring.movie.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

//import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.movie.entity.ReviewEntity;
import com.spring.movie.exception.MovieNotExistsException;
import com.spring.movie.repository.ReviewRepository;
import com.spring.movie.service.ReviewServiceImpl;

//import ch.qos.logback.core.net.ObjectWriter;

@WebMvcTest
class ReviewControllerTest {

	@MockBean
	ReviewServiceImpl servImpl;

	@MockBean
	ReviewRepository repo;

	@Autowired
	MockMvc mockMvc;

	ObjectMapper objectMap = new ObjectMapper();
	ObjectWriter objectWriter = objectMap.writer();

	ReviewEntity movie;

	@BeforeEach
	public void setUp() {
		movie = new ReviewEntity(1l, "horror", 8, "Conjuring", 450);

	}

	@AfterEach
	public void tearDown() {
		movie = new ReviewEntity();
	}

	/*
	 * @Test void testGetAll() {
	 * 
	 * }
	 */
	/*
	 * @Test void testGetSingleReview() { fail("Not yet implemented"); }
	 */

	@Test
	void testDelete() throws Exception, MovieNotExistsException {
		List<ReviewEntity> movie = new ArrayList<ReviewEntity>();
		movie.add(new ReviewEntity(1l, "Adventure", 9, "RRR", 400));
		movie.add(new ReviewEntity(2l, "Thriller", 8, "Pushpa", 450));
		// Service test
		when(servImpl.deleteReview(1l)).thenReturn("deleted");
		// Exception test
		// when(servImpl.deleteReview(0l)).thenThrow(new MovieNotExistsException(""));

		// Controller test
		mockMvc.perform(delete("/api/delete/1")).andExpect(status().isOk());
	}

	
	  @Test void testgetAll() throws Exception {
	  
	  List<ReviewEntity> movie=new ArrayList<ReviewEntity>(); 
	  movie.add(new
	  ReviewEntity(1l,"Adventure", 9, "RRR", 400)); 
	  movie.add(new
	  ReviewEntity(2l,"Thriller",8,"Pushpa", 450));
	  
	  //Service Test 
	  when( servImpl.getAllReviews()).thenReturn(movie);
	  
	  //Controller Test
	  mockMvc.perform(get("/api/all")).andExpect(status().isOk()); }
	  
	/*
	 * @Test void testDeleteReview() { fail("Not yet implemented"); }
	 * 
	 */
}
