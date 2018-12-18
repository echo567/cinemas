package cn.cinemas.service;

import cn.cinemas.bean.User;
import cn.cinemas.util.Message;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 军辉
 * 2018-12-16 9:53
 */
public interface IUserService {

    public Message login(User user);

    public Message register(User user);

    // public void email(String email);

    public boolean registerPage(String code);
}
