package com.demo.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor; 

@RestController
@RequestMapping("/api/feign")
@RequiredArgsConstructor
public class FiegnController {
	
	private final ProductServiceClient productServiceClient;
	@GetMapping("/instance") 
	public String getInstance() {
		return productServiceClient.getInstanceInfo(); 	
		}

}
