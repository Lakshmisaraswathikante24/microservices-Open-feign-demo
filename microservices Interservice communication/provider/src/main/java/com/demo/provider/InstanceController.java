package com.demo.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {

    @GetMapping("/instance-info")
    public String info() {
        return "Provider service is up!";
    }
}

