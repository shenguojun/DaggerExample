package com.shen.example.juice;

import com.shen.example.di.FruitType;
import com.shen.example.fruit.Fruit;

import javax.inject.Inject;

public class AppleJuice implements Juice {

    private Fruit mApple;

    @Inject
    public AppleJuice(@FruitType("apple") Fruit apple) {
        mApple = apple;
    }

    @Override
    public String name() {
        return mApple.name();
    }
}
