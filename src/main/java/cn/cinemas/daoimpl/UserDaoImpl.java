package cn.cinemas.daoimpl;

import cn.cinemas.dao.IUserDao;
import cn.cinemas.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 军辉
 * 2018-12-15 17:05
 */
public class UserDaoImpl {
   /* @Autowired
    private IUserDao userDao;

    @Override
    public Integer insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public Integer deleteUserByemail(String email) {
        return userDao.deleteUserByemail(email);
    }

    @Override
    public User selectUserByEmail(String email) {
        return userDao.selectUserByEmail(email);
    }

    @Override
    public Integer updateUserByEmail(User user) {
        return userDao.updateUserByEmail(user);
    }

    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }*/
}
