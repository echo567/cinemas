package cn.cinemas.daoimpl;

import cn.cinemas.bean.Cinema;
import cn.cinemas.dao.ICinemaDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:06
 */
public class CinemaDaoImpl implements ICinemaDao {
    @Autowired
    private ICinemaDao cinemaDao;

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
}
