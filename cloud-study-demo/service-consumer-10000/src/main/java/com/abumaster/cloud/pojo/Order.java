package com.abumaster.cloud.pojo;

import lombok.Data;

import java.util.List;

/**
 * 订单
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
@Data
public class Order {
    private Integer id;
    private String orderNo;
    private String orderAddress;
    private String totalPrice;

    private List<Product> productList;
}
