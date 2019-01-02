package cn.cinemas;

import cn.cinemas.bean.MovieHall;
import cn.cinemas.bean.Ticket;
import cn.cinemas.bean.User;
import cn.cinemas.dao.IMovieHallDao;
import cn.cinemas.dao.ITicketDao;
import cn.cinemas.dao.IUserDao;
import cn.cinemas.service.IMovieHallService;
import cn.cinemas.service.ITicketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * 军辉
 * 2018-12-15 16:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketTest {

    @Autowired
    private ITicketDao ticketDao;

    @Autowired
    private IMovieHallDao movieHallDao;

    @Test
    public void InsertTicket() {
        Ticket ticket = new Ticket(1, "sad", "sad", "sad", "sad", 12.3);

        System.out.println(ticketDao.InsertTicket(ticket));
    }

    @Test
    public void delectTicket() {
        System.out.println(ticketDao.deleteTicketByTicketId(1));
    }

    @Test
    public void selectMovieHall() {
        List<MovieHall> movieHallList = movieHallDao.getMovieHallByMovieId(1, 1);
        for (int i = 0; i < movieHallList.size(); i++) {
            System.out.println(movieHallList.get(i));
        }
    }

}
