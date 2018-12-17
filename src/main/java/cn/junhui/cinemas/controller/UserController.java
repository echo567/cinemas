package cn.junhui.cinemas.controller;

import cn.junhui.cinemas.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * 军辉
 * 2018-12-16 9:56
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String Sender;

    @GetMapping("/")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @GetMapping("/emailpage")
    public ModelAndView emailPage() {
        return new ModelAndView("email");
    }

/*    @GetMapping("/registerpage")
    public ModelAndView registerPage() {
        return new ModelAndView("register");
    }*/


    @PostMapping("/email")
    public ModelAndView email(@RequestParam("email") String email, HttpServletRequest request) {
        System.out.println("post email --------------" + email);
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            code += random.nextInt(10);
        }
        //request.setAttribute("code", code);
        request.getSession().setAttribute("code", code);
        request.getSession().setAttribute("email", email);
        System.out.println(code);

        return new ModelAndView("/register");
    }

/*    public void sendEmail(String email, String code) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        message.setTo(email);
        message.setSubject("主题：注册验证码");
        message.setText("你的验证码为:" + code);
        mailSender.send(message);
    }*/

    @PostMapping("/registerpage")
    public ModelAndView registerpage(@RequestParam("code") String code, HttpServletRequest request) {
        if (code.equals(request.getSession().getAttribute("code"))) {
            String email = request.getSession().getAttribute("email").toString();
            System.out.println(email);
        }
        return new ModelAndView("register");
    }

    @PostMapping("/register")
    public ModelAndView register(User user, HttpServletRequest request) {
        user.setEmail(request.getSession().getAttribute("email").toString());
        System.out.println(user);
        //return new ModelAndView("redirect:index");
        return new ModelAndView("/index", "user", user);
    }
}
