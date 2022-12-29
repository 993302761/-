package com.example.demo.dao;

import com.example.demo.entiry.Administrators;
import com.example.demo.entiry.Operator;
import com.example.demo.entiry.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdministratorsDao {



    @Select("SELECT A_id,A_passwd FROM Administrators WHERE A_id =#{A_id}")
    Administrators findAdm(@Param("A_id") String A_id);



    @Select("SELECT * FROM user_order")
    List<Order> getOrder();



    @Update("UPDATE user_order SET isOK=\"已完成\" WHERE pho=#{pho} and dishname=#{dishname} and dishprice=#{dishprice}")
    int setStatus(@Param("pho") String pho,@Param("dishname") String dishname,@Param("dishprice") String dishprice);




    @Delete("DELETE  FROM user_order WHERE pho=#{pho} and dishname=#{dishname} and dishprice=#{dishprice}")
    void cancelOrder(@Param("pho") String pho,@Param("dishname") String dishname,@Param("dishprice") String dishprice);


    @Update("UPDATE user_order SET pho=#{pho} WHERE pho=#{trim} and dishname=#{trim1} and dishprice=#{trim2}")
    void update1(String trim, String trim1, String trim2, String pho);

    @Update("UPDATE user_order SET dishname=#{dishname} WHERE pho=#{trim} and dishname=#{trim1} and dishprice=#{trim2}")
    void update2(String trim, String trim1, String trim2, String dishname);

    @Update("UPDATE user_order SET dishprice=#{dishprice} WHERE pho=#{trim} and dishname=#{trim1} and dishprice=#{trim2}")
    void update3(String trim, String trim1, String trim2, String dishprice);


    @Insert("INSERT INTO Administrators VALUES(#{A_id},#{A_passwd})")
    void addUser(@Param("A_id") String o_id,@Param("A_passwd") String o_passwd);


    @Select("SELECT * FROM operator")
    List<Operator> getOperator();

    @Delete("DELETE  FROM operator WHERE o_id=#{trim}")
    void deleteOperator(@Param("trim") String trim);
}
