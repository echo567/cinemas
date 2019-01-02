package cn.cinemas.service;

import cn.cinemas.bean.Ticket;
import cn.cinemas.util.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * 军辉
 * 2019-01-02 17:21
 */
@Service
public interface IMovieHallService {
    public Message getMovieHallByMovieId(Integer cinemaId, Integer movieId);

}
