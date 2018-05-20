package com.shen.example;


import com.shen.example.di.FruitType;
import com.shen.example.fruit.Fruit;
import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
public class FruitShop {

    @Inject
    public FruitShop() {

    }

    @Inject @FruitType("apple")
    Fruit apple;

    @Inject @FruitType("orange")
    Provider<Fruit> orange;

    @Inject @FruitType("pear")
    Lazy<Fruit> pear;

    public String createFruit() {
        return apple.name() + " " + orange.get().name() + " " + pear.get().name();
    }

}
