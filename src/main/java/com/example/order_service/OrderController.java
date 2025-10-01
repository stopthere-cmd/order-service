package com.example.order_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Value("${order-service.message}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage() {
		return this.message;
	}


}
