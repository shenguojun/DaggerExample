package com.shen.example.di;

import com.shen.example.FruitShop;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {FruitModule.class})
public interface FruitComponent {
    FruitShop inject();

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder cusPearName(@Name String name);
//        FruitComponent build();
//    }

}
