package com.developer.creational.abstractFactory;

public class Laptop implements Computer {
    @Override
    public void compute() {
        System.out.println("Laptop computes");
    }
}
