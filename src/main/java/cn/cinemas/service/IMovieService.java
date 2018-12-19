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

    public List<Movie> listByDate();
}
