package com.spring.movie.exception;

@SuppressWarnings("serial")

public class MovieAlreadyExistsException extends Exception {
	
	public MovieAlreadyExistsException (String message ) {
		super(message);
	}
	

}
