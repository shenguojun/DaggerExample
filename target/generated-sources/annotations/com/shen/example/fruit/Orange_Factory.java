package com.shen.example.fruit;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Orange_Factory implements Factory<Orange> {
  private static final Orange_Factory INSTANCE = new Orange_Factory();

  @Override
  public Orange get() {
    return provideInstance();
  }

  public static Orange provideInstance() {
    return new Orange();
  }

  public static Orange_Factory create() {
    return INSTANCE;
  }

  public static Orange newOrange() {
    return new Orange();
  }
}
