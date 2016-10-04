package com.zyy.learn.design.iterator;

import java.util.*;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class DinerMenuIterator implements java.util.Iterator {
    MenuIteam[] menuIteams;
    int position = 0;

    public DinerMenuIterator(MenuIteam[] menuIteams) {
        this.menuIteams = menuIteams;
    }

    @Override
    public boolean hasNext() {
        if(position < menuIteams.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuIteam menuIteam = menuIteams[position];
        position++;
        return menuIteam;
    }

}
