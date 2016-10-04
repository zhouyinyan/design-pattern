package com.zyy.learn.design.iterator.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class Menu extends MenuComponet {

    List<MenuComponet> menuComponets = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void add(MenuComponet menuComponet) {
        menuComponets.add(menuComponet);
    }

    @Override
    public void remove(MenuComponet menuComponet) {
        menuComponet.remove(menuComponet);
    }

    @Override
    public MenuComponet getChild(int i) {
        return menuComponets.get(i);
    }

    @Override
    public void print() {
        System.out.println("name:"+name);
        System.out.println("descption:"+description);
        Iterator<MenuComponet> iter = menuComponets.iterator();
        while(iter.hasNext()){
            iter.next().print();
        }

    }

    @Override
    public Iterator createIterator() {
        return new ComponentIterator(menuComponets.iterator());
    }
}
