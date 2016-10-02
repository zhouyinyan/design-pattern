package com.zyy.learn.design.decorator;

import com.zyy.learn.design.decorator.condiment.Mocha;
import com.zyy.learn.design.decorator.condiment.Soy;
import com.zyy.learn.design.decorator.condiment.Whip;
import com.zyy.learn.design.decorator.size.GrandeSize;
import com.zyy.learn.design.decorator.size.TallSize;
import com.zyy.learn.design.decorator.size.VentiSize;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class StarBuzzCoffee {

    public static void  main(String[] args){
        Beverage beverage = new Espresso();
        beverage.setSize(new TallSize());
        System.out.println(beverage.getDescrption() + "    $"+beverage.cost());

        Beverage beverage1 = new Mocha(new Mocha(new Whip(new DarkRoast())));
        beverage1.setSize(new GrandeSize());
        System.out.println(beverage1.getDescrption() + "    $"+beverage1.cost());

        Beverage beverage2 = new Soy(new Mocha(new Whip(new HouseBlend())));
        beverage2.setSize(new VentiSize());
        System.out.println(beverage2.getDescrption() + "    $"+beverage2.cost());
    }
}
