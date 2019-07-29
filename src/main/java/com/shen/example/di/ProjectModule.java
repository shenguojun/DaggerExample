package com.shen.example.di;

import com.google.inject.internal.Nullable;
import com.shen.example.fruit.Fruit;
import com.shen.example.fruit.Pear;
import dagger.Module;
import dagger.Provides;

@Module
public class ProjectModule {

    @Provides @FruitType("pear")
    public Fruit providerPear(@Nullable @Name String name) {
        return new Pear(name);
    }
}
