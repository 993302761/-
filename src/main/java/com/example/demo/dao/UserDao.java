package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper

public interface UserDao {

    /**
     * 增加一个订单
     *
     * */
    @Insert("INSERT INTO user_order VALUES(#{pho}," +
            "#{dishname}," +
            "#{dishprice}," +
            "#{disdisc}," +
            "#{dishnum}," +
            "'未完成')")
    int add_order(@Param("pho") String phone,
                  @Param("dishname") String dishname,
                  @Param("dishprice")  String dishprice,
                  @Param("disdisc")  String disdisc,
                  @Param("dishnum")  String dishnum);


}
