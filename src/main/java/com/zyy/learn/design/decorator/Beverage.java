package com.zyy.learn.design.decorator;

import com.zyy.learn.design.decorator.size.SizeInterface;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public abstract class Beverage {


    private String descrption = "unkown beverage";
    SizeInterface size ;



    public String  getDescrption(){
        return descrption;
    }

    public void setDescrption(String descrption){
        this.descrption = descrption;
    }

    public abstract double cost();

    public Enum getSize(){
        return size.getSize();
    }

    public void setSize(SizeInterface size){
        this.size = size;
    }
}
