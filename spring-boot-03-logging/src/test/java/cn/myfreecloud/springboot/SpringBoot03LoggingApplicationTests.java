package cn.myfreecloud.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {


    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        //日志的级别
        //由低到高  trace<debug<info<warn<error

        //生产环境的时候,我们可以调整输入的日志级别,日志就只会在  此级别以及其以后的级别生效

        logger.trace("这是track信息...");
        logger.debug("这是debug信息...");

        //可以看到SpringBoot默认给我们设置的还info级别的,只有info级别及其更高级别的才会输出
        logger.info("这是info信息...");
        logger.warn("这是warn信息...");
        logger.error("这是error信息...");


        //项目上线之后一般只需要 警告和错误,只需要调整日志级别为warn级别即可

    }

}

