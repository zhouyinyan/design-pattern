package com.zyy.learn.design.decorator;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class DarkRoast extends Beverage {
    @Override
    public String getDescrption() {
        setDescrption(" darkroast ");
        return super.getDescrption();
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
