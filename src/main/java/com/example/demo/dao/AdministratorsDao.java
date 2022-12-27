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
    @Select("SELECT * FROM order")
    List<Order> getOrder();


    /**
     * 删除订单
     */
    @Delete("DELETE  FROM User WHERE user_name =#{user_name} ")
    void cancelOrder(@Param("user_name") String user_name);
}
