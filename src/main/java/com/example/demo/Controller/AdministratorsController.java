package com.example.demo.Controller;

import com.example.demo.service.AdministratorsServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class AdministratorsController {



    @Resource
    private AdministratorsServiceImpl administratorsService;


    //跳到网页
    @RequestMapping("/login")
    public String index(){
        return  "/Login_page_2.html";
    }

    @ResponseBody
    @ApiOperation(value = "超级管理员登录", notes = "输入超级管理员账号和密码登录")
    @GetMapping(value = "/login1", produces = "text/plain;charset=utf-8")
    public String  administratorLogin1 (String ctr_id,String ctr_password){
        return administratorsService.administratorLogin(ctr_id,ctr_password);
    }


    @ResponseBody
    @ApiOperation(value = "超级管理员登录", notes = "输入超级管理员账号和密码登录")
    @GetMapping(value = "/login2", produces = "text/plain;charset=utf-8")
    public String  administratorLogin2 (String ctr_id,String ctr_password){
        return administratorsService.administratorLogin2(ctr_id,ctr_password);
    }


    @ResponseBody
    @ApiOperation(value = "查找所有订单")
    @GetMapping(value = "/getAllOrder", produces = "application/json; charset=utf-8")
    public Object getAllOrder()  {
        return administratorsService.getAllOrder();
    }





    @ApiOperation(value = "超级管理员取消订单")
    @PutMapping(value = "/cancelOrder", produces = "text/plain;charset=utf-8")
    public String cancelOrder (@PathVariable String order_number){
        return administratorsService.cancelOrder(order_number);
    }


}
