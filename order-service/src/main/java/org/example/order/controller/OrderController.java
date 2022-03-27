package org.example.order.controller;

import org.example.order.pojo.Order;
import org.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrderByOrderId")
    @ResponseBody
    public Order getOrderByOrderId(@PathParam("orderId")Long orderId){
//        System.out.println("+++++++++++begain to return");
//        Order order = new Order();
//        order.setCreater("test");
//        return order;
        return orderService.getOrderByOrderId(orderId);
    }
}
