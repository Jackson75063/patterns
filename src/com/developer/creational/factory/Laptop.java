package com.developer.creational.factory;

public class Laptop implements Computer{
    @Override
    public void compute() {
        System.out.println("Laptop computes");
    }
}
