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

  private final Provider<Fruit> pearProvider;

  public FruitShop_MembersInjector(
      Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider, Provider<Fruit> pearProvider) {
    this.appleProvider = appleProvider;
    this.orangeProvider = orangeProvider;
    this.pearProvider = pearProvider;
  }

  public static MembersInjector<FruitShop> create(
      Provider<Fruit> appleProvider, Provider<Fruit> orangeProvider, Provider<Fruit> pearProvider) {
    return new FruitShop_MembersInjector(appleProvider, orangeProvider, pearProvider);
  }

  @Override
  public void injectMembers(FruitShop instance) {
    injectApple(instance, appleProvider.get());
    injectOrange(instance, orangeProvider.get());
    injectPear(instance, pearProvider.get());
  }

  public static void injectApple(FruitShop instance, Fruit apple) {
    instance.apple = apple;
  }

  public static void injectOrange(FruitShop instance, Fruit orange) {
    instance.orange = orange;
  }

  public static void injectPear(FruitShop instance, Fruit pear) {
    instance.pear = pear;
  }
}
