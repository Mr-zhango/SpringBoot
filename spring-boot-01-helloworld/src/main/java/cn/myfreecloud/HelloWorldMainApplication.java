package cn.myfreecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 来标注一个主程序类
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //启动SpringBoot项目的主程序
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
