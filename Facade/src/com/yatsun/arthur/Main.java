package com.yatsun.arthur;

import com.yatsun.arthur.facade.CarFacade;
import com.yatsun.arthur.parts.Door;
import com.yatsun.arthur.parts.Fire;
import com.yatsun.arthur.parts.Wheel;

/*
* Скрыть сложную внтуреннюю реализацию и предоставить простой интерфейс
* Упрощение взаимодейтсвия с объектами системы(или нескольких систем)
* Более высокий уровень использования системы
* Можно обращаться и к самим внутрениним объектам(без фасада)
*/
public class Main {

    public static void main(String[] args) {
	// вызов без фасада
        Door door = new Door();
        door.open();

        Fire fire = new Fire();
        fire.fire();

        Wheel wheel = new Wheel();
        wheel.turn();

//        вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
