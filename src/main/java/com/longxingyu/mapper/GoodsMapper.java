package com.longxingyu.mapper;

import com.longxingyu.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 龙星宇
 * @description 针对表【goods】的数据库操作Mapper
 * @createDate 2023-02-28 13:38:20
 * @Entity com.longxingyu.pojo.Goods
 */
@SuppressWarnings({"all"})
@Mapper
public interface GoodsMapper {
    @Select("select * from shopping.goods ")
    List<Goods> getGoods();

    @Select("select * from shopping.goods order by price desc ")
    List<Goods> desc();
    
    @Select("select * from shopping.goods order by price asc")
    List<Goods> asc();

    @Select("select * from shopping.goods where name like '%${name}%'")
    List<Goods> blur(String name);

    @Select("select * from shopping.goods where id = #{id}")
    Goods getById(Integer id);

    @Update("update shopping.goods set collect = 1 where id = #{id}")
    Integer collcetY(Integer id);

    @Update("update shopping.goods set walk = 1 where id = #{id}")
    Integer walkY(Integer id);

    @Update("update shopping.goods set shopcar = 1 where id = #{id}")
    Integer shopY(Integer id);

    @Update("update shopping.goods set buy = 1 where id = #{id}")
    Integer buyY(Integer id);

    Integer collectN(@Param("fid") List<Integer> fid);

    Integer walkN(@Param("fid") List<Integer> fid);

    Integer shopN(@Param("fid") List<Integer> fid);

    Integer buyN(@Param("fid") List<Integer> fid);

    @Select("select * from shopping.goods where classification = #{classification}")
    List<Goods> classification(String name);

    @Select("select classification from shopping.goods")
    List<String> getallfenlei();

    // @Select("select * from shopping.rotograph")
}
