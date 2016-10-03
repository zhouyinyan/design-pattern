package com.zyy.learn.design.adapterandfacade.adapter;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("--gobble--");
    }

    @Override
    public void fly() {
        System.out.println("--i am fly--");
    }
}
