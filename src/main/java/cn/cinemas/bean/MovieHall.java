package cn.cinemas.bean;

import java.util.Date;

/**
 * 军辉
 * 2018-12-17 21:14
 */
public class MovieHall {
    private Integer hallId;
    private Integer cinemaId;//外键
    private Integer movieId;
    private String cinemaName;
    private String movieName;
    private String status;
    private Integer seatId;
    private String session;
    private Integer amount;
    private Integer column;
    private Integer row;
    private String note;
    private Date updateTime;
    private Date createTime;

    public MovieHall() {
    }

    public MovieHall(String status, Integer seatId, String session, Integer amount, Integer column, Integer row, String note) {
        this.status = status;
        this.seatId = seatId;
        this.session = session;
        this.amount = amount;
        this.column = column;
        this.row = row;
        this.note = note;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        return "MovieHall{" +
                "hallId=" + hallId +
                ", cinemaId=" + cinemaId +
                ", movieId=" + movieId +
                ", cinemaName='" + cinemaName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", status='" + status + '\'' +
                ", seatId=" + seatId +
                ", session='" + session + '\'' +
                ", amount=" + amount +
                ", column=" + column +
                ", row=" + row +
                ", note='" + note + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                '}';
    }
}
