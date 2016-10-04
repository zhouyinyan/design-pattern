package com.zyy.learn.design.iterator;

import com.zyy.learn.design.templatemethod.CoffeineBeverage;

import java.util.*;
import java.util.Iterator;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class CoffeeMenu implements Menu{

    Hashtable menu = new Hashtable();

    public CoffeeMenu(){
        menu.put("cofe name1",createMeanuItem("cofe name1","desciption1", true, 4.23));
        menu.put("cofe name2",createMeanuItem("cofe name1","desciption1", true, 4.23));
        menu.put("cofe name3",createMeanuItem("cofe name1","desciption1", true, 4.23));
        menu.put("cofe name4",createMeanuItem("cofe name1","desciption1", true, 4.23));
    }

    private MenuIteam createMeanuItem(String name, String desciption, boolean vegetarian, double price) {
        MenuIteam iteam = new MenuIteam(name, desciption, vegetarian, price);
        return iteam;
    }

    @Override
    public Iterator<MenuIteam> createIterator() {
        return menu.values().iterator();
    }
}
