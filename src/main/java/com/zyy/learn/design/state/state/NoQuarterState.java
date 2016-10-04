package com.zyy.learn.design.state.state;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class NoQuarterState implements State {
    GumbalMachine gumbalMachine ;

    public NoQuarterState(GumbalMachine gumbalMachine){
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        gumbalMachine.setState(gumbalMachine.getHasQuarter());
        System.out.println("--投入硬币--");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("--不能推钱，还没有投入--");
    }

    @Override
    public void turnCrank() {
        System.out.println("--没有投钱，不会出货--");
    }

    @Override
    public void dispence() {
        System.out.println("--没有投钱，不会出货--");
    }
}
