package com.zyy.learn.design.iterator;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class Attendant {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cofeMenu;

    public Attendant(Menu pancakeHouseMenu, Menu dinerMenu, Menu cofeMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cofeMenu = cofeMenu;
    }

    public void printMeun(){
//        for(MenuIteam menuIteam : pancakeHouseMenu.getMenuIteamList()){
//            System.out.println(menuIteam);
//        }
//        for (MenuIteam menuIteam : dinerMenu.getMenuIteamList()){
//            System.out.println(menuIteam);
//        }

        java.util.Iterator<MenuIteam> iterator = pancakeHouseMenu.createIterator();
        printMenu(iterator);
        java.util.Iterator<MenuIteam> iterator2 = dinerMenu.createIterator();
        printMenu(iterator2);
        java.util.Iterator<MenuIteam> iterator3 = cofeMenu.createIterator();
        printMenu(iterator3);
    }

    private void printMenu(java.util.Iterator iterator) {
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
