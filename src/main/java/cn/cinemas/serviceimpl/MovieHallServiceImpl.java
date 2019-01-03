package cn.cinemas.serviceimpl;

import cn.cinemas.bean.Cinema;
import cn.cinemas.bean.Movie;
import cn.cinemas.bean.MovieHall;
import cn.cinemas.dao.ICinemaDao;
import cn.cinemas.dao.IMovieDao;
import cn.cinemas.dao.IMovieHallDao;
import cn.cinemas.service.IMovieHallService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 军辉
 * 2019-01-02 20:12
 */
@Service
public class MovieHallServiceImpl implements IMovieHallService {

    @Autowired
    private IMovieHallDao movieHallDao;
    @Autowired
    private IMovieDao movieDao;
    @Autowired
    private ICinemaDao cinemaDao;

    @Override
    public Message getMovieHallByMovieId(Integer cinemaId, Integer movieId) {
        List<MovieHall> movieHallList = movieHallDao.getMovieHallByMovieId(cinemaId, movieId);
        List<Movie> movieList = new ArrayList<>();
        List<Cinema> cinemaList = new ArrayList<>();
        for (int i = 0; i < movieHallList.size(); i++) {
            movieList.add(movieDao.selectMovieById(movieHallList.get(i).getMovieId()));
            cinemaList.add(cinemaDao.selectCinemaByCinemaId(movieHallList.get(i).getCinemaId()));
        }
        for (int i = 0; i < movieHallList.size(); i++) {
            movieHallList.get(i).setMovieName(movieList.get(i).getName());
            movieHallList.get(i).setNote(movieList.get(i).getPrice() + "");
            movieHallList.get(i).setCinemaName(cinemaList.get(i).getName());
        }
        //System.out.println("影院id：" + cinemaId + " 电影id：" + movieId);
        //System.out.println("查询到的放映厅：" + movieHallList);
        if (movieHallList == null) {
            return MessageUtil.objectMessageFail(movieHallList, "暂时没有放映厅播放此电影");
        } else {
            return MessageUtil.objectMessageSuccess(movieHallList, "查询放映厅成功");
        }

    }
}
