package cn.cinemas.batch;

import cn.cinemas.bean.Cinema;
import cn.cinemas.bean.Movie;
import org.apache.ibatis.jdbc.SQL;
import sun.awt.SunHints;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 军辉
 * 2018-12-22 20:34
 */
public class CinemaBatch {
    public String dynamicInsertCinema(Cinema cinema) {
        return new SQL() {{
            INSERT_INTO("tb_cinema");
            if (cinema.getName() != null) {
                VALUES("name", "#{name}");
            }
            if (cinema.getAddress() != null) {
                VALUES("address", "#{address}");
            }
            if (cinema.getScore() != null) {
                VALUES("score", "#{score}");
            }
            if (cinema.getPhone() != null) {
                VALUES("phone", "#{phone}");
            }
            if (cinema.getUpdateTime() != null) {
                VALUES("updateTime", "#{updateTime}");
            }
            if (cinema.getNote() != null) {
                VALUES("note", "#{note}");
            }
        }}.toString();
    }

    public String dynamicUpdateCinema(Cinema cinema) {
        return new SQL() {{
            UPDATE("tb_cinema");
            if (cinema.getName() != null) {
                SET("name=#{name}");
            }
            if (cinema.getScore() != null) {
                SET("score={#score}");
            }
            if (cinema.getAddress() != null) {
                SET("address={#address");
            }
            if (cinema.getPhone() != null) {
                SET("phone={#phone}");
            }
            if (cinema.getUpdateTime() != null) {
                SET("updateTime={#updateTime}");
            }
            if (cinema.getNote() != null) {
                SET("note=#{note}");
            }
            WHERE("cinemaId = #{cinemaId}");
        }}.toString();
    }

    public List<Movie> selectMovies(Integer cinemaId) {
        List<Movie> list = new ArrayList<>();

        return list;
    }
}
