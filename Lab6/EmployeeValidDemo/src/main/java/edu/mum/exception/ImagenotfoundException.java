package edu.mum.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No image found.")
	public class ImagenotfoundException extends RuntimeException {
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			private String message;
			
			public ImagenotfoundException(String message) {
				this.message = message;
	}
	}
