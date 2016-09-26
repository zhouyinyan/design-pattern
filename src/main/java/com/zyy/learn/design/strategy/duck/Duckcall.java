package com.zyy.learn.design.strategy.duck;

import com.zyy.learn.design.strategy.duck.behavior.QuackBehavior;

/**
 * Created by zhouyinyan on 9/26/16.
 */
public class Duckcall {

    protected QuackBehavior quackBehavior;

    public Duckcall(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void call(){
        quackBehavior.quack();
    }
}
