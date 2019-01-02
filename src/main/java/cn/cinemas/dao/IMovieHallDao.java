package cn.cinemas.dao;

import cn.cinemas.batch.TicketBatch;
import cn.cinemas.bean.MovieHall;
import cn.cinemas.bean.Ticket;
import cn.cinemas.util.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 军辉
 * 2019-01-02 17:04
 */
@Mapper
public interface IMovieHallDao {
    @Select("select * from tb_moviehall where movieId = #{movieId} and cinemaId = #{cinemaId}")
    public List<MovieHall> getMovieHallByMovieId(@Param("cinemaId") Integer cinemaId, @Param("movieId") Integer movieId);
}
