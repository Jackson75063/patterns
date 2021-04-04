package com.developer.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory computerFactory = FactoryProducer.getFactory(false);

        Computer laptop = computerFactory.getComputer("laptop");
        laptop.compute();

        Computer phone = computerFactory.getComputer("Phone");
        phone.compute();

        Computer smartTV = computerFactory.getComputer("SmartTV");
        smartTV.compute();
    }
}
