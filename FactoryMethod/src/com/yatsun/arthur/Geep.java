package com.yatsun.arthur;

import com.yatsun.arthur.cars.Car;

public class Geep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 50 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 5 sec");
    }
}
