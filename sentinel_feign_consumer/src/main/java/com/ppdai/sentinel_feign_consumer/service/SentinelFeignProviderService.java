package com.ppdai.sentinel_feign_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hxt
 * @version 1.0
 * @date 2020/12/19
 */
@FeignClient(value = "sentinel-feign-provider")
public interface SentinelFeignProviderService {

    @GetMapping("/api/v1/hello")
    String hello();
}
