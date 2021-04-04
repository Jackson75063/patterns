package com.developer.creational.singleton;

public class SingletonLogger {

    private static SingletonLogger instance;

    public SingletonLogger() { }

    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void logMessageStart() {
        System.out.println("Start message is logged");
    }

    public void logMessageStop() {
        System.out.println("Stop message is logged");
    }
}
