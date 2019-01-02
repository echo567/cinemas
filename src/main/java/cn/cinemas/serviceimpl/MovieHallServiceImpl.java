package cn.cinemas.serviceimpl;

import cn.cinemas.bean.MovieHall;
import cn.cinemas.dao.IMovieHallDao;
import cn.cinemas.service.IMovieHallService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 军辉
 * 2019-01-02 20:12
 */
@Service
public class MovieHallServiceImpl implements IMovieHallService {

    @Autowired
    private IMovieHallDao movieHallDao;

    @Override
    public Message getMovieHallByMovieId(Integer cinemaId, Integer movieId) {
        List<MovieHall> movieHallList = movieHallDao.getMovieHallByMovieId(cinemaId, movieId);
        //System.out.println("影院id：" + cinemaId + " 电影id：" + movieId);
        //System.out.println("查询到的放映厅：" + movieHallList);
        if (movieHallList == null) {
            return MessageUtil.objectMessageFail(movieHallList, "暂时没有放映厅播放此电影");
        } else {
            return MessageUtil.objectMessageSuccess(movieHallList, "查询放映厅成功");
        }

    }
}
