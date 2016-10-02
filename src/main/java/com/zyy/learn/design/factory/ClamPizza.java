package com.zyy.learn.design.factory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class ClamPizza extends AbstractPizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("--clam prepare--");
    }

    @Override
    public void bake() {
        System.out.println("--clam bake--");
    }

    @Override
    public void cut() {
        System.out.println("--clam cut--");
    }

    @Override
    public void box() {
        System.out.println("--clam box--");
    }

}
