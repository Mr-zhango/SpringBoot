package cn.myfreecloud.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     *
     * 在业务逻辑中获取配置文件 的值,使用@Value注解(最常用)
     *
     * 如果说是我们专门编写了一个javaBean来和配置文件进行映射时,我们就直接使用@ConfigurationProperties注解
     */
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){

        return "Helllo"+name;
    }
}
