package com.zyy.learn.design.iterator;

import java.util.List;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class PancakeHouseMenuIterator implements Iterator {

    List<MenuIteam> menuIteamList;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuIteam> menuIteamList){
        this.menuIteamList = menuIteamList;
    }

    @Override
    public boolean hasNext() {
        if(position < menuIteamList.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuIteam menuIteam = menuIteamList.get(position);
        position++;
        return menuIteam;
    }
}
