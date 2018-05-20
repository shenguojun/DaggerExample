package com.shen.example;

import com.shen.example.fruit.Fruit;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FruitShop_Factory implements Factory<FruitShop> {
  private final Provider<Fruit> appleProvider;

  private final Provider<Fruit> orangeProvider;

  public FruitShop_Factory(Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider) {
    this.appleProvider = appleProvider;
    this.orangeProvider = orangeProvider;
  }

  @Override
  public FruitShop get() {
    return provideInstance(appleProvider, orangeProvider);
  }

  public static FruitShop provideInstance(
      Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider) {
    FruitShop instance = new FruitShop();
    FruitShop_MembersInjector.injectApple(instance, appleProvider.get());
    FruitShop_MembersInjector.injectOrange(instance, orangeProvider.get());
    return instance;
  }

  public static FruitShop_Factory create(
      Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider) {
    return new FruitShop_Factory(appleProvider, orangeProvider);
  }

  public static FruitShop newFruitShop() {
    return new FruitShop();
  }
}
