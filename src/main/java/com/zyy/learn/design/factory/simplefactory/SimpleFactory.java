package com.zyy.learn.design.factory.simplefactory;

import com.zyy.learn.design.factory.CheesePizza;
import com.zyy.learn.design.factory.ClamPizza;
import com.zyy.learn.design.factory.Pizza;
import com.zyy.learn.design.factory.ViggePizza;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class SimpleFactory {

    public static Pizza createPizza(String type){
        if(type == null){
            return  new CheesePizza();  //default pizza
        }else if(type.equalsIgnoreCase("cheese")){
            return  new CheesePizza();
        }else if(type.equalsIgnoreCase("clam")){
            return new ClamPizza();
        }else if(type.equalsIgnoreCase("vigge")){
            return new ViggePizza();
        }
        return new CheesePizza();
    }
}
