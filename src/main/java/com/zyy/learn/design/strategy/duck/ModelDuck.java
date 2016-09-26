package com.zyy.learn.design.strategy.duck;

import com.zyy.learn.design.strategy.duck.behavior.FlyBehavior;
import com.zyy.learn.design.strategy.duck.behavior.QuackBehavior;

/**
 * Created by zhouyinyan on 9/26/16.
 */
public class ModelDuck extends Duck {

    protected ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {

    }
}
