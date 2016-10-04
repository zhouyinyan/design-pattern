package com.zyy.learn.design.state.state;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class WinerState implements State {
    GumbalMachine gumbalMachine ;

    public WinerState(GumbalMachine gumbalMachine){
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("--正在出货，请稍后--");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("--正在出货，不能退钱--");
    }

    @Override
    public void turnCrank() {
        System.out.println("--正在出货，不需要再次转动--");
    }

    @Override
    public void dispence() {
        System.out.println("--you are winner!!!---");
        gumbalMachine.releaseBall();
        if(gumbalMachine.getCount() == 0){
            System.out.println("--买完--");
            gumbalMachine.setState(gumbalMachine.getSoldOut());
        }else{
            gumbalMachine.releaseBall();
            if(gumbalMachine.getCount() == 0) {
                System.out.println("--买完--");
                gumbalMachine.setState(gumbalMachine.getSoldOut());
            }else {
                gumbalMachine.setState(gumbalMachine.getNoQuarter());
            }
        }
    }
}
