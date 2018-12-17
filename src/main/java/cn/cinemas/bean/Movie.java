package cn.cinemas.bean;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * 军辉
 * 2018-12-17 21:02
 * 电影
 */
public class Movie {

    private Integer movieId;
    private Float price;
    private Float boxOffice;
    private Float score;
    private String duration;
    private Data date;
    private String name;
    private String movieType;
    private String introduction;
    //预告片（视频）
    private String prevue;
    private String photo;
    //主演
    private String starring;
    private String director;
    //电影版本（语言）
    private String language;
    private String note;
    private Date updateTime;
    private Date createTime;

    public Movie() {
    }

    public Movie(Integer movieId, Float price, Float boxOffice, Float score, String duration, Data date, String name, String movieType, String introduction, String prevue, String photo, String starring, String director, String language, String note) {
        this.movieId = movieId;
        this.price = price;
        this.boxOffice = boxOffice;
        this.score = score;
        this.duration = duration;
        this.date = date;
        this.name = name;
        this.movieType = movieType;
        this.introduction = introduction;
        this.prevue = prevue;
        this.photo = photo;
        this.starring = starring;
        this.director = director;
        this.language = language;
        this.note = note;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(Float boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPrevue() {
        return prevue;
    }

    public void setPrevue(String prevue) {
        this.prevue = prevue;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
        return "Movie{" +
                "movieId=" + movieId +
                ", price=" + price +
                ", boxOffice=" + boxOffice +
                ", score=" + score +
                ", duration='" + duration + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", movieType='" + movieType + '\'' +
                ", introduction='" + introduction + '\'' +
                ", prevue='" + prevue + '\'' +
                ", photo='" + photo + '\'' +
                ", starring='" + starring + '\'' +
                ", director='" + director + '\'' +
                ", language='" + language + '\'' +
                ", note='" + note + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                '}';
    }
}
