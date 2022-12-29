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
    @GetMapping(value = "/login1", produces = "text/plain;charset=utf-8")
    public String  administratorLogin1 (String ctr_id,String ctr_password){
        return administratorsService.administratorLogin(ctr_id,ctr_password);
    }


    @ResponseBody
    @GetMapping(value = "/getOperator", produces = "application/json;charset=utf-8")
    public Object  getOperator (){
        return administratorsService.getOperator();
    }


    @ResponseBody
    @PostMapping(value = "/complete", produces = "text/plain;charset=utf-8")
    public String  complete (String data){
        return administratorsService.complete(data);
    }


    @ResponseBody
    @DeleteMapping(value = "/delete", produces = "text/plain;charset=utf-8")
    public String  delete (String data){
        return administratorsService.delete(data);
    }


    @ResponseBody
    @DeleteMapping(value = "/deleteOperator", produces = "text/plain;charset=utf-8")
    public String  deleteOperator (String data){
        return administratorsService.deleteOperator(data);
    }

    @ResponseBody
    @PostMapping(value = "/register", produces = "text/plain;charset=utf-8")
    public String  register (String username,String password){
        return administratorsService.register(username, password);
    }

    @ResponseBody
    @PostMapping(value = "/update", produces = "text/plain;charset=utf-8")
    public String  update (String data,String pho,String dishname,String dishprice){
        return administratorsService.update(data,pho, dishname, dishprice);
    }


    @ResponseBody
    @GetMapping(value = "/login2", produces = "text/plain;charset=utf-8")
    public String  administratorLogin2 (String ctr_id,String ctr_password){
        return administratorsService.administratorLogin2(ctr_id,ctr_password);
    }


    @ResponseBody
    @GetMapping(value = "/getAllOrder", produces = "application/json; charset=utf-8")
    public Object getAllOrder()  {
        return administratorsService.getAllOrder();
    }




}
