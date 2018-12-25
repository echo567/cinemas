package cn.cinemas.dao;

import cn.cinemas.batch.CinemaBatch;
import cn.cinemas.bean.Cinema;
import org.apache.ibatis.annotations.*;

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

    /*
    增加影院
     */
    @InsertProvider(type = CinemaBatch.class, method = "dynamicInsertCinema")
    public Integer insertCinema(Cinema cinema);

    /*
    修改影院资料
     */
    @UpdateProvider(type = CinemaBatch.class, method = "dynamicUpdateCinema")
    public Integer updateCinems(Cinema cinema);

    /*
    根据影院名称进行模糊查询
    select name from tb_cinema where LOCATE('影',name);
     */
    @Select("select * from tb_cinema where LOCATE(#{name},name);")
    public List<Cinema> fuzzyQuery(@Param("name") String name);
}
