package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 注解描述的类为springboot工程启动类,
 * 这个启动类会通过@SpringBootApplication注解告诉springboot工程
 * 项目在启动时要做哪些基础操作.
 * 1)基于线程调用i/o从磁盘读取类,将其加载到内存,此时会基于类创建字节码对象(其类型为Class类型)
 * 2)基于Class对象(字节码对象)读取类的配置信息(例如类上有什么注解-例如@Component,属性上有什么注解,....)
 * 3)基于类的配置进行相应的配置存储(交给spring管理的类的配置)-Map<String,BeanDefinition>
 * 4)基于类的配置借助BeanFactory创建类的实例(对象),多个对象存储到Map<String,Object>
 */
@SpringBootApplication
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
