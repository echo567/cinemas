package cn.cinemas.bean;

import java.util.Date;

/**
 * 军辉
 * 2018-12-17 21:14
 */
public class MovieHall {
    private Integer hallId;
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

    public MovieHall(Integer hallId, String status, Integer seatId, String session, Integer amount, Integer column, Integer row, String note) {
        this.hallId = hallId;
        this.status = status;
        this.seatId = seatId;
        this.session = session;
        this.amount = amount;
        this.column = column;
        this.row = row;
        this.note = note;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
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
