package cn.junhui.cinemas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.Valid;

/**
 * 军辉
 * 2018-12-16 9:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("qq")
public class EmailTest {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String Sender;

    @Test
    public void sendEmailTest() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        //message.setTo("1329148394@qq.com");
        message.setTo("17639403765@163.com");
        message.setSubject("主题：邮件测试");
        message.setText("邮件测试内容");
        mailSender.send(message);
    }
}
