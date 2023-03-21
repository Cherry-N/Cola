package com.longxingyu.mapper;

import com.longxingyu.pojo.User;
import org.apache.ibatis.annotations.*;

/**
 * @author 龙星宇
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2023-02-28 13:39:39
 * @Entity com.longxingyu.pojo.User
 */
@SuppressWarnings({"all"})
@Mapper
public interface UserMapper {

    @Select("select * from shopping.user where username = #{username} and password = #{password}")
    public User login(@Param("username") String username, @Param("password") String password);

    @Insert("insert into shopping.user values (null,#{username},#{password})")
    int insert(User user);

    @Select("select * from shopping.user where id = #{id}")
    User selectByPrimaryKey(Integer id);

    @Update("update shopping.user set password = #{password} where id = #{id}")
    int updateByPrimaryKey(@Param("id") Integer id, @Param("password") String password);

}
