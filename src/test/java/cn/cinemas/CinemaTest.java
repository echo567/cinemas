package cn.cinemas;

import cn.cinemas.dao.ICinemaDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 军辉
 * 2018-12-20 9:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CinemaTest {

    @Autowired
    private ICinemaDao cinemaDao;

    @Test
    public void getAllCinemaByScore() {
        System.out.println(cinemaDao.getAllCinemaByScore());
    }

    @Test
    public void fuzzyQuery() {
        System.out.println(cinemaDao.fuzzyQuery("新乡"));
    }
}
