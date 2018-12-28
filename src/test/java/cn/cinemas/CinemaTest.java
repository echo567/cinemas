package cn.cinemas;

import cn.cinemas.bean.Movie;
import cn.cinemas.dao.ICinemaDao;
import cn.cinemas.dao.IMovieDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CinemaTest {

    @Autowired
    private ICinemaDao cinemaDao;
    @Autowired
    private IMovieDao movieDao;

    @Test
    public void getAllCinemaByScore() {
        System.out.println(cinemaDao.getAllCinemaByScore());
    }

    @Test
    public void fuzzyQuery() {
        System.out.println(cinemaDao.fuzzyQuery("新乡"));
    }

    @Test
    public void selectNoteByCinemaId() {
        //String cinemaId[] =cinemaDao.selectNoteByCinemaId(2);
        String[] movieIds = cinemaDao.selectNoteByCinemaId(2).split(",");
        System.out.println("影院上映电影的数量：" + movieIds.length);
        List<Movie> lists = new ArrayList<>();
        for (int i = 0; i < movieIds.length; i++) {
            lists.add(movieDao.selectMovieById(Integer.parseInt(movieIds[i])));
        }

        Iterator it = lists.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

 /*   @Test
    public void selectMovieByNote() {

      List<Movie> lists = cinemaDao.selectMoviesByNote(2);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }*/
}
