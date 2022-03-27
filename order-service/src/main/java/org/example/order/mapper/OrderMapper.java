package org.example.order.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.order.pojo.Order;

import java.util.List;

public interface OrderMapper {

    @Select("select * from order_table where order_id = #{orderId}")
    Order getOrderByOrderId(@Param("orderId") Long orderId);

    @Select("select * from order_table where user_id = #{userId}")
    List<Order> getOrdersByUserId(@Param("userId") Long userId);
}
