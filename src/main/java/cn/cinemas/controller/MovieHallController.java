package cn.cinemas.controller;


import cn.cinemas.service.IMovieHallService;
import cn.cinemas.util.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 军辉
 * 2019-01-02 20:16
 */
@RestController
public class MovieHallController {

    @Autowired
    private IMovieHallService movieHallService;

    @GetMapping("/getmovieHall")
    public Message selectMovieHall(@Param("movieId") Integer movieId, @Param("cinemaId") Integer cinemaId) {
        return movieHallService.getMovieHallByMovieId(cinemaId, movieId);
    }
}
