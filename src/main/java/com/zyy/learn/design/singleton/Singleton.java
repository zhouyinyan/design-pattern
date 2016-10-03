package com.zyy.learn.design.singleton;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class Singleton {

    private static Singleton instence ;

    private Singleton(){}

    public static Singleton getInstence(){
        if(null == instence){
            instence = new Singleton();
        }
        return instence;
    }

    //other methods

}
