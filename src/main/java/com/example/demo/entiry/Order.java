package com.example.demo.entiry;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;



public class Order  implements Serializable {

    private String pho;
    private String dishname;
    private String dishprice;
    private String disdisc;
    private String dishnum;
    private String isOk;


    public String getPho() {
        return pho;
    }

    public void setPho(String pho) {
        this.pho = pho;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public String getDishprice() {
        return dishprice;
    }

    public void setDishprice(String dishprice) {
        this.dishprice = dishprice;
    }

    public String getDisdisc() {
        return disdisc;
    }

    public void setDisdisc(String disdisc) {
        this.disdisc = disdisc;
    }

    public String getDishnum() {
        return dishnum;
    }

    public void setDishnum(String dishnum) {
        this.dishnum = dishnum;
    }

    public String getIsOk() {
        return isOk;
    }

    public void setIsOk(String isOk) {
        this.isOk = isOk;
    }
}
