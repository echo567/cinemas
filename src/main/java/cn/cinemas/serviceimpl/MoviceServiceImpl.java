package cn.cinemas.serviceimpl;

import cn.cinemas.bean.Movie;
import cn.cinemas.dao.IMovieDao;
import cn.cinemas.service.IMovieService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 军辉
 * 2018-12-19 16:57
 */
@Service
public class MoviceServiceImpl implements IMovieService {
    @Autowired
    private IMovieDao movieDao;


    @Override
    public List<Movie> listByDate() {
        List<Movie> movieListByDate = movieDao.selectAllMovieByDate();
        //   session.setAttribute("list", movieListByDate);
        return movieListByDate;
        // return MessageUtil.Succees("movieListByDate");
    }
}
