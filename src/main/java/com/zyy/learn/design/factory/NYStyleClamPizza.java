package com.zyy.learn.design.factory;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class NYStyleClamPizza extends ClamPizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("--ny clam prepare--");
    }

    @Override
    public void bake() {
        System.out.println("--ny clam bake--");
    }

    @Override
    public void cut() {
        System.out.println("--ny clam cut--");
    }

    @Override
    public void box() {
        System.out.println("--ny clam box--");
    }
}
