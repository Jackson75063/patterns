package com.developer.creational.abstractFactory;

public class PortableComputer extends AbstractFactory{

    @Override
    public Computer getComputer(String computer) {
        if (computer.equalsIgnoreCase("Laptop")) {
            return new Laptop();
        }
        else if (computer.equalsIgnoreCase("Phone")) {
            return new Phone();
        }
        return null;
    }
}
