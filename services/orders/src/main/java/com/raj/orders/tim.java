package com.raj.orders;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class tim {
    @GetMapping("/")
    public String getMethodName() {
        return new String("Hi I am from Orders MS");
    }
    @GetMapping("/placeOrder")
    public String placingOrder(@RequestParam String param, @RequestParam String port) {

        return new String("The Order has been placed for Customer "+param+" with Order Id: fxcv09987-"+port);
    }
    
    
    
}
