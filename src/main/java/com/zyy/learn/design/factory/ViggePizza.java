package com.zyy.learn.design.factory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class ViggePizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("--vigge prepare--");
    }

    @Override
    public void bake() {
        System.out.println("--vigge bake--");
    }

    @Override
    public void cut() {
        System.out.println("--vigge cut--");
    }

    @Override
    public void box() {
        System.out.println("--vigge box--");
    }
}
