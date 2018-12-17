package cn.junhui.cinemas.batch;

import cn.junhui.cinemas.bean.User;

import org.apache.ibatis.jdbc.SQL;

import java.util.Date;

/**
 * 军辉
 * 2018-12-17 14:56
 */
public class UserBatch {
    /*
    动态增加用户
     */
    public String dynamicInsertUser(User user) {
        return new SQL() {
            {
                INSERT_INTO("tb_user");
                if (user.getEmail() != null) {
                    VALUES("email", "#{email}");
                }
                if (user.getUserName() != null) {
                    VALUES("userName", "#{userName}");
                }
                if (user.getPassword() != null) {
                    VALUES("password", "#{password}");
                }
                if (user.getSex() != null) {
                    VALUES("sex", "#{sex}");
                }
                if (user.getPhone() != null) {
                    VALUES("phone", "#{phone}");
                }
                if (user.getPhoto() != null) {
                    VALUES("photo", "#{photo}");
                }
                if (user.getTickte() != null) {
                    VALUES("ticket", "#{ticket}");
                }
                if (user.getNote() != null) {
                    VALUES("note", "#{note}");
                }
            }
        }.toString();
    }

    /*
    动态修改用户信息
     */
    public String updateUser(User user) {
        user.setUpdateTime(new Date());
        return new SQL() {{
            UPDATE("tb_user");
            if (user.getUserName() != null) {
                SET("userName = #{userName}");
            }
            if (user.getPhone() != null) {
                SET("phone = #{phone}");
            }
            if (user.getSex() != null) {
                SET("sex = #{sex}");
            }
            if (user.getTickte() != null) {
                SET("ticket = #{ticket}");
            }
            if (user.getNote() != null) {
                SET("note = #{note}");
            }
            if (user.getCreateTime() != null) {
                SET("createTime = #{createTime}");
            }
            if (user.getUpdateTime() != null) {
                SET("updateTime = #{updateTime}");
            }
            if (user.getPhone() != null) {
                SET("phone = #{phone}");
            }
            if (user.getPhone() != null) {
                SET("phone = #{phone}");
            }
            WHERE("userId = #{userId}");

        }}.toString();
    }
}
