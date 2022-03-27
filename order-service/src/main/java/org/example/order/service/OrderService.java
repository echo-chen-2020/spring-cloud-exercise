package org.example.order.service;

import org.example.order.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Order getOrderByOrderId(Long orderId);

    List<Order> getOrdersByUserId(Long UserId);
}
