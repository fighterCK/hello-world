package com.abumaster.cloud.controller;

import com.abumaster.cloud.pojo.Product;
import com.abumaster.cloud.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能详细描述
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
@RestController
@RequestMapping("/api/v1/product")
@Api(tags = "商品服务")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    @ApiOperation("列表")
    public List<Product> listAllProduct() {
        return productService.listAllProduct();
    }
}
