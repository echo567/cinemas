package cn.cinemas.controller;

import cn.cinemas.bean.Cinema;
import cn.cinemas.bean.Movie;
import cn.cinemas.bean.User;
import cn.cinemas.dao.ICinemaDao;
import cn.cinemas.dao.IMovieDao;
import cn.cinemas.service.ICinemaService;
import cn.cinemas.service.IMovieService;
import cn.cinemas.service.IUserService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;
import java.util.List;

/**
 * 军辉
 * 2018-12-16 9:56
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUserService userService;

    @Autowired
    private IMovieService movieService;

    @Autowired
    private ICinemaService cinemaService;


    @GetMapping("/")
    public ModelAndView login() {
        return new ModelAndView("login");
    }


    @GetMapping("/registerpage")
    public ModelAndView registerPage() {
        return new ModelAndView("register");
    }

    @GetMapping("/toindex")
    public ModelAndView toIndex(Model model) {
        List<Movie> alreadyByScore = movieService.alreadyByScore();

        List<Movie> notReleased = movieService.notReleased();
        List<Cinema> hotCinemas = cinemaService.getTwoCinemas();
        List<Movie> all = movieService.listByDate();
        List<Movie> alreadyByBoxOffice = movieService.alreadyByBoxOffice();


        model.addAttribute("already", alreadyByScore);
        model.addAttribute("notReleased", notReleased);
        model.addAttribute("hotCinemas", hotCinemas);
        model.addAttribute("all", all);
        model.addAttribute("boxOffice", alreadyByBoxOffice);

        return new ModelAndView("/user/index");
    }


    @GetMapping("/detailcinema")
    public ModelAndView detailcinema() {
        return new ModelAndView("/detail/detailcinema");
    }

    /*转移到 CinemaController下面了
    @GetMapping("/detailfilm")
    public ModelAndView detailfilm() {
        return new ModelAndView("/detail/detailfilm");
    }*/

    @GetMapping("/index")
    public ModelAndView index() { return new ModelAndView("/backpage/listPage/index"); }

    @GetMapping("/backindex")
    public ModelAndView backindex() { return new ModelAndView("/backpage/listPage/index"); }

    @GetMapping("/backoder")
    public ModelAndView backoder() { return new ModelAndView("/backpage/listPage/backoder"); }

    @GetMapping("/backfilm")
    public ModelAndView backfilm() { return new ModelAndView("/backpage/listPage/backfilm"); }


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
