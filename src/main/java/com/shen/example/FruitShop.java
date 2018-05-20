package com.shen.example;


import com.shen.example.di.FruitType;
import com.shen.example.fruit.Fruit;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FruitShop {

    @Inject
    public FruitShop() {

    }

    @Inject @FruitType("apple")
    Fruit apple;

    @Inject @FruitType("orange")
    Fruit orange;

    @Inject @FruitType("pear")
    Fruit pear;

    public String createFruit() {
        return apple.name() + " " + orange.name() + " " + pear.name();
    }

}
