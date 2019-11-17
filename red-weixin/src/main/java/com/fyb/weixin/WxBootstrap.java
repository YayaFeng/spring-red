package com.fyb.weixin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @AUTHOR 18336 fengyabing
 * @VERSION V1.0
 * @create 2019/11/17
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.fyb.weixin.mapper")
public class WxBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(WxBootstrap.class).run(args);
    }
}
