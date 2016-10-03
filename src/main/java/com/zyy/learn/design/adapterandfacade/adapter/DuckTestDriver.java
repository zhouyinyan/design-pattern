package com.zyy.learn.design.adapterandfacade.adapter;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class DuckTestDriver {

    public static void main(String[] args){

        Duck duck = new MallardDuck();
        testDuck(duck);

        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
