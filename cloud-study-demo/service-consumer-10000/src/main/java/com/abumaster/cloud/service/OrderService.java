package com.abumaster.cloud.service;

import com.abumaster.cloud.pojo.Order;

/**
 * 订单服务
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
public interface OrderService {

    Order getOrderInfo(Integer id);
}
