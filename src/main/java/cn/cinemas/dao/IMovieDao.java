package cn.cinemas.dao;

import cn.cinemas.batch.MovieBatch;
import cn.cinemas.bean.Movie;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * 军辉
 * 2018-12-18 14:30
 */
@Mapper
public interface IMovieDao {

    @InsertProvider(type = MovieBatch.class, method = "dynamicInsertMovie")
    public Integer InsertMovice(Movie movie);
}
