package org.example.order.service.impl;

import org.example.order.mapper.OrderMapper;
import org.example.order.pojo.Order;
import org.example.order.pojo.User;
import org.example.order.pojo.UserOrders;
import org.example.order.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order getOrderByOrderId(Long orderId) {
        return orderMapper.getOrderByOrderId(orderId);
    }

    @Override
    public UserOrders getOrdersByUserId(Long userId) {
        String uri = "http://userservice/user/getUser?id=" + userId;
        User user = restTemplate.getForObject(uri, User.class);
        List<Order> orders = orderMapper.getOrdersByUserId(userId);
        UserOrders userOrders = new UserOrders();
        BeanUtils.copyProperties(user, userOrders);
        userOrders.setOrders(orders);
        return userOrders;
    }
}
