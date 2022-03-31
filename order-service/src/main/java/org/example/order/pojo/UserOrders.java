package org.example.order.pojo;

import lombok.Data;

import java.util.List;

@Data
public class UserOrders {
    private Long userId;
    private String name;
    private int age;
    private String address;

    private List<Order> orders;

}
