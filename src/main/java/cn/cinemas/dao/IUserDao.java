package cn.cinemas.dao;

import cn.cinemas.batch.UserBatch;
import cn.cinemas.bean.Ticket;
import cn.cinemas.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 军辉
 * 2018-12-15 17:00
 */
@Mapper
public interface IUserDao {


    @InsertProvider(type = UserBatch.class, method = "dynamicInsertUser")
    public Integer insertUser(User user);

    @Delete("delete from tb_user where email = #{email}")
    public Integer deleteUserByemail(String email);

    @Select("select * from  tb_user where email = #{email}")
    public User selectUserByEmail(String email);

    @UpdateProvider(type = UserBatch.class, method = "updateUser")
    public Integer updateUserByEmail(User user);

    @Select("select * from tb_user")
    public List<User> selectAllUser();

    @Select("select * from tb_ticket where userId = #{userId}")
    public List<Ticket> selectTicketsByUserId(Integer userId);

    @Select("select * from tb_user where userId = #{userId}")
    public User selectUserByUserId(Integer userId);
}
