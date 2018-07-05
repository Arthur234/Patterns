package com.yatsun.arthur.state;

/**
 * Created by arthur on 03.07.18.
 */
public class FireState implements TransformerState {
    @Override
    public void action() {
        System.out.println("fire!!!");
    }
}
