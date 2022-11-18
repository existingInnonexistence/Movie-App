package com.spring.movie.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import lombok.ToString;

@Entity
@Table(name="review")
public class ReviewEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;
	private String content;
	private Integer movieRating;
	private String movieName;
//	private Long dateTime;
	private Integer likes;
	public ReviewEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewEntity( Long reviewId, String content, Integer movieRating, String movieName, Integer likes) {
		super();
		this.reviewId = reviewId;
		this.content = content;
		this.movieRating = movieRating;
		this.movieName = movieName;
		this.likes = likes;
	}
	
	public Long getReviewId() {
		return reviewId;
	}
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(Integer movieRating) {
		this.movieRating = movieRating;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	@Override
	public String toString() {
		return "ReviewEntity [reviewId=" + reviewId + ", content=" + content + ", movieRating=" + movieRating
				+ ", movieName=" + movieName + ", likes=" + likes + "]";
	}
	
	
}
