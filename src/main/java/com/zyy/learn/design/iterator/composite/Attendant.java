package com.zyy.learn.design.iterator.composite;

import com.zyy.learn.design.iterator.Menu;
import com.zyy.learn.design.iterator.MenuIteam;

import java.util.Iterator;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class Attendant {

    MenuComponet allMenus;

    public Attendant(MenuComponet allMenus){
        this.allMenus = allMenus;
    }

    public void printMeun(){
        allMenus.print();
    }

    public void printVege(){
        Iterator<MenuComponet> iter = allMenus.createIterator();
        while(iter.hasNext()){
            MenuComponet menuComponet = iter.next();
            try {
                if(menuComponet.isVegetarian()) {
                    menuComponet.print();
                }
            } catch (Exception e) {
            }
        }
    }
}
