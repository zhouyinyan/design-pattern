package com.zyy.learn.design.strategy.duck.behavior;

import com.zyy.learn.design.strategy.duck.behavior.FlyBehavior;

/**
 * Created by zhouyinyan on 9/26/16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("-----fly no way-----");
    }
}
