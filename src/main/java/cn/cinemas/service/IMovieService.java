package cn.cinemas.service;

import cn.cinemas.bean.Movie;
import cn.cinemas.util.Message;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 军辉
 * 2018-12-19 16:57
 */

public interface IMovieService {

    /*
    查询全部电影按上映日期从前到后
     */
    public List<Movie> listByDate();

    /*
    查询所有以上已上映的电影
     */
    public List<Movie> listAlready();
}
