package com.shen.example.di;

import dagger.Module;
import dagger.Provides;

@Module
public class CounterModule {
    private int next = 100;

    @Provides
    Integer provideInteger() {
        System.out.println("computing...");
        return next++;
    }
}
