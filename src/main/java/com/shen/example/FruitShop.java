package com.shen.example;


import com.shen.example.di.FruitType;
import com.shen.example.fruit.Apple;
import com.shen.example.fruit.Fruit;
import dagger.Lazy;
import dagger.Provides;

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
    Fruit orange;

    public String createFruit() {
        return apple.name() + " " + orange.name();
    }

}
