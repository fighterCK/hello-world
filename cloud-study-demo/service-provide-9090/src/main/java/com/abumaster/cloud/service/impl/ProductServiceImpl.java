package com.abumaster.cloud.service.impl;
import java.util.Date;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import com.abumaster.cloud.pojo.Product;
import com.abumaster.cloud.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品服务的实现类
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    private static final Snowflake SNOWFLAKE = new Snowflake(1,1);
    private static final String[] BRAND_NAME={"华为","小米","苹果","魅族","一加","索尼"};
    /**
     * 获取商品列表
     *
     * @return list
     */
    @Override
    public List<Product> listAllProduct() {
        List<Product> data = new ArrayList<>();
        for (int i = 0, max = RandomUtil.randomInt(1, 5); i < max; i++) {
            Product product = new Product();
            product.setId(SNOWFLAKE.nextId());
            product.setBrandName(RandomUtil.randomEle(BRAND_NAME));
            product.setName(RandomUtil.randomString(16));
            product.setPrice(RandomUtil.randomNumbers(5));
            product.setWeight("10");
            product.setUpdateTime(new Date());
            product.setVersion("V1.0");
            data.add(product);
        }
        return data;
    }
}
