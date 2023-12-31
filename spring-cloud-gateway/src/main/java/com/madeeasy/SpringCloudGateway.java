package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudGateway {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGateway.class, args);
        System.out.println("Hello world!");
    }
}