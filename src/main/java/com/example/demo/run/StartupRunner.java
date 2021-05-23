package com.example.demo.run;

import com.example.demo.Test;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.Resource;


public class StartupRunner implements CommandLineRunner {
    @Resource
    private Test test;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("startup runner");
        test.test();
        System.out.println("task finished");
    }
}
