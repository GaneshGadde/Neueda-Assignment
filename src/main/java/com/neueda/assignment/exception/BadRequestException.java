package com.neueda.assignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    
	private static final long serialVersionUID = -7039545121867191545L;

	public BadRequestException(String message) {
        super(message);
    }
}
