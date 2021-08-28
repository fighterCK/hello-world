package com.abumaster.cloud.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import com.abumaster.cloud.pojo.Order;
import com.abumaster.cloud.service.OrderService;
import com.abumaster.cloud.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能详细描述
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;


    @Override
    public Order getOrderInfo(Integer id) {
        Order order = new Order();
        order.setId(id);
        order.setOrderNo(IdUtil.randomUUID());
        order.setOrderAddress(RandomUtil.randomString(16));
        order.setTotalPrice("");
        order.setProductList(productService.listAllProduct());

        return order;
    }



}
