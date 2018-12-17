package cn.cinemas.controller;

import cn.cinemas.bean.User;
import cn.cinemas.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;

/**
 * 军辉
 * 2018-12-16 9:56
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUserService userService;

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
        userService.email(email, request);
        return new ModelAndView("/register");
    }

    /*    */

    @PostMapping("/registerpage")
    public ModelAndView registerpage(@RequestParam("code") String code, HttpServletRequest request) {

        if (code != null) {
            if (userService.registerPage(code, request)) {
                //动态码一致
                return new ModelAndView("register");
            } else {
                return new ModelAndView("email", "msg", "验证码错误");
            }
        } else {
            return new ModelAndView("email", "msg", "邮箱不能为空");
        }


    }

    @PostMapping("/register")
    public ModelAndView register(User user, HttpServletRequest request) {
        userService.register(user, request);
        //return new ModelAndView("redirect:index");
        return new ModelAndView("login", "user", user);
    }

    @PostMapping("/login")
    public ModelAndView login(User user) {
        if (userService.login(user)) {
            return new ModelAndView("/user/index");
        } else {
            return new ModelAndView("/login", "msg", "账号或密码错误");
        }
    }
}
