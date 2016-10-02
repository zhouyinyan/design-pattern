package com.zyy.learn.design.factory.simplefactory;

import com.zyy.learn.design.factory.Pizza;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public  class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = SimpleFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static void main(String[] args){
        PizzaStore pizzaStore  = new PizzaStore();
        pizzaStore.orderPizza("vigge");

        pizzaStore.orderPizza("clam");


    }
}
