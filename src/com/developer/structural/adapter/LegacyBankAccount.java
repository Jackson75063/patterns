package com.developer.structural.adapter;

public class LegacyBankAccount {

    private int id;
    private String name;

    public LegacyBankAccount(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
