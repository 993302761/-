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


    public String delete(String data) {
        String[] split = data.split("\n");
        administratorsDao.cancelOrder(split[2].trim(),split[3].trim(),split[4].trim());
        return "Y";

    }



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



    public Object getAllOrder() {
        return administratorsDao.getOrder();
    }


    public String update(String data,String pho,String dishname,String dishprice) {
        String[] split = data.split("\n");

        administratorsDao.update1(split[2].trim(),split[3].trim(),split[4].trim(),pho);
        administratorsDao.update2(pho,split[3].trim(),split[4].trim(),dishname);
        administratorsDao.update3(pho,dishname,split[4].trim(),dishprice);
        return "Y";
    }

    public String register(String user,String passwd) {
        administratorsDao.addUser(user,passwd);
        return "Y";
    }

    public Object getOperator() {
        return administratorsDao.getOperator();
    }

    public String deleteOperator(String data) {
        String[] split = data.split("\n");
        administratorsDao.deleteOperator(split[2].trim());
        return "Y";
    }
}
