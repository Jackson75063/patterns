package com.developer.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> features = new ArrayList<>();
        features.add("Start up");
        features.add("Perform Task");
        features.add("Shut down");
        Components components = new Components();
        components.setName("Infrared Goggles");
        components.setFunctionality("Read temperature of objects");

        Robot robot = new Robot(1, features, components);
        Robot anotherRobot = robot.clone();

        System.out.println(robot.getId());
        System.out.println(robot.getComponents());
        System.out.println(robot.getFeatures());

        System.out.println(anotherRobot.getId());
        System.out.println(anotherRobot.getComponents());
        System.out.println(anotherRobot.getFeatures());

    }
}
