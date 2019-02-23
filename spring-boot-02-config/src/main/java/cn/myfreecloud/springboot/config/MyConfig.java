package cn.myfreecloud.springboot.config;

import cn.myfreecloud.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类的使用
 * @Configuration:知名当前类是一个配置类,用来代替配置文件的
 *
 * 以前在配置文件中我们是使用<bean></bean>标签来添加组件的
 * 在配置类中我们使用@bean注解来实现
 */
//告诉SpringBoot这是一个配置类
@Configuration
public class MyConfig {

    //将方法的返回值添加到容器中去,容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了");
        /** SpringBoot推荐的方式***/
        return new HelloService();
    }
}
