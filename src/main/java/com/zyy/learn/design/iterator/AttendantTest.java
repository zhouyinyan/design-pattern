package com.zyy.learn.design.iterator;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class AttendantTest {

    public static void main(String[] args){
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cofeMenu = new CoffeeMenu();
        Attendant attendant = new Attendant(pancakeHouseMenu, dinerMenu, cofeMenu);
        attendant.printMeun();
    }
}
