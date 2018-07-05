package com.yatsun.arthur;

/**
 * Created by arthur on 02.07.18.
 */
public class Subscriber1 implements PublisherActionListener {
    @Override
    public void doAction(String message) {
        System.out.println(message + " from "+ this.getClass().getName());
    }

}
