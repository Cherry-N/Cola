package com.longxingyu.mapper;

import com.longxingyu.pojo.Scheme;
import com.longxingyu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 龙星宇
 * @description 针对表【scheme】的数据库操作Mapper
 * @createDate 2023-02-28 13:39:08
 * @Entity com.longxingyu.pojo.Scheme
 */
@Mapper
@SuppressWarnings({"all"})
public interface SchemeMapper {

    @Select("select * from shopping.scheme")
    List<Scheme> getall();

    @Select("select * from shopping.scheme where id= #{id}")
    Scheme selectByPrimaryKey(Integer id);

    @Update("update shopping.user set balance = #{balance},invest = #{invest} where id = #{id}")
    Integer recharge(User user);

    @Update("update shopping.user set integral = #{integral} where id = #{id}")
    Integer updatejifen(User user);
}
