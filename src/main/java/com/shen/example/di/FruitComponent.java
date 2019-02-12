package com.shen.example.di;

import com.shen.example.FruitShop;
import com.shen.example.fruit.Fruit;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {FruitModule.class})
public interface FruitComponent {
    FruitShop inject();

    @FruitType("apple")
    Fruit getApple();

    @FruitType("orange")
    Fruit getOrange();

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder cusPearName(@Name String name);
//        FruitComponent build();
//    }

}
