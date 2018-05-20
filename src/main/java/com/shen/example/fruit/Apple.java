package com.shen.example.fruit;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Apple implements Fruit {

    @Inject
    public Apple() {

    }

    public String name() {
        return "Apple";
    }
}
