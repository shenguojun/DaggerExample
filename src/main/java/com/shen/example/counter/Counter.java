package com.shen.example.counter;

import javax.inject.Inject;

public class Counter {
    @Inject
    public Counter() {
    }

    @Inject
    DirectCounter mDirectCounter;

    @Inject
    ProviderCounter mProviderCounter;

    @Inject
    LazyCounter mLazyCounter;

    @Inject
    LazyCounters mLazyCounters;

    public void print() {
        mDirectCounter.print();
        mProviderCounter.print();
        mLazyCounter.print();
        mLazyCounters.print();
    }
}
