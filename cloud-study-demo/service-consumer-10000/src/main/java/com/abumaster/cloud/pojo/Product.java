package com.abumaster.cloud.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 产品的pojo
 *
 * @author zhangguofeng
 * @version 1.0
 * @date 2021/5/16
 */
@Data
public class Product {
    private Long id;
    private String brandName;
    private String name;
    private String price;
    private String weight;
    private Date updateTime;
    private String version;
}
