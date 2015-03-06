package com.csg.putt.demo.azure.obj;

import com.mangofactory.swagger.plugin.EnableSwagger;

/**
 * Created by dputt on 2/13/15.
 */

@EnableSwagger
public class Car {
    int carId;
    int year;
    String make;
    String model;
    String series;


    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
