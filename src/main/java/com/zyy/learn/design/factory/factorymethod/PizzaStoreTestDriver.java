package com.zyy.learn.design.factory.factorymethod;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class PizzaStoreTestDriver {

    public static void main(String[] args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("clam");

        PizzaStore chicaggoPizzaStore = new ChicaggoPizzaStore();
        chicaggoPizzaStore.orderPizza("clam");
    }
}
