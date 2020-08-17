package com.it.wcj.springbootdubboprovider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan(value = "com.it.wcj.springbootdubboprovider")
@SpringBootApplication
public class SpringBootDubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboProviderApplication.class, args);
    }

}
