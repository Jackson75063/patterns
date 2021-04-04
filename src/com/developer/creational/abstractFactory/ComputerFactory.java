package com.developer.creational.abstractFactory;

public class ComputerFactory extends AbstractFactory {

    @Override
    public Computer getComputer(String computer) {
        if (computer.equalsIgnoreCase("Laptop")) {
            return new Laptop();
        }
        else if (computer.equalsIgnoreCase("Phone")) {
            return new Phone();
        }
        else if (computer.equalsIgnoreCase("SmartTV")) {
            return new SmartTv();
        }
        return null;
    }
}