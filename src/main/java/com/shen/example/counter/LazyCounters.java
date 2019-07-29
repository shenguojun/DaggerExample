package com.shen.example.counter;

import javax.inject.Inject;

/**
 * 多个Lazy注入，lazy与单例
 */
public class LazyCounters {
    @Inject
    public LazyCounters() {
    }

    @Inject
    LazyCounter counter1;
    @Inject
    LazyCounter counter2;

    void print() {
        System.out.println("lazy counters printing...");
        counter1.print();
        counter2.print();
    }
}
