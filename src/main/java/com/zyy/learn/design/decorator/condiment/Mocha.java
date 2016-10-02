package com.zyy.learn.design.decorator.condiment;

import com.zyy.learn.design.decorator.Beverage;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class Mocha extends CondimentDecrotor {
    Beverage wrappered;

    public Mocha(Beverage wrappered){
        this.wrappered = wrappered;
    }

    @Override
    public String getDescrption() {
        return wrappered.getDescrption() + " with cocha";
    }

    @Override
    public double cost() {
        return wrappered.cost() + 0.24;
    }
}
