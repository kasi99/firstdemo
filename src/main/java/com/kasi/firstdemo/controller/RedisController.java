package com.kasi.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-27 06:31
 * @Version:
 */

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/config/test")
    public void test() {
        redisTemplate.opsForValue().set("my-key-three","hello tiem!");
    }
}
