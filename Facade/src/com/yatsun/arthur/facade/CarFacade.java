package com.yatsun.arthur.facade;

import com.yatsun.arthur.parts.Door;
import com.yatsun.arthur.parts.Fire;
import com.yatsun.arthur.parts.Wheel;

/**
 * Created by arthur on 29.06.18.
 */
public class CarFacade {

    public void go(){
        new Door().open();
        new Fire().fire();
        new Wheel().turn();
    }
}
