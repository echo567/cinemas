package cn.cinemas.service;

import cn.cinemas.bean.Cinema;

import java.util.List;

/**
 * 军辉
 * 2018-12-20 9:39
 */
public interface ICinemaService {
    public List<Cinema> getCinemaListByScore();
}
