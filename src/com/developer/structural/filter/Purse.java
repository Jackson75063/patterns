package com.developer.structural.filter;

public class Purse extends Store {
    public Colour colour;

    public Purse(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        System.out.println("The colour of the purse is " + colour.toString());
        return colour;
    }

    @Override
    public String toString() {
        return "Purse{" +
                "colour=" + colour +
                '}';
    }
}
