package com.zyy.learn.design.decorator;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescrption() {
        setDescrption(" houseblend ");
        return super.getDescrption();
    }

    @Override
    public double cost() {
        return 2.10;
    }

}
