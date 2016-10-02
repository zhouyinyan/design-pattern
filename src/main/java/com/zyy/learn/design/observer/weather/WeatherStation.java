package com.zyy.learn.design.observer.weather;

/**
 * Created by zhouyinyan on 9/27/16.
 */
public class WeatherStation {

    public static void main(String[] args){
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentConditionsDisplay =
//                new CurrentConditionsDisplay(weatherData);
//
//
//        weatherData.setMeasurement(80, 65, 24);
//        weatherData.setMeasurement(82, 66, 20);
//        weatherData.setMeasurement(85, 62, 25);


        WeatherDataWithJDKObserver weatherData2 = new WeatherDataWithJDKObserver();
        CurrentConditionsDisplayWithJDKObserver currentConditionsDisplay2 =
                new CurrentConditionsDisplayWithJDKObserver(weatherData2);

        weatherData2.setMeasurement(80, 65, 24);
        weatherData2.setMeasurement(82, 66, 20);
        weatherData2.setMeasurement(85, 62, 25);
    }
}
