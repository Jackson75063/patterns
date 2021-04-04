package com.developer.creational.factory;

public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer laptop = computerFactory.getComputer("laptop");
        laptop.compute();

        Computer phone = computerFactory.getComputer("Phone");
        phone.compute();

        Computer smartTV = computerFactory.getComputer("SmartTV");
        smartTV.compute();
    }
}
