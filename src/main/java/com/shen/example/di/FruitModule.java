package com.shen.example.di;

import com.shen.example.fruit.Apple;
import com.shen.example.fruit.Fruit;
import com.shen.example.fruit.Orange;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class FruitModule {
    @Binds @FruitType("apple")
    abstract Fruit bindApple(Apple apple);

    @Binds @FruitType("orange")
    abstract Fruit bindOrange(Orange orange);
}
