package com.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanyg
 * @since 2020/8/3
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }



}
