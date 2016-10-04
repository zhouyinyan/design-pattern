package com.zyy.learn.design.state.state;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class GumbalMachineTest {

    public static void main(String[] args){

        GumbalMachine gumbalMachine = new GumbalMachine(5);

        gumbalMachine.ejectQuarter();
        gumbalMachine.turnCrank();

        gumbalMachine.insertQuarter();
        System.out.println(gumbalMachine);

        gumbalMachine.ejectQuarter();
        System.out.println(gumbalMachine);

        gumbalMachine.insertQuarter();
        System.out.println(gumbalMachine);
        gumbalMachine.turnCrank();
        System.out.println(gumbalMachine);

        gumbalMachine.insertQuarter();
        System.out.println(gumbalMachine);
        gumbalMachine.turnCrank();
        System.out.println(gumbalMachine);

        gumbalMachine.insertQuarter();
        System.out.println(gumbalMachine);
        gumbalMachine.turnCrank();
        System.out.println(gumbalMachine);

        gumbalMachine.insertQuarter();
        System.out.println(gumbalMachine);
        gumbalMachine.turnCrank();
        System.out.println(gumbalMachine);

    }
}
