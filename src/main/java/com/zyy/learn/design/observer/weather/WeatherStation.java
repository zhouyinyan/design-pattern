package com.zyy.learn.design.observer.weather;

/**
 * Created by zhouyinyan on 9/27/16.
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);


        weatherData.setMeasurement(80, 65, 24);
        weatherData.setMeasurement(82, 66, 20);
        weatherData.setMeasurement(85, 62, 25);
    }
}
