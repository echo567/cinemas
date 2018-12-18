package cn.cinemas.daoimpl;

import cn.cinemas.bean.Movie;
import cn.cinemas.dao.IMovieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 军辉
 * 2018-12-18 17:27
 */
public class MovieDaoImpl implements IMovieDao {

    @Autowired
    private IMovieDao movieDao;


    @Override
    public Integer InsertMovie(Movie movie) {
        return movieDao.InsertMovie(movie);
    }

    @Override
    public Integer UpdateMovie(Movie movie) {
        return movieDao.UpdateMovie(movie);
    }

    @Override
    public Integer DeleteMovieBymovieId(Integer movieId) {
        return movieDao.DeleteMovieBymovieId(movieId);
    }

    @Override
    public Movie selectMovieByName(String name) {
        return movieDao.selectMovieByName(name);
    }

    @Override
    public List<Movie> selectAllMovieByPrice() {
        return movieDao.selectAllMovieByPrice();
    }

    @Override
    public List<Movie> selectAllMovieByScore() {
        return movieDao.selectAllMovieByPrice();
    }
}
