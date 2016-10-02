package com.zyy.learn.design.factory.factorymethod;

import com.zyy.learn.design.factory.ChicaggoCheesePizza;
import com.zyy.learn.design.factory.ChicaggoClamPizza;
import com.zyy.learn.design.factory.ChicaggoViggePizza;
import com.zyy.learn.design.factory.NYStyleCheesePizza;
import com.zyy.learn.design.factory.NYStyleClamPizza;
import com.zyy.learn.design.factory.NYStyleViggePizza;
import com.zyy.learn.design.factory.Pizza;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class ChicaggoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type == null){
            return  new ChicaggoCheesePizza();  //default pizza
        }else if(type.equalsIgnoreCase("cheese")){
            return  new ChicaggoCheesePizza();
        }else if(type.equalsIgnoreCase("clam")){
            return new ChicaggoClamPizza();
        }else if(type.equalsIgnoreCase("vigge")){
            return new ChicaggoViggePizza();
        }
        return new ChicaggoCheesePizza();
    }
}
