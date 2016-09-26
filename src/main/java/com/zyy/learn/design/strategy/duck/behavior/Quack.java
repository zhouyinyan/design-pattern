package com.zyy.learn.design.strategy.duck.behavior;

/**
 * Created by zhouyinyan on 9/26/16.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("-----quack quack quack-----");
    }
}
