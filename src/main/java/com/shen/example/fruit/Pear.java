package com.shen.example.fruit;

import javax.inject.Singleton;

@Singleton
public class Pear implements Fruit {

    String customName;

    public Pear(String name) {
        customName = name;
    }

    @Override
    public String name() {
        if (customName != null && customName.length() > 0) {
            return customName;
        } else {
            return "pear";
        }
    }
}
