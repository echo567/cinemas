package cn.cinemas.service;

import cn.cinemas.bean.Cinema;

import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:39
 */
public interface ICinemaService {
    /*
    按照评分高低获取所有影院
     */
    public List<Cinema> getCinemaListByScore();

    /*
    根据影院id查找影院
     */
    public Cinema selectCinemaByCinemaId(Integer cinemaId);

    /*
    获取评分前两位的影院（主页使用）
     */
    public List<Cinema> getTwoCinemas();
}
