package cn.myfreecloud.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);

      System.out.println("开始打印日志");
    logger.info("Hello World");
  }
}