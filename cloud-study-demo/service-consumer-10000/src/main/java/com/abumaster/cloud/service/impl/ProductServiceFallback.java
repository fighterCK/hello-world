package com.abumaster.cloud.service.impl;
import com.abumaster.cloud.pojo.Product;
import com.abumaster.cloud.service.ProductService;
import com.google.common.collect.Lists;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能详细描述
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/17
 */
@Component
@Slf4j
public class ProductServiceFallback implements ProductService {

    /**
     * 获取商品列表
     *
     * @return list
     */
    @Override
    public List<Product> listAllProduct() {
        log.info("服务异常,执行fallback函数.");
        return Lists.newArrayList();
    }
}
