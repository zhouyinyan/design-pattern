package com.zyy.learn.design.strategy.duck;

import com.zyy.learn.design.strategy.duck.behavior.*;

/**
 * Created by zhouyinyan on 9/26/16.
 */
public class MiniDuckSimulator {

    public static void main(String[] args){
        FlyBehavior flyBehavior = new FlyWithWings();
        QuackBehavior quackBehavior = new Quack();
        Duck mallard = new MallardDuck(flyBehavior, quackBehavior);

        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck(new FlyNoWay(), new MuteQuack());
        model.performFly();
        model.setFlyBehavior(new FlyWithRocket());
        model.performFly();


        Duckcall duckcall = new Duckcall(new Quack());
        duckcall.call();


    }
}
