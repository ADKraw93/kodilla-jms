package com.kodilla.jmsmessage.receoiver;

import com.kodilla.jmsmessage.domain.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-test")
    public void receive(String message) {
        System.out.println(message);
        String[] fields = message.split(";");

        Order order = new Order((fields[0]), Double.valueOf(fields[1]), Double.valueOf(fields[2]));

        System.out.println("Received the order for product: " + order.getProduct());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Unit price: " + order.getUnitPrice());
    }
}
