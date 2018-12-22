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
    按照评分从高到底排序
     */
    @Select("select * from tb_cinema order by score desc")
    public List<Cinema> getAllCinemaByScore();

    /*
    按照影院评分从高到低的前两位影院
     */
    @Select("select * from tb_cinema order by score desc limit 2")
    public List<Cinema> getTwoCinemas();
}
