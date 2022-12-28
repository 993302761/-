package com.example.demo.service;

import com.example.demo.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
@Service

public class UserService {

    @Resource
    private UserDao userDao;

    public String add_User(String phone,
                           String dishname,
                           String dishdisc,
                           String disprice,
                           String dishnum) {

        userDao.add_order(phone, dishname, disprice, dishdisc,dishnum);
        return "Y";
    }
}
