package com.zyy.learn.design.adapterandfacade.adapter;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("--quack--");
    }

    @Override
    public void fly() {
        System.out.println("--i am flying--");
    }
}
