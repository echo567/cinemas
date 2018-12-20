package cn.cinemas.serviceimpl;

import cn.cinemas.bean.Cinema;
import cn.cinemas.dao.ICinemaDao;
import cn.cinemas.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:40
 */
@Service
public class CinemaServiceImpl implements ICinemaService {
    @Autowired
    private ICinemaDao cinemaDao;

    @Override
    public List<Cinema> getCinemaListByScore() {
        return cinemaDao.getAllCinemaByScore();
    }
}
