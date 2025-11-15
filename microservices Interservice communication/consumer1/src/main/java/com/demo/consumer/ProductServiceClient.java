package com.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient( 
        name = "provider-service", // Logical name for the client 
        url = "http://localhost:8081" // Base URL of the Provider service 
) 
public interface ProductServiceClient {
	// 2. Declare a method for each API endpoint you want to call 
	// Uses the same annotations as a Spring @RestController 
	@GetMapping("/instance-info") // Path to the Provider's endpoint 
	String getInstanceInfo(); // Return type matches the Provider's response
	

}
