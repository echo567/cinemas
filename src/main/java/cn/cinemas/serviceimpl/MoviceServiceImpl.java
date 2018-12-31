package cn.cinemas.serviceimpl;

import cn.cinemas.bean.Cinema;
import cn.cinemas.bean.Movie;
import cn.cinemas.dao.ICinemaDao;
import cn.cinemas.dao.IMovieDao;
import cn.cinemas.service.IMovieService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 军辉
 * 2018-12-19 16:57
 */
@Service
public class MoviceServiceImpl implements IMovieService {
    @Autowired
    private IMovieDao movieDao;
    @Autowired
    private ICinemaDao cinemaDao;


    @Override
    public List<Movie> listByDate() {
        List<Movie> movieListByDate = movieDao.selectAllMovieByDate();
        //   session.setAttribute("list", movieListByDate);
        return movieListByDate;
        // return MessageUtil.Succees("movieListByDate");
    }

/*    @Override
    public List<Movie> listAlready() {
        List<Movie> alreadyReleased = movieDao.alreadyReleased();
        //   session.setAttribute("list", movieListByDate);
        return alreadyReleased;
        // return MessageUtil.Succees("movieListByDate");
    }*/

    @Override
    public List<Movie> alreadyByScore() {
        List<Movie> alreadyByScore = movieDao.alreadyByScore();
        return alreadyByScore;
    }

    @Override
    public List<Movie> alreadyByBoxOffice() {
        List<Movie> alreadyByBoxOffice = movieDao.alreadyByBoxOffice();
        return alreadyByBoxOffice;
    }

    @Override
    public List<Movie> notReleased() {
        return movieDao.notReleased();
    }

    @Override
    public Movie selectMovieByMovieId(Integer movieId) {
        return movieDao.selectMovieById(movieId);
    }

    @Override
    public List<Cinema> selectCinemasByMovieId(Integer movieId) {
        List<Cinema> cinemaList = new ArrayList<>();
        System.out.println("查询电影id：" + movieId);
        String str = movieDao.selectNoteByMovieId(movieId);
        if (str == null || str.length() == 0) {
        } else {
            String cinemaIds[] = movieDao.selectNoteByMovieId(movieId).split(",");
            for (int i = 0; i < cinemaIds.length; i++) {
                cinemaList.add(cinemaDao.selectCinemaByCinemaId(Integer.parseInt(cinemaIds[i])));
            }
        }
        return cinemaList;
    }

    @Override
    public Message getAllMoviesToJson() {
        List<Movie> movieList = movieDao.selectAllMovieByDate();
        return MessageUtil.objectMessageCountSuccess(movieList, movieList.size(), "数据查询成功");
    }

    @Override
    public Message insertMovie(Movie movie) {
        System.out.println("添加的电影的信息：" + movie);
        if (movieDao.InsertMovie(movie) > 0) {
            return MessageUtil.Succees("添加成功");
        } else {
            return MessageUtil.Fail("添加失败");
        }

    }

    @Override
    public Message updateMovie(Movie movie) {
        System.out.println("修改电影的信息：" + movie);
        if (movieDao.UpdateMovie(movie) > 0) {
            return MessageUtil.Succees("添加成功");
        } else {
            return MessageUtil.Fail("添加失败");
        }
    }
}
