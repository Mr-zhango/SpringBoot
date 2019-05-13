package cn.myfreecloud.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//加载自定义的Spring配置文件beans.xml(不推荐使用-->使用配置类的方式来实现)
//@ImportResource(locations = {"classpath:beans.xml"}) 导入传统的xml的Spring的配置文件,已经被@Configuration配置类的方式取代了
@SpringBootApplication
public class SpringBoot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02ConfigApplication.class, args);
    }

}

