package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Date:2019/9/8 description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LyItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class,args);
    }
}
