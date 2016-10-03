package com.zyy.learn.design.templatemethod;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public abstract class CoffeineBeverage {

    public final void prepare(){
        boidWater();
        brew();
        pourInCup();
        addCondiments();
        if(hook()){
            doSomeThing();
        }
    }

    final protected  void doSomeThing(){
        System.out.println("--do something in hook--");
    }

    protected boolean hook() {
        return false;
    }

    protected abstract void addCondiments();

    protected abstract void brew() ;

    private final void boidWater() {
        System.out.println("---boid water--");
    }

    private final void pourInCup() {
        System.out.println("---pour in cup--");
    }
    
    

}
