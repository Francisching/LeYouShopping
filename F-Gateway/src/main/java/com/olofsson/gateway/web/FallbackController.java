package com.olofsson.gateway.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FallbackController {

    /**
     * 默认的超时处理逻辑
     * @return 超时提醒
     */
    @GetMapping(value = "/hystrix/fallbaack")
    public ResponseEntity<String> fallBackController() {
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("请求超时！");
    }
}