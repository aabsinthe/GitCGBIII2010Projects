package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*springboot 工程默认启动类*/
@SpringBootApplication
public class InitializrApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitializrApplication.class, args);

        System.out.println("hello");
    }

}
