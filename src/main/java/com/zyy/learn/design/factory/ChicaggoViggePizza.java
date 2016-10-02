package com.zyy.learn.design.factory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class ChicaggoViggePizza extends ViggePizza{
    @Override
    public void prepare() {
        System.out.println("--chicaggo vigge prepare--");
    }

    @Override
    public void bake() {
        System.out.println("--chicaggo vigge bake--");
    }

    @Override
    public void cut() {
        System.out.println("--chicaggo vigge cut--");
    }

    @Override
    public void box() {
        System.out.println("--chicaggo vigge box--");
    }
}
