package cn.cinemas;


import cn.cinemas.bean.Movie;
import cn.cinemas.dao.IMovieDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * 军辉
 * 2018-12-18 17:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieTest {

    @Autowired
    private IMovieDao movieDao;

    @Test
    public void InsertMovie() {
        Date date = new Date();
        Movie movie = new Movie(100.0, 35.8, 8.5, "duration", date, "name", "movieType", "introduction", "prevue", "photo", "starring", "director", "language");
        System.out.println(movieDao.InsertMovie(movie));
        Movie movie2 = new Movie(200.0, 35.8, 7.5, "duration", date, "name", "movieType", "introduction", "prevue", "photo", "starring", "director", "language");
        System.out.println(movieDao.InsertMovie(movie2));
        Movie movie3 = new Movie(300.0, 35.8, 8.0, "duration", date, "name", "movieType", "introduction", "prevue", "photo", "starring", "director", "language");
        System.out.println(movieDao.InsertMovie(movie3));
    }

    @Test
    public void UpdateMovie() {
        Movie movie = movieDao.selectMovieByName("name");
        //System.out.println(movie);
        movie.setPrice(100.00);
        System.out.println(movieDao.UpdateMovie(movie));

    }

    @Test
    public void DeleteMovieBymovieId() {
        System.out.println(movieDao.DeleteMovieBymovieId(1));

    }

    @Test
    public void selectMovieByName() {


    }

    @Test
    public void selectAllMovieByPrice() {
        System.out.println(movieDao.selectAllMovieByPrice());

    }

    @Test
    public void selectAllMovieByScore() {

        System.out.println(movieDao.selectAllMovieByScore());
    }

    @Test
    public void selectAllMovieByDate() {

        System.out.println(movieDao.selectAllMovieByDate());
    }

    @Test
    public void selectNoteByMovieId() {

        System.out.println(movieDao.selectNoteByMovieId(1));
    }

    @Test
    public void update() {
        Movie movie = movieDao.selectMovieById(10);
        System.out.println(movie);
        movie.setPrice(40.5);
        System.out.println(movieDao.UpdateMovie(movie));
    }
}
