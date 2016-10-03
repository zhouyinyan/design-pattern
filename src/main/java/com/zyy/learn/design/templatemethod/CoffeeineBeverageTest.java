package com.zyy.learn.design.templatemethod;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class CoffeeineBeverageTest {

    public static void main(String[] args){
        CoffeineBeverage coffee = new Coffee();
        coffee.prepare();

        CoffeineBeverage tea = new Tea();
        tea.prepare();
    }
}
