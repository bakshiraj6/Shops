package com.raj.customer.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class checkUsers {
    @Autowired
    Environment env;
    @Autowired
    ordering ord;
    @GetMapping("/users")
    public String getMethodName() {
        String x= "Running on PORT :"+env.getProperty("local.server.port");
        return x;
    }

    @GetMapping("/orderProduct")
    public String orderPlacer(@RequestParam String param) {
        
        return ord.placingOrder(param,env.getProperty("local.server.port"));
    }
    
    
    
}
