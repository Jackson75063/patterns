package com.developer.creational.objectPool;

import java.util.Hashtable;

public abstract class ObjectPool<T> {

    public Hashtable<T, Boolean> checkIn = new Hashtable<>();

    public abstract T create();

    public synchronized void checkOut(T t) {
        checkIn.put(t, false);
    }

    public synchronized T checkIn() {
        for (T t : checkIn.keySet()) {
            if (checkIn.get(t)) {
                return t;
            }
        }
        return null;
    }
}
