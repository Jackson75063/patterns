package com.developer.creational.prototype;

import java.util.List;

public class Robot implements Cloneable {

    private int id;
    private List<String> features;
    private Components components;

    public Robot(int id, List<String> features, Components components) {
        this.id = id;
        this.features = features;
        this.components = components;
    }

    @Override
    protected Robot clone() {
        try {
            return (Robot) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

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
