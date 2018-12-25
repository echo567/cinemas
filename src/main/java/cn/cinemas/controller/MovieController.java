package cn.cinemas.controller;


import cn.cinemas.bean.Movie;
import cn.cinemas.dao.IMovieDao;
import cn.cinemas.service.IMovieService;
import cn.cinemas.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 军辉
 * 2018-12-19 17:04
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping("/listByDate")
    public List<Movie> MovieListByDate() {
        return movieService.listByDate();
    }

    @GetMapping("/tolist")
    public ModelAndView toList() {
        List<Movie> movieList = movieService.alreadyByScore();
        return new ModelAndView("/user/list", "list", movieList);
    }

    @GetMapping("/tofilm")
    public ModelAndView toFilm() {
        List<Movie> movieList = movieService.listByDate();
        return new ModelAndView("/user/film", "list", movieList);
    }
}
