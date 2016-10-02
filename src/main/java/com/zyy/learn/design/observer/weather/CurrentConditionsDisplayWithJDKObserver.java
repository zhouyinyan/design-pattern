package com.zyy.learn.design.observer.weather;

import com.zyy.learn.design.observer.Observer;
import com.zyy.learn.design.observer.Subject;

import java.util.Observable;

/**
 * Created by zhouyinyan on 9/27/16.
 */
public class CurrentConditionsDisplayWithJDKObserver implements DisplayElement, java.util.Observer {

    private float temperature ;

    private float humidity ;

    private float pressure ;

    private Observable subject;

    public CurrentConditionsDisplayWithJDKObserver(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void cancelObserver(){
        subject.deleteObserver(this);
    }

    @Override
    public void display() {
        System.out.println("--当前面板:温度："+this.temperature+", humidity:"+this.humidity + ", pressure"+this.pressure+"--");
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataWithJDKObserver) {
            WeatherDataWithJDKObserver weatherDataWithJDKObserver = (WeatherDataWithJDKObserver) o;
            this.temperature = weatherDataWithJDKObserver.getTemperature();
            this.humidity = weatherDataWithJDKObserver.getHumidity();
            this.pressure = weatherDataWithJDKObserver.getPressure();
            display();
        }
    }
}
