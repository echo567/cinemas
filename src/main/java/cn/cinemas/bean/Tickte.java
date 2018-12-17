package cn.cinemas.bean;

import java.util.Date;

/**
 * 军辉
 * 2018-12-15 16:42
 */
public class Tickte {
    private Integer ticketId;
    private String cinemaName;
    private String movieHall;
    private String language;
    private String session;
    private double price;
    private int row;
    private int column;
    private String note;
    private Date createTime;
    private Date updateTime;

    public Tickte() {

    }

    public Integer getTicketId() {
        return ticketId;
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
        return "Tickte{" +
                "ticketId=" + ticketId +
                ", cinemaName='" + cinemaName + '\'' +
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
