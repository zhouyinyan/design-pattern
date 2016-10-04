package com.zyy.learn.design.iterator;

import java.util.*;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class PancakeHouseMenu implements Menu {

    List<MenuIteam> menuIteamList;

    public PancakeHouseMenu() {
        this.menuIteamList = new ArrayList<>();

        menuIteamList.add(createMeanuItem("name1","desciption1", true, 4.23));
        menuIteamList.add(createMeanuItem("name2","desciption2", true, 3.23));
        menuIteamList.add(createMeanuItem("name3","desciption3", false, 5.23));
        menuIteamList.add(createMeanuItem("name4","desciption4", false, 6.23));

    }

    private MenuIteam createMeanuItem(String name, String desciption, boolean vegetarian, double price) {
        MenuIteam iteam = new MenuIteam(name, desciption, vegetarian, price);
        return iteam;
    }

    public List<MenuIteam> getMenuIteamList(){
        return menuIteamList;
    }

    @Override
    public java.util.Iterator<MenuIteam> createIterator(){
        return menuIteamList.iterator();
    }
}
