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

    @Select("select * from tb_movie where movieId = #{movieId}")
    public Movie selectMovieById(Integer movieId);

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

    /*
    按照上映日期从前到后
     */
    @Select("select * from tb_movie order by date")
    public List<Movie> selectAllMovieByDate();

    /*
    已上映的电影(评分从高到低 前五)
     */
    @Select("select * from tb_movie where date < now() order by score desc limit 5")
    public List<Movie> alreadyByScore();

    /*
    未上映的电影
    */
    @Select("select * from tb_movie where date > now()")
    public List<Movie> notReleased();

    /*
    已上映的电影(评分从高到低)
     */
    @Select("select * from tb_movie where date < now() order by boxOffice desc limit 5")
    public List<Movie> alreadyByBoxOffice();

    /*
    查询电影上映的电影院
     */
    @Select("select note from tb_movie where movieId = #{movieId}")
    public String selectNoteByMovieId(Integer movieId);
}
