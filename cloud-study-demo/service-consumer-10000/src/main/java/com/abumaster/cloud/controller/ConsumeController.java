package com.abumaster.cloud.controller;

import com.abumaster.cloud.pojo.Order;
import com.abumaster.cloud.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 接口层
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
@RestController
@Api(tags = "消费接口")
@RequestMapping("/api/v1/consumer")
public class ConsumeController {

    @Resource(name = "orderServiceImpl")
    private OrderService orderService;

    @GetMapping("/order/{id}")
    @ApiOperation("获取订单")
    public Order queryOrder(@PathVariable Integer id) {
return orderService.getOrderInfo(id);

    }
}
