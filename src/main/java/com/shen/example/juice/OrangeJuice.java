package com.shen.example.juice;

import com.shen.example.di.FruitType;
import com.shen.example.fruit.Fruit;

import javax.inject.Inject;

public class OrangeJuice implements Juice {

    private Fruit mOrange;

    @Inject
    public OrangeJuice(@FruitType("orange") Fruit orange) {
        mOrange = orange;
    }

    @Override
    public String name() {
        return mOrange.name();
    }
}