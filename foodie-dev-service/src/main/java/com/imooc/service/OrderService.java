package com.imooc.service;

import com.imooc.pojo.Carousel;
import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.bo.SubmitOrderBO;
import com.imooc.pojo.vo.OrderVO;

import java.util.List;

public interface OrderService {

    public OrderVO createOrder(SubmitOrderBO submitOrderBO);

    public void updateOrderStatus(String orderId, Integer orderStatus);

    //查询订单状态
    public OrderStatus queryOrderStatusInfo(String orderId);

    // 关闭超时未支付订单
    public void closeOrder();
}
