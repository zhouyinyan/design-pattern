package com.zyy.learn.design.factory.abstractfactory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class ChicaggoIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
