package cn.junhui.cinemas.serviceimpl;

import cn.junhui.cinemas.bean.User;
import cn.junhui.cinemas.dao.IUserDao;
import cn.junhui.cinemas.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 军辉
 * 2018-12-16 9:55
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public Integer login(User user) {
        User databaseUser = userDao.selectUserByEmail(user.getEmail());

        return null;
    }
}
