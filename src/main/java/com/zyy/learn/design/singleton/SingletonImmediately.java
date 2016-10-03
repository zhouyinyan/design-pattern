package com.zyy.learn.design.singleton;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class SingletonImmediately {

    private static SingletonImmediately instence = new SingletonImmediately();

    private SingletonImmediately(){}

    public static SingletonImmediately getInstence(){
        return instence;
    }

    //other methods

}
