package com.raj.customer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("orders")
public interface ordering {
    @GetMapping("/placeOrder")
    public String placingOrder(@RequestParam String param,@RequestParam String port);

}
