package com.shen.example.di;

import com.shen.example.FruitShop;
import com.shen.example.FruitShop_Factory;
import com.shen.example.fruit.Apple;
import com.shen.example.fruit.Apple_Factory;
import com.shen.example.fruit.Orange_Factory;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerFruitComponent implements FruitComponent {
  private Provider<Apple> appleProvider;

  private Provider<FruitShop> fruitShopProvider;

  private DaggerFruitComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static FruitComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appleProvider = DoubleCheck.provider(Apple_Factory.create());
    this.fruitShopProvider =
        DoubleCheck.provider(
            FruitShop_Factory.create((Provider) appleProvider, (Provider) Orange_Factory.create()));
  }

  @Override
  public FruitShop inject() {
    return fruitShopProvider.get();
  }

  public static final class Builder {
    private Builder() {}

    public FruitComponent build() {
      return new DaggerFruitComponent(this);
    }
  }
}
