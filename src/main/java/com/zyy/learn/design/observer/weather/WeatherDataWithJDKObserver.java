package com.zyy.learn.design.observer.weather;

import java.util.Observable;

/**
 * Created by zhouyinyan on 9/27/16.
 */
public class WeatherDataWithJDKObserver extends Observable {

    private float temperature ;

    private float humidity ;

    private float pressure ;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }

    public void measurementChange() {
        setChanged();
        notifyObservers();
    }
}
