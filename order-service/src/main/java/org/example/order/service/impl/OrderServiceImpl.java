package org.example.order.service.impl;

import org.example.order.mapper.OrderMapper;
import org.example.order.pojo.Order;
import org.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order getOrderByOrderId(Long orderId) {
        return orderMapper.getOrderByOrderId(orderId);
    }

    @Override
    public List<Order> getOrdersByUserId(Long UserId) {
        return null;
    }
}
