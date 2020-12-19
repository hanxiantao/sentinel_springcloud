package com.ppdai.sentinel_feign_provider.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author hxt
 * @version 1.0
 * @date 2020/12/19
 */
@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello/{hello}")
    public String hello(@PathVariable String hello) {
        return hello;
    }
}
