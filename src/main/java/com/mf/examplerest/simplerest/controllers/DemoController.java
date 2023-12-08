package com.mf.examplerest.simplerest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello") //ip:port/hello localhost:8080/hello
    public String helloWord(){
     return "Hello Word";
    }
    @PostMapping("/hellop") //ip:port/hello localhost:8080/hello
    public String helloWordP(){
        return "Hello Word Post";
    }
}
