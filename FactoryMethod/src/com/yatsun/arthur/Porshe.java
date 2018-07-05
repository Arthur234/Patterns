package com.yatsun.arthur;

import com.yatsun.arthur.cars.Car;

/**
 * Created by arthur on 28.06.18.
 */
public class Porshe implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped in 1 sec");
    }
}
