package com.yatsun.arthur;

import com.yatsun.arthur.cars.Car;

/**
 * Fabric of creating autos
 */
public class CarSelector {
    public Car getCar(RoadType roadType){
        Car car = null;

        switch (roadType) {
            case CITY:
                car = new Porshe();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }
        return car;
    }
}
