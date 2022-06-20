package com.guojian.controller;

import com.guojian.entity.Award;
import com.guojian.service.Impl.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorld helloWorld;

    @GetMapping("hello")
    public String test(){
        return helloWorld.test()+"ccc";
    }

    @GetMapping("list")
    public List<Award> testList(){
        return helloWorld.list();
    }
}
