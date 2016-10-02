package com.zyy.learn.design.factory.abstractfactory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class NYIngredientFactory implements IngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
