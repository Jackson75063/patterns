package com.developer.creational.objectPool;

public class Main {

    public static void main(String[] args) {
        ObjectPool objectPool = new RobotsPool();
        Robot firstRobot = (Robot) objectPool.create();
        Robot secondRobot = (Robot) objectPool.create();
        objectPool.checkOut(firstRobot);

        Robot thirdRobot = (Robot) objectPool.checkIn();

    }
}
