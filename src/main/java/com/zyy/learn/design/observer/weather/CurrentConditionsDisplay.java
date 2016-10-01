package com.zyy.learn.design.observer.weather;

import com.zyy.learn.design.observer.Observer;
import com.zyy.learn.design.observer.Subject;

/**
 * Created by zhouyinyan on 9/27/16.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature ;

    private float humidity ;

    private float pressure ;

    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void cancelObserver(){
        subject.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("--当前面板:温度："+this.temperature+", humidity:"+this.humidity + ", pressure"+this.pressure+"--");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }
}
