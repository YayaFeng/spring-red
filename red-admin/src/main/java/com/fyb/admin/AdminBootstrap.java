package com.fyb.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR 18336 fengyabing
 * @VERSION V1.0
 * @create 2019/11/17
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@MapperScan("com.fyb.admin.mapper")
public class AdminBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminBootstrap.class).run(args);
    }

    @RequestMapping("/test")
    public String getT() {

        return "ss";
    }

}
