package com.kodilla.jmsmessage.controller;

import com.kodilla.jmsmessage.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/sendOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void processMessage(@RequestBody Order order) {
        String covertedMessage = order.getProduct()+";"+order.getQuantity()+";"+order.getUnitPrice();
        System.out.println(covertedMessage);
        jmsTemplate.convertAndSend("queue-test", covertedMessage);
    }
}
