package com.swaraj.advice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.swaraj.UserException;

@ControllerAdvice
public class ControllerAdvise {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<?> handleException(Exception ex){
		List<String> list = new ArrayList<>();
		list.add("Swaraj");
		list.add("Varma");
		List<Object> list1 = new ArrayList<>();
		list1.add(121);
		list1.add(list);
		return new ResponseEntity<>(list1,HttpStatus.BAD_REQUEST);
	}
	 
	@ExceptionHandler(NumberFormatException.class)
	
	public ResponseEntity<String> numberFormatExceptionHandler(){
		
		return new ResponseEntity<String>("Please Provide a number to convert",HttpStatus.BAD_REQUEST);
	}
	
}
