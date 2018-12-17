package cn.cinemas.serviceimpl;

import cn.cinemas.service.IUserService;
import cn.cinemas.bean.User;
import cn.cinemas.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
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

    @Override
    public boolean login(User user) {
        User databaseUser = userDao.selectUserByEmail(user.getEmail());
        if (databaseUser != null) {
            if (user.getPassword().equals(databaseUser.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void register(User user, HttpServletRequest request) {
        user.setEmail(request.getSession().getAttribute("email").toString());
        userDao.insertUser(user);
        System.out.println(user);
    }

    @Override
    public void email(String email, HttpServletRequest request) {
        System.out.println("post email --------------" + email);
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            code += random.nextInt(10);
        }
        //sendEmail(email, code);
        request.getSession().setAttribute("code", code);
        request.getSession().setAttribute("email", email);
        System.out.println(code);
    }

    public void sendEmail(String email, String code) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        message.setTo(email);
        message.setSubject("主题：注册验证码");
        message.setText("你的验证码为:" + code);
        mailSender.send(message);
    }

    @Override
    public boolean registerPage(String code, HttpServletRequest request) {
        if (code.equals(request.getSession().getAttribute("code"))) {
            String email = request.getSession().getAttribute("email").toString();
            System.out.println(email);
            return true;
        } else {
            return false;
        }
    }
}
