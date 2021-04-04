package com.developer.creational.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean portable) {
        if(portable) {
            return new PortableComputer();
        } else {
            return new ComputerFactory();
        }
    }
}
