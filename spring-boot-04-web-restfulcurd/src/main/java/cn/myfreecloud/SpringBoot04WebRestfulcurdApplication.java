package cn.myfreecloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * 直接扫描所有的mapper文件
 */

/**
 * @author zhangyang
 */
@MapperScan(basePackages = "cn.myfreecloud.mapper")
@SpringBootApplication
public class SpringBoot04WebRestfulcurdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot04WebRestfulcurdApplication.class, args);
    }

    @Bean
    public ViewResolver myViewReolver() {
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver {

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}

