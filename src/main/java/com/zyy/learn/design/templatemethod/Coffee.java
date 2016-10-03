package com.zyy.learn.design.templatemethod;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class Coffee extends CoffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("---add some sugar and milk --");
    }

    @Override
    protected void brew() {
        System.out.println("---dropping coffee through filter--");
    }
}
