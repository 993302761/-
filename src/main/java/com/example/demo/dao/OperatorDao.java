package com.example.demo.dao;

import com.example.demo.entiry.Administrators;
import com.example.demo.entiry.Operator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OperatorDao {


    @Select("SELECT o_id,o_passwd FROM operator WHERE o_id =#{o_id}")
    Operator findOperator(@Param("o_id") String o_id);

}
