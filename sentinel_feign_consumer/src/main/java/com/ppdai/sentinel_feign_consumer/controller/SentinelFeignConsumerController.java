package com.ppdai.sentinel_feign_consumer.controller;

import com.ppdai.sentinel_feign_consumer.service.SentinelFeignProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hxt
 * @version 1.0
 * @date 2020/12/19
 */
@RestController
@RequestMapping("/api/v1/consumer")
public class SentinelFeignConsumerController {
    @Autowired
    private SentinelFeignProviderService sentinelFeignProviderService;

    @GetMapping("/hello")
    public String hello(){
        return sentinelFeignProviderService.hello();
    }
}
