package com.developer.creational.objectPool;

public class Components {

    private String name;
    private String functionality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunctionality() {
        return functionality;
    }

    public void setFunctionality(String functionality) {
        this.functionality = functionality;
    }

    @Override
    public String toString() {
        return "Components{" +
                "name='" + name + '\'' +
                ", functionality='" + functionality + '\'' +
                '}';
    }
}
