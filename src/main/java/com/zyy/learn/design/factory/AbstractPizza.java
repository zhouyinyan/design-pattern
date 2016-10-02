package com.zyy.learn.design.factory;

import com.zyy.learn.design.factory.abstractfactory.Dough;
import com.zyy.learn.design.factory.abstractfactory.IngredientFactory;
import com.zyy.learn.design.factory.abstractfactory.NYIngredientFactory;
import com.zyy.learn.design.factory.abstractfactory.Sauce;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public abstract class AbstractPizza implements Pizza {

    IngredientFactory ingredientFactory = new NYIngredientFactory();

    Dough dough;
    Sauce sauce;


    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        System.out.println(dough.getName() + "-- prepare--");
        System.out.println(sauce.getName() + "-- prepare--");
    }

    @Override
    public void bake() {
        System.out.println("--default bake--");
    }

    @Override
    public void cut() {
        System.out.println("--default cut--");
    }

    @Override
    public void box() {
        System.out.println("--default box--");
    }
}
