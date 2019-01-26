package com.darklovy.helloworld.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个案例
 * EnableAutoConfiguration :扫包 范围是默认在当前类里面
 */
@RestController
public class MemberController {


    @RequestMapping("/memberIndex")
    public String memberIndex() {

        return "HelloWorld!!!";
    }


}
