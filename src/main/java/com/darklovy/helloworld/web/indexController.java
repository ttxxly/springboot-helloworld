package com.darklovy.helloworld.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @RequestMapping("/getIndex")
    public String index() {

        return "index";
    }
}
