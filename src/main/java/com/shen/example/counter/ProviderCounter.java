package com.shen.example.counter;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Provider注入
 */
public class ProviderCounter {
    @Inject
    public ProviderCounter() {
    }

    @Inject
    Provider<Integer> provider;

    void print() {
        System.out.println("provider counter printing...");
        System.out.println(provider.get());
        System.out.println(provider.get());
        System.out.println(provider.get());
    }
}
