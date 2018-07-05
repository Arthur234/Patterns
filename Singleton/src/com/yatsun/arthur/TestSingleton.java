package com.yatsun.arthur;

public class TestSingleton {

    private static TestSingleton instance;

    //synchronized for multithreating
    public static synchronized TestSingleton getInstance() {
        if(instance == null){
            instance = new TestSingleton();
        }
        return instance;
    }

    /*or this
    * private static final TestSingleTon = new Singleton();
    *
    * public static synchronized TestSingleton getInstance() {
        return instance;
    }
    * */

    private TestSingleton(){}

    public void print(){
        System.out.println(this);
    }
}
