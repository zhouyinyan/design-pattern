package com.zyy.learn.design.templatemethod;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class Tea extends CoffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("---add some lemon--");
    }

    @Override
    protected void brew() {
        System.out.println("---stepping the tea--");
    }

    @Override
    protected boolean hook(){
        return true;
    }
}
