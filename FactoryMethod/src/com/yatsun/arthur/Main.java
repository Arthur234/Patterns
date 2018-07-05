package com.yatsun.arthur;

import com.yatsun.arthur.cars.Car;

/*
* Известен интерфейс, но заранее неизвестно какая реализация будет использоваться
* Получение ссылки на объект в зависимости от входящих условий
*
*/
public class Main {

    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.GAZON);
    }
}
