package com.olofsson.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
/**@Target({ElementType.TYPE})
 @Retention(RetentionPolicy.RUNTIME)
 @Documented
 @Inherited
 @SpringBootApplication
 @EnableDiscoveryClient
 @EnableCircuitBreaker **/
@SpringCloudApplication
@EnableHystrix
public class gateway {
    public static void main(String[] args) {
        SpringApplication.run(gateway.class);
    }


    //注入mybatis分页插件bean




//    冒泡排序范围




}
