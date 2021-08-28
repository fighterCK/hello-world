package com.abumaster.cloud.service;

import com.abumaster.cloud.pojo.Product;

import java.util.List;

/**
 * 商品服务接口
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
public interface ProductService {

    /**
     * 获取商品列表
     * @return list
     */
    List<Product> listAllProduct();
}
