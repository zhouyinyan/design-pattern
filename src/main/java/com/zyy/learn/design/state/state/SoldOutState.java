package com.zyy.learn.design.state.state;


/**
 * Created by zhouyinyan on 16/10/4.
 */
public class SoldOutState implements State {

    GumbalMachine gumbalMachine ;

    public SoldOutState(GumbalMachine gumbalMachine){
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("--已经卖完--");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("--已经卖完--");
    }

    @Override
    public void turnCrank() {
        System.out.println("--已经卖完--");
    }

    @Override
    public void dispence() {
        System.out.println("--已经卖完--");
    }
}
