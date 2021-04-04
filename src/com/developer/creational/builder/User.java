package com.developer.creational.builder;

public class User {

    private String name;
    private String surname;
    private String phone;

    private User() {
    }

    static class Builder {

        private String name;
        private String surname;
        private String phone;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            User user = new User();
            user.name = this.name;
            user.surname = this.surname;
            user.phone = this.phone;

            return user;
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
