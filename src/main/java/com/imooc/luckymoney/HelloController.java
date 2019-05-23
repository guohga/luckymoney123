package com.imooc.luckymoney;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String say ( ){
        return "跟我来。";
    }
}
