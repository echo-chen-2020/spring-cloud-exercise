package org.example.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.order.pojo.Order;

import java.util.List;

@Mapper
public interface OrderMapper {

    Order getOrderByOrderId(@Param("orderId") Long orderId);

    List<Order> getOrdersByUserId(@Param("userId") Long userId);
}
