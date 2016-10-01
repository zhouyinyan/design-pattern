package com.zyy.learn.design.observer;

/**
 * Created by zhouyinyan on 9/27/16.
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
