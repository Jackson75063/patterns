package com.developer.creational.builder;

public class Main {
    public static void main(String[] args) {

        User build = new User.Builder()
                .setName("John")
                .setSurname("Johnson")
                .setPhone("345-67-89-012")
                .build();
        System.out.println(build);
    }

}
