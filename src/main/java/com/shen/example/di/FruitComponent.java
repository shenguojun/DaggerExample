package com.shen.example.di;

import com.shen.example.FruitShop;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {FruitModule.class, ProjectModule.class})
public interface FruitComponent {
    FruitShop inject();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder cusPearName(@Name String name);
        FruitComponent build();
    }

}
