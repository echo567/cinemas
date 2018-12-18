package cn.cinemas.dao;

import cn.cinemas.batch.MovieBatch;
import cn.cinemas.bean.Movie;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 军辉
 * 2018-12-18 14:30
 */
@Mapper
public interface IMovieDao {

    @InsertProvider(type = MovieBatch.class, method = "dynamicInsertMovie")
    public Integer InsertMovie(Movie movie);

    @UpdateProvider(type = MovieBatch.class, method = "dynamicUpdateMovie")
    public Integer UpdateMovie(Movie movie);

    @Delete("delete from tb_movie where movieId = #{movieId}")
    public Integer DeleteMovieBymovieId(Integer movieId);

    @Select("select * from tb_movie where name = #{name}")
    public Movie selectMovieByName(String name);

    /*
    按照票价从低到高排序
     */
    @Select("select * from tb_movie order by price")
    public List<Movie> selectAllMovieByPrice();

    /*
    按照电影评分从高到低排序
     */
    @Select("select * from tb_movie order by score desc")
    public List<Movie> selectAllMovieByScore();
}
