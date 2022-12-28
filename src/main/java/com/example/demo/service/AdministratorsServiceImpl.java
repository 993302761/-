package com.example.demo.service;

import com.example.demo.dao.AdministratorsDao;
import com.example.demo.dao.OperatorDao;
import com.example.demo.entiry.Administrators;
import com.example.demo.entiry.Operator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdministratorsServiceImpl {

    @Resource
    private AdministratorsDao administratorsDao;

    @Resource
    private OperatorDao operatorDao;




    public String  complete (String data){
        String[] split = data.split("\n");
        administratorsDao.setStatus(split[2].trim(),split[3].trim(),split[4].trim());
        return "Y";
    }

    /**
     * TODO：超级管理员登录
     * @param ctr_id 超级管理员账号
     * @param ctr_password 超级管理员密码
     * @return 是否成功
     */
    public String administratorLogin(String ctr_id, String ctr_password) {
        if (ctr_id==null||ctr_password==null){
            return "用户名或密码为空";
        }
        Administrators controller=administratorsDao.findAdm(ctr_id);
        if (controller==null){
            return "用户未注册";
        }
        if (controller.getA_passwd().equals(ctr_password)){
            return "Y";
        }else {
            return "密码错误";
        }
    }

    /**
     * TODO：超级管理员登录
     * @param ctr_id 超级管理员账号
     * @param ctr_password 超级管理员密码
     * @return 是否成功
     */
    public String administratorLogin2(String ctr_id, String ctr_password) {
        if (ctr_id==null||ctr_password==null){
            return "用户名或密码为空";
        }
        Operator controller=operatorDao.findOperator(ctr_id);
        if (controller==null){
            return "用户未注册";
        }
        if (controller.getO_passwd().equals(ctr_password)){
            return "Y";
        }else {
            return "密码错误";
        }
    }


    /**
     * TODO：获取订单列表
     * @return 获取订单列表
     */
    public Object getAllOrder() {
        return administratorsDao.getOrder();
    }






    /**
     * TODO：超级管理员取消订单
     * @param order_number 订单编号
     * @return 是否成功
     */
    public String cancelOrder( String order_number) {
        administratorsDao.cancelOrder(order_number);
        return "成功";
    }



}
