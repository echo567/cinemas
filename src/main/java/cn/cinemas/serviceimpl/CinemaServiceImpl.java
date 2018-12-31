package cn.cinemas.serviceimpl;

import cn.cinemas.bean.Cinema;
import cn.cinemas.bean.Movie;
import cn.cinemas.dao.ICinemaDao;
import cn.cinemas.dao.IMovieDao;
import cn.cinemas.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:40
 */
@Service
public class CinemaServiceImpl implements ICinemaService {
    @Autowired
    private ICinemaDao cinemaDao;
    @Autowired
    private IMovieDao movieDao;

    @Override
    public List<Cinema> getCinemaListByScore() {
        return cinemaDao.getAllCinemaByScore();
    }

    @Override
    public Cinema selectCinemaByCinemaId(Integer cinemaId) {
        return cinemaDao.selectCinemaByCinemaId(cinemaId);
    }

    @Override
    public List<Cinema> getTwoCinemas() {
        return cinemaDao.getTwoCinemas();
    }

    @Override
    public List<Movie> getMoviesByCinemaId(Integer cinemaId) {
        List<Movie> lists = new ArrayList<>();
        String str = cinemaDao.selectNoteByCinemaId(cinemaId);
        if (str.length() != 0) {
            String[] movieIds = str.split(",");
            for (int i = 0; i < movieIds.length; i++) {
                lists.add(movieDao.selectMovieById(Integer.parseInt(movieIds[i])));
            }
        }
        //System.out.println("影院上映电影的数量：" + movieIds.length);

        return lists;
    }
}
