package com.developer.creational.objectPool;

import java.util.List;

public class Robot  {

    private int id;
    private List<String> features;
    private Components components;

    public Robot(int id, List<String> features, Components components) {
        this.id = id;
        this.features = features;
        this.components = components;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", features=" + features +
                ", components=" + components +
                '}';
    }
}
