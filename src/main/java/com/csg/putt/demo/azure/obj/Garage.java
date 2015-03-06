package com.csg.putt.demo.azure.obj;

import java.util.List;

/**
 * Created by dputt on 3/2/15.
 */
public class Garage {

    int garageId;
    List<Car> carsInGarage;

    public int getGarageId() {
        return garageId;
    }

    public void setGarageId(int garageId) {
        this.garageId = garageId;
    }

    public List<Car> getCarsInGarage() {
        return carsInGarage;
    }

    public void setCarsInGarage(List<Car> carsInGarage) {
        this.carsInGarage = carsInGarage;
    }

    public void addCarToGarage(Car c){
        this.carsInGarage.add(c);
    }
}
