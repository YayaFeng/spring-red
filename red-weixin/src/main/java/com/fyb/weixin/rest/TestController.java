package com.fyb.weixin.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR 18336 fengyabing
 * @VERSION V1.0
 * @create 2019/11/17
 */
@RestController
@Slf4j
public class TestController {
    @RequestMapping("/e")
    public String s() {
        return "hello";
    }
}
