package com.it.wcj.springbootdubboprovider;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/8/7 16:15
 **/
@DubboService(registry = {"shanghai"})
public class SayServiceImpl implements ISayService {
    @Override
    public String sayHello(String msg) {
        return "Hello Spring Boot：" + msg;
    }
}
