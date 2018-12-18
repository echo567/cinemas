package cn.cinemas.controller;

import cn.cinemas.bean.User;
import cn.cinemas.service.IUserService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * 军辉
 * 2018-12-16 9:56
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public ModelAndView login() {
        return new ModelAndView("login");
    }


    @GetMapping("/registerpage")
    public ModelAndView registerPage() {
        return new ModelAndView("register");
    }

    @GetMapping("/toindex")
    public ModelAndView toIndex() {
        return new ModelAndView("/user/index");
    }

    @GetMapping("/tofilm")
    public ModelAndView toFilm() {
        return new ModelAndView("/user/film");
    }

    @GetMapping("/tocinema")
    public ModelAndView toCinema() {
        return new ModelAndView("/user/cinema");
    }

    @GetMapping("/tolist")
    public ModelAndView toList() {
        return new ModelAndView("/user/list");
    }


    @PostMapping("/register")
    public Message register(User user) {

        System.out.println("处理注册请求 user :" + user);
        return userService.register(user);

    }


    /*
    处理登录请求，返回json形式的Message对象
    0为成功
    1为失败
     */
    @PostMapping("/login")
    public Message login(User user) {
        return userService.login(user);
    }


}
