package com.example.myspring.entity;

/**
 * Created by Bruce on 2017/11/22.
 */
public class Account {
    private int id;
    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int val) {
        id = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
        name = val;
    }

    public double getMoney(){
        return money;
    }

    public void setMoney(double val){
        money = val;
    }
}
