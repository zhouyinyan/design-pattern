package com.zyy.learn.design.factory.factorymethod;

import com.zyy.learn.design.factory.NYStyleCheesePizza;
import com.zyy.learn.design.factory.NYStyleClamPizza;
import com.zyy.learn.design.factory.NYStyleViggePizza;
import com.zyy.learn.design.factory.Pizza;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type == null){
            return  new NYStyleCheesePizza();  //default pizza
        }else if(type.equalsIgnoreCase("cheese")){
            return  new NYStyleCheesePizza();
        }else if(type.equalsIgnoreCase("clam")){
            return new NYStyleClamPizza();
        }else if(type.equalsIgnoreCase("vigge")){
            return new NYStyleViggePizza();
        }
        return new NYStyleCheesePizza();
    }
}
