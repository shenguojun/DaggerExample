package com.shen.example.di;

import com.shen.example.counter.Counter;
import dagger.Component;

@Component(modules = {CounterModule.class})
public interface CounterComponent {
    Counter inject();
}
