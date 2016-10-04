package com.zyy.learn.design.state.state;

import java.util.Random;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class HasQuarterState implements State {
    GumbalMachine gumbalMachine ;

    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumbalMachine gumbalMachine){
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("--已经投入硬币，不需要再投入--");
    }

    @Override
    public void ejectQuarter() {
        gumbalMachine.setState(gumbalMachine.getNoQuarter());
        System.out.println("--退钱成功--");
    }

    @Override
    public void turnCrank() {
        int winner = randomWinner.nextInt(10);
        if(winner == 0){
            gumbalMachine.setState(gumbalMachine.getWinner());
        }else {
            gumbalMachine.setState(gumbalMachine.getSold());
        }
        System.out.println("--转动了曲柄，正在出货--");
    }

    @Override
    public void dispence() {
        System.out.println("--不会发生--");
    }
}
