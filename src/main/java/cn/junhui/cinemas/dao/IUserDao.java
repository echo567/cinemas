package cn.junhui.cinemas.dao;

import cn.junhui.cinemas.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 军辉
 * 2018-12-15 17:00
 */
@Mapper
public interface IUserDao {

    @Insert("insert into tb_user (email,userName,password) values(#{user.email},#{user.userName},#{user.password})")
    public Integer insertUser(@Param("user") User user);

    public Integer deleteUser(String email);

    public User selectUserByEmail(String email);

    public Integer updateUserByEmail(String email);

    public List<User> selectAllUser();
}
