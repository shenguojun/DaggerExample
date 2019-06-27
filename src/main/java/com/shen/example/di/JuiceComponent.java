package com.shen.example.di;

import com.shen.example.JuiceShop;
import dagger.Subcomponent;

@OtherScop
@Subcomponent(modules = {JuiceModule.class})
public interface JuiceComponent {
    JuiceShop inject();

    @Subcomponent.Builder
    interface Builder {
        JuiceComponent build();
    }
}
