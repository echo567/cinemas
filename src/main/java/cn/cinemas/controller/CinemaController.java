package cn.cinemas.controller;

import cn.cinemas.bean.Cinema;
import cn.cinemas.dao.ICinemaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private ICinemaDao cinemaDao;

    @Autowired
    private HttpSession session;



    @GetMapping("/tocinema")
    public ModelAndView toCinema() {
        List<Cinema> cinemaList = cinemaDao.getAllCinemaByScore();

        return new ModelAndView("/user/cinema", "list", cinemaList);
    }

}
