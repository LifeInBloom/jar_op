package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class Test {
    @Value("${demo.test.name}")
    private String name;

    public void test(){
       System.out.println(111);
       System.out.println(name);
    }
}
