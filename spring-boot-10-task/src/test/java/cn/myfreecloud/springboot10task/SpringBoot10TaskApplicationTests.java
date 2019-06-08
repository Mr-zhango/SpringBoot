package cn.myfreecloud.springboot10task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot10TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {

        //创建简单邮件对象
        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject("通知-明年公司准备上市");
        message.setText("一下是上市计划,请大家悉知");
        message.setTo("zhangyang618@126.com");

        message.setFrom("969666310@qq.com");

        //发送邮件
        mailSender.send(message);
    }



    @Test
    public void test02() throws  Exception{
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //邮件设置
        helper.setSubject("通知-今晚开会啊!!!");
        /*设置加粗*/
        helper.setText("<b style='color:red'>今天 7:30 开会</b>",true);

        helper.setTo("zhangyang618@126.com");
        helper.setFrom("969666310@qq.com");

        //上传文件
        helper.addAttachment("1.jpg",new File("C:\\Users\\zhangyang\\Desktop\\java.png"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\zhangyang\\Desktop\\java2.png"));

        mailSender.send(mimeMessage);

    }

}
