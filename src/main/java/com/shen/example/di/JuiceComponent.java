package com.shen.example.di;

import com.shen.example.JuiceShop;
import dagger.Component;

@OtherScop
@Component(dependencies = {FruitComponent.class}, modules = {JuiceModule.class})
public interface JuiceComponent {
    JuiceShop inject();
}
