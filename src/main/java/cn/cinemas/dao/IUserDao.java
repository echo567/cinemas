package cn.cinemas.dao;

import cn.cinemas.batch.UserBatch;
import cn.cinemas.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 军辉
 * 2018-12-15 17:00
 */
@Mapper
public interface IUserDao {


   /* @Insert("insert into tb_user (email,userName,password) values(#{user.email},#{user.userName},#{user.password})")
    public Integer insertUser(@Param("user") User user);*/

    @InsertProvider(type = UserBatch.class, method = "dynamicInsertUser")
    public Integer insertUser(User user);

    @Delete("delete from tb_user where email = #{email}")
    public Integer deleteUser(String email);

    @Select("select * from  tb_user where email = #{email}")
    public User selectUserByEmail(String email);

    @UpdateProvider(type = UserBatch.class, method = "updateUser")
    public Integer updateUserByEmail(User user);

    @Select("select * from tb_user")
    public List<User> selectAllUser();
}
