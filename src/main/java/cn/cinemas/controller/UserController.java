package cn.cinemas.controller;

import cn.cinemas.bean.User;
import cn.cinemas.service.IUserService;
import cn.cinemas.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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


    @PostMapping("/email")
    public ModelAndView email(@RequestParam("email") String email, HttpServletRequest request) {
        userService.email(email, request);
        return new ModelAndView("/register");
    }

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
    @ResponseBody
    public Message register(User user) {
        System.out.println("处理注册请求 user :" + user);
        /*  userService.register(user, request);*/
        //return new ModelAndView("redirect:index");
        //  return new ModelAndView("login", "user", user);
        Message message = new Message();
       /*   message.setFlag(1);
            message.setMsg("账号或密码错误");

            message.setFlag(0);
            message.setMsg("成功");
        */
        message.setFlag(0);
        message.setMsg("成功");
        System.out.println(message);
        return message;
    }

    /*   @PostMapping("/login")
       public ModelAndView login(User user) {
           if (userService.login(user)) {
               return new ModelAndView("/user/index");
           } else {
               return new ModelAndView("/login", "msg", "账号或密码错误");
           }
       }*/

    /*  @PostMapping("/login")
      public ModelAndView login(User user) {
          System.out.println("user:" + user);
          return new ModelAndView("/user/index", "user", user);
      }*/
    @PostMapping("/login")
    @ResponseBody
    public Message login(User user) {
        System.out.println("处理登录请求 user:" + user);
        //return new ModelAndView("/user/index", "user", user);
        Message message = new Message();
       /*   message.setFlag(1);
            message.setMsg("账号或密码错误");

            message.setFlag(0);
            message.setMsg("成功");
        */
        message.setFlag(0);
        message.setMsg("成功");
        System.out.println(message);
        return message;
    }

    //@PostMapping("/login")
    public ModelAndView login(String email, String password) {
        //login的post
        System.out.println("email:" + email + " password:" + password);
     /*   if (userService.login(user)) {
            return new ModelAndView("/user/index");
        } else {
            return new ModelAndView("/login", "msg", "账号或密码错误");
        }*/
        //System.out.println("login:" + email + " " + password);
        // return new ModelAndView("");
        return new ModelAndView("/user/index");
    }


}
