package com.example.demo.entiry;

import lombok.Data;
import lombok.NoArgsConstructor;


public class Administrators {

    private String A_id;             //管理员账号
    private String A_passwd;       //管理员密码

    public String getA_id() {
        return A_id;
    }

    public void setA_id(String a_id) {
        A_id = a_id;
    }

    public String getA_passwd() {
        return A_passwd;
    }

    public void setA_passwd(String a_passwd) {
        A_passwd = a_passwd;
    }
}
