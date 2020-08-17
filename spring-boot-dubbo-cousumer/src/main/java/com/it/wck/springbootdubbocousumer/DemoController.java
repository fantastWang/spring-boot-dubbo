package com.it.wck.springbootdubbocousumer;

import com.it.wcj.springbootdubboprovider.ISayService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/8/7 16:16
 **/
@RestController
public class DemoController {
    @DubboReference(registry = {"nanjing"})
    private ISayService sayService;

    @GetMapping("/sayHello")
    public String say(){
        return sayService.sayHello("Jack");
    }
}
