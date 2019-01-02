package cn.cinemas.batch;

import cn.cinemas.bean.Movie;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.jdbc.SQL;

/**
 * 军辉
 * 2018-12-18 14:32
 */
public class MovieBatch {

    public String dynamicInsertMovie(Movie movie) {
        return new SQL() {
            {
                INSERT_INTO("tb_movie");
                if (movie.getPrice() != null) {
                    VALUES("price", "#{price}");
                }
                if (movie.getBoxOffice() != null) {
                    VALUES("boxOffice", "#{boxOffice}");
                }
                if (movie.getScore() != null) {
                    VALUES("score", "#{score}");
                }
                if (movie.getDuration() != null) {
                    VALUES("duration", "#{duration}");
                }
                if (movie.getDate() != null) {
                    VALUES("date", "#{date}");
                }
                if (movie.getName() != null) {
                    VALUES("name", "#{name}");
                }
                if (movie.getMovieType() != null) {
                    VALUES("movieType", "#{movieType}");
                }
                if (movie.getIntroduction() != null) {
                    VALUES("introduction", "#{introduction}");
                }
                if (movie.getPrevue() != null) {
                    VALUES("prevue", "#{prevue}");
                }
                if (movie.getPhoto() != null) {
                    VALUES("photo", "#{photo}");
                }
                if (movie.getStarring() != null) {
                    VALUES("starring", "#{starring}");
                }
                if (movie.getDirector() != null) {
                    VALUES("director", "#{director}");
                }
                if (movie.getLanguage() != null) {
                    VALUES("language", "#{language}");
                }
                if (movie.getNote() != null) {
                    VALUES("note", "#{note}");
                }
                if (movie.getUpdateTime() != null) {
                    VALUES("updateTime", "#{updateTime}");
                }
            }
        }.toString();
    }

    public String dynamicUpdateMovie(Movie movie) {
        return new SQL() {{
            UPDATE("tb_movie");
            if (movie.getPrice() != null) {
                SET("price=#{price}");
            }
            if (movie.getBoxOffice() != null) {
                SET("boxOffice=#{boxOffice}");
            }
            if (movie.getScore() != null) {
                SET("score=#{score}");
            }
            if (movie.getDuration() != null) {
                SET("duration=#{duration}");
            }
            if (movie.getDate() != null) {
                SET("date=#{date}");
            }
            if (movie.getName() != null) {
                SET("name=#{name}");
            }
            if (movie.getMovieType() != null) {
                SET("movieType=#{movieType}");
            }
            if (movie.getIntroduction() != null) {
                SET("introduction=#{introduction}");
            }
            if (movie.getPrevue() != null) {
                SET("prevue=#{prevue}");
            }
            if (movie.getPhoto() != null) {
                SET("photo=#{photo}");
            }
            if (movie.getStarring() != null) {
                SET("starring=#{starring}");
            }
            if (movie.getDirector() != null) {
                SET("director=#{director}");
            }
            if (movie.getLanguage() != null) {
                SET("language=#{language}");
            }
            if (movie.getNote() != null) {
                SET("note=#{note}");
            }
            if (movie.getUpdateTime() != null) {
                SET("updateTime=#{updateTime}");
            }
            WHERE("movieId=#{movieId}");


        }}.toString();

    }
}
