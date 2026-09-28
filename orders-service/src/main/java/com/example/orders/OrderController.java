package com.example.orders;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders/{id}/status")
    public Map<String, Object> status(@PathVariable long id) {
        return Map.of("orderId", id, "status", "PACKED", "version", "1.0.0");
    }
}
