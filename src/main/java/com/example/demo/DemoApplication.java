package com.example.demo;

import com.example.demo.run.SpringContextUtil;
import com.example.demo.run.StartupRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private static Test test;

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 100;
    }

    public static void main(String[] args) {
        System.exit(SpringApplication
                .exit(SpringApplication.run(DemoApplication.class, args)));
//        SpringApplication.run(DemoApplication.class,args);
//        ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
//        test = applicationContext.getBean(Test.class);
//        test.test();
    }


    @Bean
    public StartupRunner startupRunner(){
        System.out.println("startUpRunner");
        return new StartupRunner();
    }
}
