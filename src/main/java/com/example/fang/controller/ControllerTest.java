package com.example.fang.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class ControllerTest {
    @RequestMapping("/test2")
    public String test(){
        System.out.println("test11");
        return "test";
    }
}
