package com.example.demo.Controller;

import com.example.demo.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    //跳到网页
    @RequestMapping("/user")
    public String index(){
        return  "/today.html";
    }



    @ResponseBody
    @PostMapping(value = "/order", produces = "text/plain;charset=utf-8")
    public String add_User(String phone,
                         String dishname,
                         String dishdisc,
                         String dishprice,
                         String dishnum) {
        return userService.add_User(phone, dishname, dishdisc, dishprice, dishnum);
    }

}
