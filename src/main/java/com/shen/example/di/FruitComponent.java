package com.shen.example.di;

import com.shen.example.FruitShop;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = {FruitModule.class})
public interface FruitComponent {
    FruitShop inject();
}
