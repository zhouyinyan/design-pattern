package com.zyy.learn.design.factory.abstractfactory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public interface IngredientFactory {

    public Dough createDough();

    public Sauce createSauce();
}
