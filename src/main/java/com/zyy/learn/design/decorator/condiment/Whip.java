package com.zyy.learn.design.decorator.condiment;

import com.zyy.learn.design.decorator.Beverage;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class Whip extends CondimentDecrotor {
    Beverage wrappered;

    public Whip(Beverage wrappered){
        this.wrappered = wrappered;
    }

    @Override
    public String getDescrption() {
        return wrappered.getDescrption() + " with whip";
    }

    @Override
    public double cost() {
        return wrappered.cost() + 0.14;
    }
}
