package com.zyy.learn.design.observer.weather;

import com.zyy.learn.design.observer.Observer;
import com.zyy.learn.design.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouyinyan on 9/27/16.
 */
public class WeatherData implements Subject {

    private List<Observer> observers ;

    private float temperature ;

    private float humidity ;

    private float pressure ;


    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }


    public float getHumidity() {
        return humidity;
    }


    public float getPressure() {
        return pressure;
    }

    public void measurementChange(){
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(getTemperature(),getHumidity(), getPressure());
        }
    }


    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }
}
