package com.developer.structural.bridge;

public class Red implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}
