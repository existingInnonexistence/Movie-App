/*
 * package com.spring.moviereview.controller;
 * 
 * import static org.mockito.Mockito.when; import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
 * import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * import java.util.LinkedList; import java.util.List; import
 * org.junit.jupiter.api.AfterEach; import org.junit.jupiter.api.BeforeEach;
 * import org.junit.jupiter.api.Test; 
 * import.org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.web.servlet.MockMvc;
 * 
 * import com.fasterxml.jackson.databind.ObjectMapper; import
 * com.fasterxml.jackson.databind.ObjectWriter; import
 * com.spring.movie.entity.ReviewEntity; import
 * com.spring.movie.exception.MovieNotExistsException; import
 * com.spring.movie.service.ReviewServiceImpl;
 * 
 * 
 * @WebMvcTest class MusicControllerTest {
 * 
 * @MockBean ReviewServiceImpl servImpl;
 * 
 * @Autowired MockMvc mockMvc;
 * 
 * ObjectMapper objectMapper=new ObjectMapper(); ObjectWriter
 * objectWriter=objectMapper.writer();
 * 
 * ReviewEntity details=new ReviewEntity();
 * 
 * @BeforeEach public void setUp(){ details = new ReviewEntity(); }
 * 
 * @AfterEach public void tearDown(){ details = null; }
 * 
 * @Test void testsaveReview() throws Exception ,MovieNotExistsException{
 * 
 * ReviewEntity details=new ReviewEntity();
 * 
 * when(servImpl.saveNewReview(details)).thenReturn(details);
 * 
 * String val=objectWriter.writeValueAsString(details);
 * 
 * mockMvc.perform(post("/api/post"). contentType(MediaType.APPLICATION_JSON).
 * content(val)). andExpect(status().isOk()); }
 * 
 * @Test void testgetAll() throws Exception { List<ReviewEntity> movie=new
 * LinkedList<>();
 * 
 * ((List<ReviewEntity>) details).add(new
 * ReviewEntity(1L,"comedy",9,"HeraPheri",490)); ((List<ReviewEntity>)
 * details).add(new ReviewEntity(2L,"Adventure",8,"Muqabla",300));
 * ((List<ReviewEntity>) details).add(new
 * ReviewEntity(3L,"Sci-fiction",9,"Inception",500));
 * 
 * 
 * when(servImpl.getAllReviews()).thenReturn((List<ReviewEntity>) details);
 * 
 * mockMvc.perform(get("/api/all") .contentType(MediaType.APPLICATION_JSON))
 * .andExpect(status().isOk()); }
 * 
 * 
 * 
 * }
 */