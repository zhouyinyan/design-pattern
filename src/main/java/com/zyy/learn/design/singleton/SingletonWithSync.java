package com.zyy.learn.design.singleton;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class SingletonWithSync {

    private static SingletonWithSync instence ;

    private SingletonWithSync(){}

    public static synchronized SingletonWithSync getInstence(){
        if(null == instence){
            instence = new SingletonWithSync();
        }
        return instence;
    }

    //other methods

}
