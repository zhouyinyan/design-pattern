package com.zyy.learn.design.observer;

/**
 * Created by zhouyinyan on 9/27/16.
 */
public interface Observer {

    public void update(float temperature, float humidity, float pressure);
}
