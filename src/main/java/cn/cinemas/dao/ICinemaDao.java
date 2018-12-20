package cn.cinemas.dao;

import cn.cinemas.bean.Cinema;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:05
 */
@Mapper
public interface ICinemaDao {

    /*
    按照评分从低到高排序
     */
    @Select("select * from tb_cinema order by score desc")
    public List<Cinema> getAllCinemaByScore();
}
