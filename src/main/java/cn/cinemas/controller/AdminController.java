package cn.cinemas.controller;

import cn.cinemas.bean.User;
import cn.cinemas.serviceimpl.UserServiceImpl;
import cn.cinemas.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 军辉
 * 2018-12-17 10:41
 */
@RestController
public class AdminController {
    @Autowired
    private UserServiceImpl userService;


    @GetMapping("/")
    public ModelAndView toLogin() {
        return new ModelAndView("login");
    }

    @GetMapping("/index")
    public ModelAndView toIndex() {
        return new ModelAndView("index");
    }

    @GetMapping("/admin/login")
    public ModelAndView adminLogin() {
        return new ModelAndView("backpage/login");

    }

    @GetMapping("/admin/index")
    public ModelAndView adminIndex() {
        return new ModelAndView("backpage/listPage/index");

    }

    @PostMapping("/admin/login")
    public Message adminLogin(User user) {
        return userService.login(user);
    }
}
