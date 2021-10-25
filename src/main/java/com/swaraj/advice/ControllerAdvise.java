package com.swaraj.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvise {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleException(){
		
		return new ResponseEntity<String>("Controller Advice test is successful",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NumberFormatException.class)
	
	public ResponseEntity<String> numberFormatExceptionHandler(){
		
		return new ResponseEntity<String>("Please Provide a number to convert",HttpStatus.BAD_REQUEST);
	}
	
}
