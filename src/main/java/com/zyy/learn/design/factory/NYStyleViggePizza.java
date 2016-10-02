package com.zyy.learn.design.factory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class NYStyleViggePizza extends ViggePizza {
    @Override
    public void prepare() {
        System.out.println("--ny vigge prepare--");
    }

    @Override
    public void bake() {
        System.out.println("--ny vigge bake--");
    }

    @Override
    public void cut() {
        System.out.println("--ny vigge cut--");
    }

    @Override
    public void box() {
        System.out.println("--ny vigge box--");
    }
}
