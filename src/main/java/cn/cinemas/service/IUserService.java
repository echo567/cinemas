package cn.cinemas.service;

import cn.cinemas.bean.User;

import javax.servlet.http.HttpServletRequest;

/**
 * 军辉
 * 2018-12-16 9:53
 */
public interface IUserService {

    public boolean login(User user);

    public void register(User user, HttpServletRequest request);

    public void email(String email, HttpServletRequest request);

    public boolean registerPage(String code, HttpServletRequest request);
}
