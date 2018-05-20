package com.shen.example.fruit;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Apple_Factory implements Factory<Apple> {
  private static final Apple_Factory INSTANCE = new Apple_Factory();

  @Override
  public Apple get() {
    return provideInstance();
  }

  public static Apple provideInstance() {
    return new Apple();
  }

  public static Apple_Factory create() {
    return INSTANCE;
  }

  public static Apple newApple() {
    return new Apple();
  }
}
