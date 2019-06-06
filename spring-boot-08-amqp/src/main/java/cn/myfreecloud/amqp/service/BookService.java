package cn.myfreecloud.amqp.service;

import cn.myfreecloud.amqp.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author: zhangyang
 * @date: 2019/6/5 19:14
 * @description:
 */
@Service
public class BookService {

    /*指明需要监听的消息队列  数组的方式,可以监听多个消息队列*/
    @RabbitListener(queues = "atguigu.news")
    public void receive(Book book){
        System.out.println("收到消息："+book);
    }

    @RabbitListener(queues = "atguigu")
    public void receive02(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
