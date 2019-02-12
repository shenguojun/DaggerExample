package com.shen.example.di;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@java.lang.annotation.Documented
@java.lang.annotation.Retention(RUNTIME)
@javax.inject.Qualifier
public @interface Wood {
    Color color() default Color.RED;
    enum Color { RED, WHITE }
}