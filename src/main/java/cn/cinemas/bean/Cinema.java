package cn.cinemas.bean;

import java.util.Date;

/**
 * 军辉
 * 2018-12-17 20:58
 * 电影院
 */
public class Cinema {
    private Integer cinemaId;
    private String address;
    private String name;
    private Float score;
    private String phone;
    private Date createTime;
    private Date updateTime;

    public Cinema() {
    }

    public Cinema(Integer cinemaId, String address, String name, Float score, String phone) {
        this.cinemaId = cinemaId;
        this.address = address;
        this.name = name;
        this.score = score;
        this.phone = phone;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        return "Cinema{" +
                "cinemaId=" + cinemaId +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

