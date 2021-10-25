package com.swaraj.service;

import org.springframework.stereotype.Service;

@Service
public class AdviceService {
	
	
	public String demoMethod(String number){
		
		Integer num = Integer.parseInt(number);
		return num.toString();
	}

}
