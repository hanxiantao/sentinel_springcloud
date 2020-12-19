package com.ppdai.sentinel_feign_consumer.service;

import org.springframework.stereotype.Component;

/**
 * @author hxt
 * @version 1.0
 * @date 2020/12/19
 */
//限流或者降级的处理
@Component
public class FallbackService implements FeignAgent {
    //限流和降级的处理
    @Override
    public String hello(String hello) {
        return "系统繁忙，请稍候";
    }
}
