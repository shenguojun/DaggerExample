package com.shen.example.fruit;

import javax.inject.Inject;

public class Apple implements Fruit {

    @Inject
    public Apple() {

    }

    public String name() {
        return "Apple";
    }
}
