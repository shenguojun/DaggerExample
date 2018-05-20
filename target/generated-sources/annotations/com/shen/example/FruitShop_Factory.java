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

  private final Provider<Fruit> pearProvider;

  public FruitShop_Factory(
      Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider, Provider<Fruit> pearProvider) {
    this.appleProvider = appleProvider;
    this.orangeProvider = orangeProvider;
    this.pearProvider = pearProvider;
  }

  @Override
  public FruitShop get() {
    return provideInstance(appleProvider, orangeProvider, pearProvider);
  }

  public static FruitShop provideInstance(
      Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider, Provider<Fruit> pearProvider) {
    FruitShop instance = new FruitShop();
    FruitShop_MembersInjector.injectApple(instance, appleProvider.get());
    FruitShop_MembersInjector.injectOrange(instance, orangeProvider.get());
    FruitShop_MembersInjector.injectPear(instance, pearProvider.get());
    return instance;
  }

  public static FruitShop_Factory create(
      Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider, Provider<Fruit> pearProvider) {
    return new FruitShop_Factory(appleProvider, orangeProvider, pearProvider);
  }

  public static FruitShop newFruitShop() {
    return new FruitShop();
  }
}
