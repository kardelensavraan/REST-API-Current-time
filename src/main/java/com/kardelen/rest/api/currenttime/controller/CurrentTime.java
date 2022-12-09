package com.kardelen.rest.api.currenttime.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentTime {
	@RequestMapping(method = RequestMethod.GET, path = "/current-time")

	public String get() {
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm");
		 return (timeFormat.format(currentDate));
		 
		

	}

}
