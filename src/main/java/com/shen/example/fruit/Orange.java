package com.shen.example.fruit;

import javax.inject.Inject;

public class Orange implements Fruit {

    @Inject
    public Orange() {

    }

    public String name() {
        return "Orange";
    }
}
