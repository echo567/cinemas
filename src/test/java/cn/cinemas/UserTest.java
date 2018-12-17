package cn.cinemas;

import cn.cinemas.bean.Tickte;
import cn.cinemas.bean.User;
import cn.cinemas.dao.IUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * 军辉
 * 2018-12-15 16:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private IUserDao userDao;


    @Test
    public void insertUserTest() {
        List<Tickte> list = new ArrayList<>();
        User user = new User("123@qq.com", "军辉", "123", "132", "123", "123", "123");
        System.out.println(userDao.insertUser(user));
    }

    @Test
    public void selectUserTest() {
        System.out.println(userDao.selectUserByEmail("123@qq.com"));
        System.out.println(userDao.selectAllUser());
    }

    @Test
    public void updateUserTest() {
        User user = userDao.selectUserByEmail("123@qq.com");
        user.setNote("你好");
        userDao.updateUserByEmail(user);
        System.out.println(user);
    }

    @Test
    public void deleteUserTest() {
        System.out.println(userDao.deleteUser("123@qq.com"));
    }
}
