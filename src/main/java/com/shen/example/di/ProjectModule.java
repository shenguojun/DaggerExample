package com.shen.example.di;

import com.shen.example.fruit.Fruit;
import com.shen.example.fruit.Pear;
import dagger.Module;
import dagger.Provides;

@Module
public class ProjectModule {

    @Provides @FruitType("pear")
    public Fruit providerPear(@Name String name) {
        return new Pear(name);
    }

//    @Provides @Reusable
//    public Desk provideDesk() {
//        return new Desk();
//    }
//
//    @Provides @IntoSet
//    public String provideOneString() {
//        return "abc";
//    }
}
