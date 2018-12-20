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
}
