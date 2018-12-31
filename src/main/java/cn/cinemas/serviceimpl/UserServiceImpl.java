package cn.cinemas.serviceimpl;

import cn.cinemas.service.IUserService;
import cn.cinemas.bean.User;
import cn.cinemas.dao.IUserDao;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * 军辉
 * 2018-12-16 9:55
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String Sender;

    @Autowired
    private IUserDao userDao;

    @Autowired
    private HttpSession session;

    @Override
    public Message login(User user) {
        User databaseUser = userDao.selectUserByEmail(user.getEmail());
        if (databaseUser != null) {
            if (user.getPassword().equals(databaseUser.getPassword())) {
                session.setAttribute("user", databaseUser);
                System.out.println("session:" + session.getAttribute("user"));
                return MessageUtil.Succees("登录成功");
            }
        }
        return MessageUtil.Fail("账号或密码错误");
    }

    @Override
    public Message register(User user) {
        //user.setEmail(request.getSession().getAttribute("email").toString());
        if (userDao.selectUserByEmail(user.getEmail()) != null) {
            return MessageUtil.Fail("注册失败，账号已存在");
        }

        if (userDao.insertUser(user) > 0) {
            return MessageUtil.Succees("注册成功");
        } else {
            return MessageUtil.Fail("注册失败，原因不知");
        }


    }

    /*@Override
    public void email(String email) {
         System.out.println("post email --------------" + email);
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            code += random.nextInt(10);
        }
        //sendEmail(email, code);
        //request.getSession().setAttribute("code", code);
        //request.getSession().setAttribute("email", email);
        System.out.println(code);
    }*/

    public void sendEmail(String email, String code) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        message.setTo(email);
        message.setSubject("主题：注册验证码");
        message.setText("你的验证码为:" + code);
        mailSender.send(message);
    }


}
