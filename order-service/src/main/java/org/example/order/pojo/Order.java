package org.example.order.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Long orderId;
    private Long userId;
    private Integer amount;
    private Date createTime;
    private String creater;
    private Date updateTime;
}
