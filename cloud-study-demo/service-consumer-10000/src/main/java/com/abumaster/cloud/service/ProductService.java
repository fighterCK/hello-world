package com.abumaster.cloud.service;

import com.abumaster.cloud.pojo.Product;
import com.abumaster.cloud.service.impl.ProductServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 商品服务接口
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
@FeignClient(value = "service-provide",fallback = ProductServiceFallback.class)
public interface ProductService {

    /**
     * 获取商品列表
     * @return list
     */
    @GetMapping("/api/v1/product/list")
    List<Product> listAllProduct();
}
