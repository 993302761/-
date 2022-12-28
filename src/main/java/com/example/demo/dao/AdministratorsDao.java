package com.example.demo.dao;

import com.example.demo.entiry.Administrators;
import com.example.demo.entiry.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdministratorsDao {


    /**
     * 查找超级管理员
     * */
    @Select("SELECT A_id,A_passwd FROM Administrators WHERE A_id =#{A_id}")
    Administrators findAdm(@Param("A_id") String A_id);


    /**
     * 获取所有订单
     * */
    @Select("SELECT * FROM user_order")
    List<Order> getOrder();


    /**
     * 设置订单状态
     * */
    @Update("UPDATE user_order SET isOK=\"已完成\" WHERE pho=#{pho} and dishname=#{dishname} and dishprice=#{dishprice}")
    int setStatus(@Param("pho") String pho,@Param("dishname") String dishname,@Param("dishprice") String dishprice);



    /**
     * 删除订单
     */
    @Delete("DELETE  FROM user_order WHERE user_name =#{user_name} ")
    void cancelOrder(@Param("user_name") String user_name);
}
