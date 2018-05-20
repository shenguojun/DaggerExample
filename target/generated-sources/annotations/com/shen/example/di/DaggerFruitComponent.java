package com.shen.example.di;

import com.shen.example.FruitShop;
import com.shen.example.FruitShop_Factory;
import com.shen.example.fruit.Apple;
import com.shen.example.fruit.Apple_Factory;
import com.shen.example.fruit.Orange_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerFruitComponent implements FruitComponent {
  private Provider<Apple> appleProvider;

  private Provider<String> cusPearNameProvider;

  private ProjectModule_ProviderPearFactory providerPearProvider;

  private Provider<FruitShop> fruitShopProvider;

  private DaggerFruitComponent(Builder builder) {
    initialize(builder);
  }

  public static FruitComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appleProvider = DoubleCheck.provider(Apple_Factory.create());
    this.cusPearNameProvider = InstanceFactory.create(builder.cusPearName);
    this.providerPearProvider =
        ProjectModule_ProviderPearFactory.create(builder.projectModule, cusPearNameProvider);
    this.fruitShopProvider =
        DoubleCheck.provider(
            FruitShop_Factory.create(
                (Provider) appleProvider,
                (Provider) Orange_Factory.create(),
                providerPearProvider));
  }

  @Override
  public FruitShop inject() {
    return fruitShopProvider.get();
  }

  private static final class Builder implements FruitComponent.Builder {
    private ProjectModule projectModule;

    private String cusPearName;

    @Override
    public FruitComponent build() {
      if (projectModule == null) {
        this.projectModule = new ProjectModule();
      }
      if (cusPearName == null) {
        throw new IllegalStateException(String.class.getCanonicalName() + " must be set");
      }
      return new DaggerFruitComponent(this);
    }

    @Override
    public Builder cusPearName(String name) {
      this.cusPearName = Preconditions.checkNotNull(name);
      return this;
    }
  }
}
