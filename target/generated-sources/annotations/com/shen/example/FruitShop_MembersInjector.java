package com.shen.example;

import com.shen.example.fruit.Fruit;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FruitShop_MembersInjector implements MembersInjector<FruitShop> {
  private final Provider<Fruit> appleProvider;

  private final Provider<Fruit> orangeProvider;

  public FruitShop_MembersInjector(Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider) {
    this.appleProvider = appleProvider;
    this.orangeProvider = orangeProvider;
  }

  public static MembersInjector<FruitShop> create(
      Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider) {
    return new FruitShop_MembersInjector(appleProvider, orangeProvider);
  }

  @Override
  public void injectMembers(FruitShop instance) {
    injectApple(instance, appleProvider.get());
    injectOrange(instance, orangeProvider.get());
  }

  public static void injectApple(FruitShop instance, Fruit apple) {
    instance.apple = apple;
  }

  public static void injectOrange(FruitShop instance, Fruit orange) {
    instance.orange = orange;
  }
}
