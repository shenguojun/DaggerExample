package com.shen.example.counter;

import javax.inject.Inject;

/**
 * 直接注入
 */
public class DirectCounter {
    @Inject
    public DirectCounter() {
    }

    @Inject
    Integer value;

    void print() {
        System.out.println("direct counter printing...");
        System.out.println(value);
        System.out.println(value);
        System.out.println(value);
    }
}