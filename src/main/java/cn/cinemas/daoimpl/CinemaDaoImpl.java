package cn.cinemas.daoimpl;

import cn.cinemas.bean.Cinema;
import cn.cinemas.bean.Movie;
import cn.cinemas.dao.ICinemaDao;
import cn.cinemas.dao.IMovieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:06
 */
public class CinemaDaoImpl {
    /*@Autowired
    private ICinemaDao cinemaDao;

    @Autowired
    private IMovieDao movieDao;

    @Override
    public List<Cinema> getAllCinemaByScore() {
        return cinemaDao.getAllCinemaByScore();
    }

    @Override
    public List<Cinema> getTwoCinemas() {
        return cinemaDao.getTwoCinemas();
    }

    @Override
    public Integer insertCinema(Cinema cinema) {
        return cinemaDao.insertCinema(cinema);
    }

    @Override
    public Integer updateCinems(Cinema cinema) {
        return cinemaDao.updateCinems(cinema);
    }

    @Override
    public List<Cinema> fuzzyQuery(String name) {
        return cinemaDao.fuzzyQuery(name);
    }

    @Override
    public Cinema selectCinemaByCinemaId(Integer cinemaId) {
        return cinemaDao.selectCinemaByCinemaId(cinemaId);
    }

    @Override
    public String selectNoteByCinemaId(Integer cinemaId) {
        return cinemaDao.selectNoteByCinemaId(cinemaId);
    }
*/
 /*   @Override
    public List<Movie> selectMoviesByNote(Integer cinemaId) {
        String[] movieIds = cinemaDao.selectNoteByCinemaId(cinemaId).split(",");
        System.out.println("影院上映电影的数量："+movieIds.length);
        List<Movie> lists = new ArrayList<>();
        for (int i = 0; i < movieIds.length; i++) {
            lists.add(movieDao.selectMovieById(Integer.parseInt(movieIds[i])));
        }
        return lists;
    }*/
}
