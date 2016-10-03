package com.zyy.learn.design.singleton;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class SingletonWithDoubbleCheck {

    private static SingletonWithDoubbleCheck instence ;

    private SingletonWithDoubbleCheck(){}

    public static SingletonWithDoubbleCheck getInstence(){
        if(null == instence){
            synchronized (SingletonWithDoubbleCheck.class){
                if(null == instence){
                    instence = new SingletonWithDoubbleCheck();
                }
            }
        }
        return instence;
    }

    //other methods

}
