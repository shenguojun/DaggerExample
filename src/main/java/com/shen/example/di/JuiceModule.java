package com.shen.example.di;

import com.shen.example.juice.AppleJuice;
import com.shen.example.juice.Juice;
import com.shen.example.juice.OrangeJuice;
import dagger.Binds;
import dagger.Module;

@Module
abstract public class JuiceModule {

    @OtherScop
    @Binds @JuiceType("appleJuice")
    abstract Juice bindAppleJuice(AppleJuice appleJuice);

    @OtherScop
    @Binds @JuiceType("orangeJuice")
    abstract Juice bindOrangeJuice(OrangeJuice orangeJuice);
}
