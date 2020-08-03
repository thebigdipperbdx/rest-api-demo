package com.example.controller;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanyg
 * @since 2020/8/3
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public User helloWorld(){
        User user=new User();
        user.setName("TianMing");
        user.setAge("20");
        return user;
    }



}
