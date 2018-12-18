package cn.cinemas.controller;

import cn.cinemas.bean.User;
import cn.cinemas.service.IUserService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

  /*  @GetMapping("/emailpage")
    public ModelAndView emailPage() {
        return new ModelAndView("email");
    }*/

    @GetMapping("/registerpage")
    public ModelAndView registerPage() {
        return new ModelAndView("register");
    }

    @GetMapping("/toindex")
    public ModelAndView toIndex(){
        return new ModelAndView("/user/index");
    }


/*    @PostMapping("/email")
    public ModelAndView email(@RequestParam("email") String email, HttpServletRequest request) {
        userService.email(email, request);
        return new ModelAndView("/register");
    }*/

    /*    */

/*    @PostMapping("/registerpage")
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


    }*/

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
