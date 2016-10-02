package com.zyy.learn.design.factory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class ChicaggoClamPizza extends ClamPizza {

    @Override
    public void prepare() {
        System.out.println("--chicaggo clam prepare--");
    }

    @Override
    public void bake() {
        System.out.println("--chicaggo clam bake--");
    }

    @Override
    public void cut() {
        System.out.println("--chicaggo clam cut--");
    }

    @Override
    public void box() {
        System.out.println("--chicaggo clam box--");
    }
}
