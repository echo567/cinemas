package cn.junhui.cinemas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 军辉
 * 2018-12-17 10:41
 */
@Controller
public class AdminController {
    @GetMapping("/")
    public ModelAndView toLogin() {
        return new ModelAndView("login");
    }

    @GetMapping("/index")
    public ModelAndView toIndex() {
        return new ModelAndView("index");
    }
}
