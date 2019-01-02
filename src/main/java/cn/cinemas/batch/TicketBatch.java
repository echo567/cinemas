package cn.cinemas.batch;

import cn.cinemas.bean.Ticket;
import org.apache.ibatis.jdbc.SQL;

/**
 * 军辉
 * 2018-12-22 20:34
 */
public class TicketBatch {
    public String dynamicInsertTicket(Ticket tickte) {
        return new SQL() {{
            INSERT_INTO("tb_ticket");
            if (tickte.getUserId() != null) {
                VALUES("userId", "#{userId}");
            }
            if (tickte.getCinemaName() != null) {
                VALUES("cinemaName", "#{cinemaName}");
            }
            if (tickte.getMovieHall() != null) {
                VALUES("movieHall", "#{movieHall}");
            }
            if (tickte.getLanguage() != null) {
                VALUES("language", "#{language}");
            }
            if (tickte.getSession() != null) {
                VALUES("session", "#{session}");
            }

        }}.toString();
    }

/*
    public String dynamicUpdateTicket(Ticket ticket) {
        return new SQL() {{
            UPDATE("tb_ticket");
            if (ticket.) {
                SET("name=#{name}");
            }

            WHERE("cinemaId = #{cinemaId}");
        }}.toString();
    }
*/


}
