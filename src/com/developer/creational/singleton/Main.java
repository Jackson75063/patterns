package com.developer.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLogger instance = SingletonLogger.getInstance();
        instance.logMessageStart();
        instance.logMessageStop();
    }
}
