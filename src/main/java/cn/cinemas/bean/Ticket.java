package cn.cinemas.bean;

import java.util.Date;

/**
 * 军辉
 * 2018-12-15 16:42
 */
public class Ticket {
    private Integer ticketId;
    private Integer userId;
    private Integer cinemaId;
    private Integer movieId;
    private String cinemaName;
    private String movieName;
    private String movieHall;
    private String language;
    private String session;
    private double price;
    private int row;
    private int column;
    private String note;
    private Date createTime;
    private Date updateTime;

    public Ticket() {

    }

    public Ticket(Integer userId, String cinemaName, String movieHall, String language, String session, double price) {
        this.userId = userId;
        this.cinemaName = cinemaName;
        this.movieHall = movieHall;
        this.language = language;
        this.session = session;
        this.price = price;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getmovieName() {
        return movieName;
    }

    public void setmovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getMovieHall() {
        return movieHall;
    }

    public void setMovieHall(String movieHall) {
        this.movieHall = movieHall;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", userId=" + userId +
                ", cinemaId=" + cinemaId +
                ", movieId=" + movieId +
                ", cinemaName='" + cinemaName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieHall='" + movieHall + '\'' +
                ", language='" + language + '\'' +
                ", session='" + session + '\'' +
                ", price=" + price +
                ", row=" + row +
                ", column=" + column +
                ", note='" + note + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
