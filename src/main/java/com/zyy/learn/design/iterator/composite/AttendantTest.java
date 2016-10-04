package com.zyy.learn.design.iterator.composite;


/**
 * Created by zhouyinyan on 16/10/3.
 */
public class AttendantTest {

    public static void main(String[] args){
        MenuComponet allMenus = new Menu("all menus", "all menus");

        MenuComponet dinerMenu = new Menu("diner menu", "diner menu description");
        MenuComponet cofeMenu = new Menu("cofe menu", "cofe menu description");
        MenuComponet pancakeHouseMenu = new Menu("pancakeHouseMenu menu", "pancakeHouseMenu menu description");

        allMenus.add(dinerMenu);
        allMenus.add(cofeMenu);
        allMenus.add(pancakeHouseMenu);

        MenuComponet dessertMenu = new Menu("dessert menu", "dessert menu description");
        dinerMenu.add(dessertMenu);

        dinerMenu.add(new MenuIteam("diner name1","desciption1", true, 4.23));
        dinerMenu.add(new MenuIteam("diner name2","desciption2", true, 4.23));
        dinerMenu.add(new MenuIteam("diner name3","desciption3", false, 4.23));
        dinerMenu.add(new MenuIteam("diner name4","desciption4", false, 4.23));

        cofeMenu.add(new MenuIteam("cofe name1","desciption1", true, 4.23));
        cofeMenu.add(new MenuIteam("cofe name2","desciption2", true, 4.23));

        pancakeHouseMenu.add(new MenuIteam("pancake house name1","desciption1", true, 4.23));
        pancakeHouseMenu.add(new MenuIteam("pancake house name2","desciption2", false, 4.23));
        pancakeHouseMenu.add(new MenuIteam("pancake house name3","desciption3", true, 4.23));

        dessertMenu.add(new MenuIteam("dessert name1","desciption1", true, 4.23));

        Attendant attendant = new Attendant(allMenus);
        attendant.printMeun();
        System.out.println("--------");
        attendant.printVege();
    }
}
