package cn.junhui.cinemas;

import cn.junhui.cinemas.bean.User;
import cn.junhui.cinemas.dao.IUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        User user = new User("123@qq.com", "军辉", "123");
        System.out.println(userDao.insertUser(user));
    }
}
