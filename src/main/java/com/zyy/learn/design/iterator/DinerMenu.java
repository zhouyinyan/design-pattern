package com.zyy.learn.design.iterator;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class DinerMenu implements Menu{

    MenuIteam[] menuIteams;

    public DinerMenu() {
        this.menuIteams = new MenuIteam[4];

        menuIteams[0] = createMeanuItem("diner name1","desciption1", true, 4.23);
        menuIteams[1] = createMeanuItem("diner name2","desciption1", true, 4.23);
        menuIteams[2] = createMeanuItem("diner name3","desciption1", true, 4.23);
        menuIteams[3] = createMeanuItem("diner name4","desciption1", true, 4.23);

    }

    private MenuIteam createMeanuItem(String name, String desciption, boolean vegetarian, double price) {
        MenuIteam iteam = new MenuIteam(name, desciption, vegetarian, price);
        return iteam;
    }

    public MenuIteam[] getMenuIteamList(){
        return menuIteams;
    }

    @Override
    public java.util.Iterator<MenuIteam> createIterator(){
        return new DinerMenuIterator(menuIteams);
    }

}
