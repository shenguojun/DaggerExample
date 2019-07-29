package com.shen.example.counter;

import dagger.Lazy;

import javax.inject.Inject;

/**
 * Lazy注入
 */
public class LazyCounter {
    @Inject
    public LazyCounter() {
    }

    @Inject
    Lazy<Integer> lazy;

    void print() {
        System.out.println("lazy counter printing...");
        System.out.println(lazy.get());
        System.out.println(lazy.get());
        System.out.println(lazy.get());
    }
}