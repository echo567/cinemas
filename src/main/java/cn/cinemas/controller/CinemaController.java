package cn.cinemas.controller;

import cn.cinemas.bean.Cinema;
import cn.cinemas.bean.Movie;
import cn.cinemas.dao.ICinemaDao;
import cn.cinemas.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:39
 */
@RestController
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    private ICinemaService cinemaService;


    /*
    跳转到影院界面
     */
    @GetMapping("/tocinema")
    public ModelAndView toCinema() {
        List<Cinema> cinemaList = cinemaService.getCinemaListByScore();

        return new ModelAndView("/user/cinema", "list", cinemaList);
    }

    /*
    跳转到影院详情页面
     */
    @GetMapping("/detailcinema")
    public ModelAndView detailcinema(@RequestParam("cinemaId") Integer cinemaId, Model model) {
        System.out.println("影院id" + cinemaId);
        Cinema cinema = cinemaService.selectCinemaByCinemaId(cinemaId);
        List<Movie> moviesList = cinemaService.getMoviesByCinemaId(cinemaId);
        model.addAttribute("cinema", cinema);
        model.addAttribute("movies", moviesList);
        return new ModelAndView("/detail/detailcinema");
    }

}
