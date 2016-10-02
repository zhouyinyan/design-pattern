package com.zyy.learn.design.decorator;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class Espresso extends Beverage {

    @Override
    public String getDescrption() {
        setDescrption(" espresso ");
        return super.getDescrption();
    }

    @Override
    public double cost() {
        return 2.55;
    }
}
