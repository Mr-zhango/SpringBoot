package cn.myfreecloud.springboot10task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: zhangyang
 * @date: 2019/6/6 19:34
 * @description:
 */
@Service
public class AsyncService {

    //告诉Spring这是一个异步方法
    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理数据中...");
    }
}
