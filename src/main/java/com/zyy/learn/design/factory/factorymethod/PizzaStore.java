package com.zyy.learn.design.factory.factorymethod;

import com.zyy.learn.design.factory.Pizza;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
