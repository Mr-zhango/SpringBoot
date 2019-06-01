package cn.myfreecloud.cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author: zhangyang
 * @date: 2019/5/31 16:19
 * @description:
 */
@Configuration
public class MyCacheConfig {

    /**
     * 自定义的key生成器 方法名字[参数]
     * 组件的默认id是keyGenerator  指定id为myKeyGenerator使用@Bean("myKeyGenerator")
     * @return
     */
    @Bean("myKeyGenerator")
    public KeyGenerator keyGenerator(){
        return new KeyGenerator(){

            @Override
            public Object generate(Object target, Method method, Object... params) {
                return method.getName()+"["+ Arrays.asList(params).toString()+"]";
            }
        };
    }
}
