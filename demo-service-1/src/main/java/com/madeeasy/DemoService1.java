package com.madeeasy;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/product")
@OpenAPIDefinition(
        info = @Info(contact = @Contact(name = "pabitra bera",
                email = "pabitrabera2001@gmail.com"), title = "Product Service",
                termsOfService = "www.product.com/terms-and-condition",
                description = "Product service provide the product information's to the other users.",
                license = @License(name = "product service licence", url = "www.product.com/licence"),
                version = "v1"))
@EnableDiscoveryClient
public class DemoService1 {
    @GetMapping("/demo")
    public String welcome() {
        return "this is from demo-services-1";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoService1.class, args);
        System.out.println("Hello world!");
    }
}