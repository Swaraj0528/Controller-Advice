package com.swaraj.service;

import org.springframework.stereotype.Service;

import com.swaraj.UserException;

@Service
public class AdviceService {
	
	
	public String demoMethod(String number){
		 throw new UserException("User Exception");
	}

	public void display() {
		System.out.println("Do Nothing....");
	}
}
